package banking.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FastCash extends JFrame implements ActionListener {
    String pin;
    String accountNo;

    FastCash(String pin, String accountNo) {
        this.pin = pin;
        this.accountNo = accountNo;

        setTitle("Fast Cash");
        setLayout(null);

        JLabel text = new JLabel("Select Withdrawal Amount");
        text.setFont(new Font("System", Font.BOLD, 22));
        text.setBounds(200, 150, 400, 40);
        add(text);

        JButton amount1 = new JButton("100");
        amount1.setBounds(150, 200, 150, 40);
        amount1.addActionListener(this);
        add(amount1);

        JButton amount2 = new JButton("500");
        amount2.setBounds(350, 200, 150, 40);
        amount2.addActionListener(this);
        add(amount2);

        JButton amount3 = new JButton("1000");
        amount3.setBounds(150, 250, 150, 40);
        amount3.addActionListener(this);
        add(amount3);

        JButton amount4 = new JButton("2000");
        amount4.setBounds(350, 250, 150, 40);
        amount4.addActionListener(this);
        add(amount4);

        JButton amount5 = new JButton("5000");
        amount5.setBounds(150, 300, 150, 40);
        amount5.addActionListener(this);
        add(amount5);

        JButton amount6 = new JButton("10000");
        amount6.setBounds(350, 300, 150, 40);
        amount6.addActionListener(this);
        add(amount6);

        JButton back = new JButton("Back");
        back.setBounds(250, 400, 150, 40);
        back.addActionListener(this);
        add(back);

        setSize(600, 600);
        setLocation(300, 0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String amount = ((JButton) ae.getSource()).getText();
        // Logic to handle the withdrawal amount goes here
        JOptionPane.showMessageDialog(null, "Amount " + amount + " has been withdrawn");

        // Close current window and open transactions window
        setVisible(false);
        new Transactions(pin, accountNo).setVisible(true);
    }

    public static void main(String[] args) {
        new FastCash("", "");
    }
}
