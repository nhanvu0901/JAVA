import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Gui {
    static JFrame frame = new JFrame("Insured");
    static JButton button1 = new JButton("Insured Car");
    static JButton button2 = new JButton("Insured House");
    static JButton button3 = new JButton("Insured Income");
    static JTextField textFieldName = new JTextField();
    static JTextField textFieldAge = new JTextField();
    static JTextField textFieldAddress = new JTextField();
    static JLabel labelName = new JLabel("Username");
    static JLabel labelAge = new JLabel("Age");
    static JLabel labelAddress = new JLabel("Address");
    static JPanel panel = new JPanel();
    public Gui() {
        frame.getContentPane().setBackground(Color.RED);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

        button1.setBounds(50,0,200,50);
        button1.setFocusable(false);
        button1.setBorder(BorderFactory.createCompoundBorder());
        button2.setBounds(50, 50,200,50);
        button2.setFocusable(false);
        button3.setBounds(50,100,200,50);
        button3.setFocusable(false);

        labelName.setBounds(50,200,80,30);
        labelName.setForeground(Color.black);
        labelAge.setBounds(50,250,80,30);
        labelAge.setForeground(Color.black);
        labelAddress.setBounds(50,300,80,30);
        labelAddress.setForeground(Color.black);

        frame.add(labelName);
        frame.add(labelAge);
        frame.add(labelAddress);

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new InsuredCarWindow();
            }
        });

        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new InsuredHouseWindow();
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                new InsuredIncome();
            }
        });
        textFieldName.setBounds(150,200,80,30);
        textFieldName.setBorder(BorderFactory.createEtchedBorder());
        textFieldAge.setBounds(150,250,80,30);
        textFieldAddress.setBounds(150,300,80,30);

        panel.setBackground(new Color(138, 43, 226));
        panel.setBounds(29, 25, 671, 294);
        frame.getContentPane().add(panel);

        frame.add(textFieldName);
        frame.add(textFieldAge);
        frame.add(textFieldAddress);

        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new Gui();
    }
}