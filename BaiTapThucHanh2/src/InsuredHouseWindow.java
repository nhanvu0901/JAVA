import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InsuredHouseWindow implements ActionListener {
    private JFrame frame = new JFrame("Insured House Window");
    private JLabel labelHousePrice = new JLabel("House Price");
    private JLabel labelYear = new JLabel("Buying year");
    private JLabel labelHouseHold = new JLabel("Household Value");
    private JTextField textFieldHouse = new JTextField();
    private JTextField textFieldYEar = new JTextField();
    private JTextField textFieldHouseHold = new JTextField();
    private JTextField textField = new JTextField();
    private JButton button = new JButton("Calculate insurace");
    public InsuredHouseWindow() {

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setLayout(null);

        labelHousePrice.setBounds(50,0,100,30);
        labelYear.setBounds(50,50,80,30);
        labelHouseHold.setBounds(50,100,100,30);

        textFieldHouse.setBounds(200,0,100,30);
        textFieldYEar.setBounds(200,50,80,30);
        textFieldHouseHold.setBounds(200,100,100,30);
        textField.setBounds(200,200,80,30);
        textField.setEditable(false);

        frame.add(labelHousePrice);
        frame.add(labelYear);
        frame.add(labelHouseHold);
        frame.add(textFieldHouse);
        frame.add(textFieldYEar);
        frame.add(textFieldHouseHold);
        frame.add(textField);

        button.setBounds(50,150,120,30);
        button.addActionListener(this);

        frame.add(button);



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s1 = textFieldYEar.getText();
        String s2 = textFieldHouse.getText();
        String s3 = textFieldHouseHold.getText();
        int a= 2020-Integer.parseInt(s1); // chuyen string ve dang so
        int b=Integer.parseInt(s2);
        int c =Integer.parseInt(s3);
        int answear = 0;
        if(e.getSource() == button)
            answear = a * ( b + c);
        String result=String.valueOf(answear);
        textField.setText(result);
    }
}
