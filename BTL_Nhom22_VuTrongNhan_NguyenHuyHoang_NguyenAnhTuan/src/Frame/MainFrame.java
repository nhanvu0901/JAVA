package Frame;

import Model.Employee;
import Model.Store;
import Modify.EmployeeModify;
import Modify.StoreModify;

import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.text.MaskFormatter;

import Database.DBConnection;


public class MainFrame extends javax.swing.JFrame {
    DefaultTableModel tableModel;

    List<Store> storeList = new ArrayList<>();

    DefaultTableModel tableModel1;

    List<Employee> EmployeeList = new ArrayList<>();

    public MainFrame() {
        initComponents();

        tableModel = (DefaultTableModel) tblStore.getModel();

        showStore();

        tableModel1 = (DefaultTableModel) tblEmployee.getModel();

        showEmployee();
    }
    private void showEmployee() {
        EmployeeList = EmployeeModify.findAll();

        tableModel1.setRowCount(0);

        EmployeeList.forEach((Employee) -> {
            tableModel1.addRow(new Object[]{Employee.getEmployee_id(), Employee.getEmployee_name(),
                    Employee.getEmployee_gender(), Employee.getEmployee_gmail(), Employee.getEmployee_password(),Employee.getEmployee_job(),Employee.getEmployee_shift()});
        });
    }
    private void showStore() { // tao mot list de lay du lieu tu database
        storeList = StoreModify.findAll();

        tableModel.setRowCount(0);

        storeList.forEach((store) -> {
            tableModel.addRow(new Object[]{store.getFood_id(),
                    store.getFood_name(), store.getFood_kind(), store.getFood_number(), store.getFood_price(), store.getFood_dateInput(), store.getFood_dayMade(), store.getFood_expired(), store.getFood_origin()});
        });

    }





    @SuppressWarnings("unchecked")

    private void initComponents() {

        frame.getContentPane().setBackground(Color.GRAY);
        frame.getContentPane().setForeground(Color.RED);
        frame.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                showStore();
            }
        });
        frame.getContentPane().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                showEmployee();
            }
        });
        frame.setBounds(100, 100, 1297, 546);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setLocationRelativeTo(null);


        JScrollPane scrollPane = new JScrollPane();
        scrollPane.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                showStore();
            }
        });
        scrollPane.setBounds(550, 45, 749, 439);

        tblStore = new JTable(tableModel);
        tblStore.setAutoCreateRowSorter(true);

        tblStore.setModel(new DefaultTableModel(
                new Object[][]{
                },
                new String[]{
                        "M\u00E3 s\u1EA3n ph\u1EA9m", "T\u00EAn s\u1EA3n ph\u1EA9m", "Loai s\u1EA3n ph\u1EA9m", "S\u1ED1 l\u01B0\u1EE3ng", "Gi\u00E1 c\u1EA3", "Ng\u00E0y nh\u1EADp", "Ng\u00E0y SX", "H\u1EA1n SD", "Xu\u1EA5t x\u1EE9"
                }
        ));
        tblStore.getColumnModel().getColumn(0).setPreferredWidth(84);
        tblStore.getColumnModel().getColumn(1).setPreferredWidth(80);
        scrollPane.setViewportView(tblStore);
        frame.getContentPane().add(scrollPane);


        JScrollPane scrollPane_1 = new JScrollPane();
        scrollPane_1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                showEmployee();
            }
        });
        scrollPane_1.setBounds(0, 45, 541, 439);
        tblEmployee = new JTable(tableModel1);
        tblEmployee.setAutoCreateRowSorter(true);

        tblEmployee.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "ID", "Họ và tên", "Giới tính", "Email", "Password","Chức vụ","Ca làm việc"
                }
        ));
        tblEmployee.getColumnModel().getColumn(0).setPreferredWidth(84);
        tblEmployee.getColumnModel().getColumn(1).setPreferredWidth(80);
        scrollPane_1.setViewportView(tblEmployee);
        frame.getContentPane().add(scrollPane_1);

        JLabel lblNewLabel = new JLabel("DANH S\u00C1CH NH\u00C2N VI\u00CAN");
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel.setBounds(168, 20, 198, 14);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("H\u00C0NG TRONG KHO");
        lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblNewLabel_1.setBounds(809, 20, 198, 14);
        frame.getContentPane().add(lblNewLabel_1);







        JMenuBar menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        JButton btnNewButton = new JButton("Store Frame");
        btnNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                frame.dispose();
                StoreFrame store = new StoreFrame();
                store.setVisible(true);

            }
        });
        menuBar.add(btnNewButton);

        JButton btnNewButton_1 = new JButton("Customer Frame");
        btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {

                frame.dispose();
                CustomerFrame store = new CustomerFrame();
                store.setVisible(true);

            }
        });
        menuBar.add(btnNewButton_1);

        JButton btnNewButton_2 = new JButton("Main Frame");
        btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {


            }
        });
        menuBar.add(btnNewButton_2);





    }





    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().frame.setVisible(true);
            }
        });
    }
    public void setVisible(boolean visible){
        frame.setVisible(true);
    }
    static JFrame frame = new JFrame("Manager");
    static MaskFormatter df;
    private javax.swing.JTable tblStore;
    private javax.swing.JTable tblEmployee;
}



