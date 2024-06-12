
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

/**
 *
 * @author Adarsh Kunal
 */

public class MiniStatement extends JFrame implements ActionListener {

    JButton b1, b2;
    JLabel l1;
    JButton close;
    String pin;
    String Accountno;

    MiniStatement(String pin, String Accountno) {

        super("Mini Statement");

        setLayout(null);
        this.Accountno = Accountno;
        this.pin = pin;

        getContentPane().setBackground(new Color(204, 229, 255));
        setSize(400, 600);
        setLocation(700, 50);

        l1 = new JLabel();
        add(l1);
        l1.setBounds(20, 140, 400, 200);

        JLabel l2 = new JLabel("Welecome to the Bank");
        l2.setBounds(130, 20, 150, 20);
        add(l2);

        JLabel l3 = new JLabel();
        l3.setBounds(20, 80, 300, 20);
        add(l3);

        JLabel l4 = new JLabel();
        l4.setBounds(20, 400, 300, 20);
        add(l4);

        close = new JButton("CLOSE");
        close.setBounds(150, 500, 90, 25);
        close.setBackground(Color.black);
        close.setForeground(Color.white);
        close.addActionListener(this);
        add(close);

        // b1 = new JButton("Exit");
        // add(b1);
        // b1.setBounds(20, 400, 100, 25);
        // b1.addActionListener(this);
        //

        try {
            ConnectionSql c = new ConnectionSql();
            ResultSet rs = c.s.executeQuery(
                    "select * from login where Account_No = '" + Accountno + "' and Login_Password = '" + pin + "'");
            while (rs.next()) {
                l3.setText("Account Number: " + rs.getString("Account_No").substring(0, 4) + "XXXXXXXX"
                        + rs.getString("Account_No").substring(12));
            }
        } catch (Exception e) {
        }

        try {
            int bal = 0;
            ConnectionSql c1 = new ConnectionSql();
            ResultSet rs = c1.s.executeQuery(
                    "SELECT * FROM bank where Account_No = '" + Accountno + "' and Login_Password = '" + pin + "'");
            while (rs.next()) {
                l1.setText(l1.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                        + rs.getString("amount") + "<br><br><html>");
                if (rs.getString("type").equals("Deposit")) {
                    bal += Integer.parseInt(rs.getString("amount"));
                } else {
                    bal -= Integer.parseInt(rs.getString("amount"));
                }
            }
            l4.setText("Your total Balance is: Rs" + bal);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void actionPerformed(ActionEvent ae) {
        this.setVisible(false);
        if (ae.getSource() == this.close) {
            this.setVisible(false);
            new Transactions(pin, Accountno).setVisible(true);
        }

    }

    public static void main(String[] args) {
        new MiniStatement("", "");
    }

}