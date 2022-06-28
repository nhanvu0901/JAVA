import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsuredCarWindow implements ActionListener {
    private JFrame frame = new JFrame("Insured Car Window");
    private JLabel labelBrand = new JLabel("Car brand");
    private JLabel labelNumber = new JLabel("Car Number");
    private JLabel labelYear = new JLabel("Car isurance year ");
    private JLabel labelRate = new JLabel("User rate");
    private JLabel labelMoney = new JLabel("Insurance money");
    private JTextField textFieldBrand = new JTextField();
    private JTextField textFieldNumber = new JTextField();
    private JTextField textFieldYear = new JTextField();
    private JTextField textFieldRate = new JTextField();
    private JTextField textFieldMoney = new JTextField();
    private JTextField textField = new JTextField();
    private JButton button = new JButton("Calculate");
    public InsuredCarWindow() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);
        labelBrand.setBounds(50,0,80,30);
        labelNumber.setBounds(50,50,80,30);
        labelRate.setBounds(50,100,80,30);
        labelYear.setBounds(50,150,150,30);
        labelMoney.setBounds(50,200,150,30);

        frame.add(labelBrand);
        frame.add(labelNumber);
        frame.add(labelRate);
        frame.add(labelYear);
        frame.add(labelMoney);

        textFieldBrand.setBounds(200,0,80,30);
        textFieldNumber.setBounds(200,50,80,30);
        textFieldRate.setBounds(200,100,80,30);
        textFieldYear.setBounds(200,150,80,30);
        textFieldMoney.setBounds(200,200,80,30);
        textField.setBounds(200,300,100,30);
        textField.setEditable(false);

        frame.add(textFieldBrand);
        frame.add(textFieldNumber);
        frame.add(textFieldRate);
        frame.add(textFieldYear);
        frame.add(textFieldMoney);
        frame.add(textField);

        button.setBounds(200,250,100,30);
        button.addActionListener(this);
        frame.add(button);




    }

    @Override
    public void actionPerformed(ActionEvent e) {
         String s1 = textFieldYear.getText();
         String s2 = textFieldMoney.getText();
        int a= 2020-Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int answear = 0;
        if(e.getSource() == button)
            answear = a * b;
        String result=String.valueOf(answear);
        textField.setText(result);
    }
}