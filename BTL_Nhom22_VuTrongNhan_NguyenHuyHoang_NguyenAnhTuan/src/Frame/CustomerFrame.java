package Frame;


import Model.Customer;

import java.awt.Font;
import java.awt.Frame;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.border.MatteBorder;

import javax.swing.table.DefaultTableModel;
import javax.swing.JLayeredPane;
import javax.swing.JMenuBar;
import java.awt.CardLayout;
import java.awt.Color;

public class CustomerFrame extends JFrame {

    /**
     *
     */
    private JButton btnNewButton_6;
    private JButton btnNewButton_7;
    private JButton btnNewButton_8;
    private JMenuBar menuBar;
    private JPanel contentPane;
    JLayeredPane layeredPane = new JLayeredPane();

    JDialog dialog = new JDialog();

    DefaultTableModel model = new DefaultTableModel();



    /**
     * Launch the application.
     */


    public CustomerFrame() {

        layoutComponent();
    }

    /**
     * Create the frame.
     */
    public void layoutComponent() {
        setExtendedState(Frame.MAXIMIZED_BOTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1609, 838);


        contentPane = new JPanel();
        contentPane.setBackground(new Color(255, 255, 255));
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        layeredPane.setBounds(259, 67, 1258, 744);
        contentPane.add(layeredPane);
        layeredPane.setLayout(new CardLayout(0, 0));

        JPanel panelCustomer = new JPanel();
        panelCustomer.setBackground(new Color(255, 255, 255));
        layeredPane.add(panelCustomer, "detailForm");


        JPanel panelShopping = new JPanel();
        panelShopping.setBackground(Color.WHITE);
        layeredPane.add(panelShopping, "accountForm");









        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics grphcs) {
                super.paintComponent(grphcs);
                Graphics2D g2d = (Graphics2D) grphcs;
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                        RenderingHints.VALUE_ANTIALIAS_ON);
                Color color1 = new Color(32, 136, 203);
                Color color2 = Color.PINK;
                GradientPaint gp = new GradientPaint(0, 0, color1, 180, getHeight(), color2);
                g2d.setPaint(gp);
                g2d.fillRect(0, 0, getWidth(), getHeight());

            }

        };
        panel.setBorder(new MatteBorder(0, 0, 0, 2, Color.BLACK));
        panel.setBounds(0, 0, 259, 811);
        contentPane.add(panel);
        panel.setLayout(null);



        JButton btnNewButton_1 = new JButton("Kh\u00E1ch h\u00E0ng");
        btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1.setBounds(42, 155, 144, 71);
        panel.add(btnNewButton_1);

        JButton btnNewButton_1_1 = new JButton("Gi\u1ECF h\u00E0ng");
        btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnNewButton_1_1.setBounds(42, 311, 144, 59);
        panel.add(btnNewButton_1_1);

        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        btnNewButton_6 = new JButton("Store Frame");
        btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {


               StoreFrame store = new StoreFrame();
                store.setVisible(true);
                dispose();

            }
        });
        menuBar.add(btnNewButton_6);

        btnNewButton_7 = new JButton("Customer Frame");
        btnNewButton_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {


                CustomerFrame store = new CustomerFrame();
                store.setVisible(true);
                dispose();

            }
        });
        menuBar.add(btnNewButton_7);

        btnNewButton_8 = new JButton("Main Frame");
        btnNewButton_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {


                MainFrame store = new MainFrame();
                store.setVisible(true);
                dispose();

            }
        });
        menuBar.add(btnNewButton_8);



    }
    public void switchPanel(JPanel panel) {
        layeredPane.removeAll();
        layeredPane.add(panel);
        layeredPane.repaint();
        layeredPane.revalidate();
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
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerFrame().setVisible(true);
            }
        });
    }}
/*JButton btnPanelTable = new JButton("Danh Sách Nhân Viên");
btnPanelTable.setForeground(Color.WHITE);
btnPanelTable.setIcon(new ImageIcon(CustomerFrame.class.getResource("/assets/employee-1.png")));
btnPanelTable.setOpaque(false); // background of parent will be painted first
btnPanelTable.setBackground(new Color(250, 250, 250, 20));
btnPanelTable.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		switchPanel(panelTable);
	}
});
panelTable.setLayout(null);*/