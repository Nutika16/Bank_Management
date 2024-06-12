
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author Adarsh Kunal
 */

public class Signup3 extends JFrame implements ActionListener {

  JRadioButton r1, r2, r3, r4;
  JButton b1, b2;
  JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
  JCheckBox c1, c2, c3, c4, c5, c6, c7;
  String formno;

  Signup3(String formno) {
    this.formno = formno;

    setUndecorated(true);
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");

    l1 = new JLabel("Page 3: Account Details");
    l1.setFont(new Font("Raleway", 1, 22));
    l1.setBounds(280, 40, 400, 40);
    add(l1);

    l2 = new JLabel("Account Type:");
    l2.setFont(new Font("Raleway", 1, 18));
    l2.setBounds(100, 140, 200, 30);
    add(l2);

    l3 = new JLabel("Account No:");
    l3.setFont(new Font("Raleway", 1, 18));
    l3.setBounds(100, 300, 200, 30);
    add(l3);

    l4 = new JLabel("XXXX-XXXX-XXXX-418");
    l4.setFont(new Font("Raleway", 1, 18));
    l4.setBounds(330, 300, 250, 30);
    add(l4);

    l5 = new JLabel("(Your 16-digit Account number)");
    l5.setFont(new Font("Raleway", 1, 12));
    l5.setBounds(100, 330, 200, 20);
    add(l5);

    l6 = new JLabel("It would appear on Account/Cheque Book and Statements");
    l6.setFont(new Font("Raleway", 1, 12));
    l6.setBounds(330, 330, 500, 20);
    add(l6);

    l7 = new JLabel("Password:");
    l7.setFont(new Font("Raleway", 1, 18));
    l7.setBounds(100, 370, 200, 30);
    add(l7);

    l8 = new JLabel("XXXXXX");
    l8.setFont(new Font("Raleway", 1, 18));
    l8.setBounds(330, 370, 200, 30);
    add(l8);

    l9 = new JLabel("(4-digit password)");
    l9.setFont(new Font("Raleway", 1, 12));
    l9.setBounds(100, 400, 200, 20);
    add(l9);

    l10 = new JLabel("Services Required:");
    l10.setFont(new Font("Raleway", 1, 18));
    l10.setBounds(100, 450, 200, 30);
    add(l10);

    l11 = new JLabel("Form No:");
    l11.setFont(new Font("Raleway", 1, 14));
    l11.setBounds(700, 10, 70, 30);
    add(l11);

    l12 = new JLabel(formno);
    l12.setFont(new Font("Raleway", 1, 14));
    l12.setBounds(770, 10, 40, 30);
    add(l12);

    c1 = new JCheckBox("ATM Card");
    c1.setBackground(new Color(204, 255, 255));
    c1.setFont(new Font("Raleway", 1, 16));
    c1.setBounds(100, 500, 200, 30);
    add(c1);

    c2 = new JCheckBox("Internet Banking");
    c2.setBackground(new Color(204, 255, 255));
    c2.setFont(new Font("Raleway", 1, 16));
    c2.setBounds(350, 500, 200, 30);
    add(c2);

    c3 = new JCheckBox("Mobile Banking");
    c3.setBackground(new Color(204, 255, 255));
    c3.setFont(new Font("Raleway", 1, 16));
    c3.setBounds(100, 550, 200, 30);
    add(c3);

    c4 = new JCheckBox("Email Alerts");
    c4.setBackground(new Color(204, 255, 255));
    c4.setFont(new Font("Raleway", 1, 16));
    c4.setBounds(350, 550, 200, 30);
    add(c4);

    c5 = new JCheckBox("Cheque Book");
    c5.setBackground(new Color(204, 255, 255));
    c5.setFont(new Font("Raleway", 1, 16));
    c5.setBounds(100, 600, 200, 30);
    add(c5);

    c6 = new JCheckBox("E-Statement");
    c6.setBackground(new Color(204, 255, 255));
    c6.setFont(new Font("Raleway", 1, 16));
    c6.setBounds(350, 600, 200, 30);
    add(c6);

    c7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.", true);
    c7.setBackground(new Color(204, 255, 255));
    c7.setFont(new Font("Raleway", 1, 13));
    c7.setBounds(100, 680, 600, 20);
    add(c7);

    r1 = new JRadioButton("Saving Account");
    r1.setFont(new Font("Raleway", 1, 16));
    r1.setBackground(new Color(204, 255, 255));
    r1.setBounds(100, 180, 150, 30);
    add(r1);

    r2 = new JRadioButton("Fixed Deposit Account");
    r2.setFont(new Font("Raleway", 1, 16));
    r2.setBackground(new Color(204, 255, 255));
    r2.setBounds(350, 180, 300, 30);
    add(r2);

    r3 = new JRadioButton("Current Account");
    r3.setFont(new Font("Raleway", 1, 16));
    r3.setBackground(new Color(204, 255, 255));
    r3.setBounds(100, 220, 250, 30);
    add(r3);

    r4 = new JRadioButton("Recurring Deposit Account");
    r4.setFont(new Font("Raleway", 1, 16));
    r4.setBackground(new Color(204, 255, 255));
    r4.setBounds(350, 220, 250, 30);
    add(r4);

    ButtonGroup groupgender = new ButtonGroup();
    groupgender.add(r1);
    groupgender.add(r2);
    groupgender.add(r3);
    groupgender.add(r4);

    b1 = new JButton("SUBMIT");
    b1.setFont(new Font("Raleway", 1, 15));
    b1.setBackground(Color.BLACK);
    b1.setForeground(Color.WHITE);
    b1.setBounds(250, 720, 100, 35);
    add(b1);
    b1.addActionListener(this);

    b2 = new JButton("CANCEL");
    b2.setFont(new Font("Raleway", 1, 15));
    b2.setBackground(Color.BLACK);
    b2.setForeground(Color.WHITE);
    b2.setBounds(420, 720, 100, 35);
    add(b2);
    b2.addActionListener(this);

    setLayout(null);
    getContentPane().setBackground(new Color(204, 255, 255));
    setSize(850, 850);
    setVisible(true);

  }

  public void actionPerformed(ActionEvent ae) {
    String atype = null;
    if (r1.isSelected()) {
      atype = "Saving Account";
    } else if (r2.isSelected()) {
      atype = "Fixed Deposit Account";
    } else if (r3.isSelected()) {
      atype = "Current Account";
    } else if (r4.isSelected()) {
      atype = "Recurring Deposit Account";
    }

    Random ran = new Random();
    long first7 = ran.nextLong() % 90000000L + 35406000000000L;
    String Accountno = "" + Math.abs(first7);

    long first5 = ran.nextLong() % 90000L + 100000L;
    String pin = "" + Math.abs(first5);

    String facility = "";
    if (c1.isSelected()) {
      facility = facility + " ATM Card";
    }
    if (c2.isSelected()) {
      facility = facility + " Internet Banking";
    }
    if (c3.isSelected()) {
      facility = facility + " Mobile Banking";
    }
    if (c4.isSelected()) {
      facility = facility + " Email Alerts";
    }
    if (c5.isSelected()) {
      facility = facility + " Cheque Book";
    }
    if (c6.isSelected()) {
      facility = facility + " E-Statement";
    }
    try {
      if (ae.getSource() == b1) {
        if (atype.equals("")) {
          JOptionPane.showMessageDialog(null, "Fill all the required fields");
        } else {
          ConnectionSql c = new ConnectionSql();
          String q1 = "insert into signup3 values('" + formno + "','" + atype + "','" + Accountno + "','" + pin + "','"
              + facility + "')";
          c.s.executeUpdate(q1);

          String q2 = "insert into login values('" + formno + "','" + Accountno + "','" + pin + "')";
          c.s.executeUpdate(q2);

          JOptionPane.showMessageDialog(null, "Congratulation!!\n Dear Customer, your Account are Successfully Opened."
              + "\n Account Number: " + Accountno + "\n Password:" + pin + "\n Thank You For Opening Account.");

          // new Deposit(pin, Accountno).setVisible(true);
          // setVisible(false);
        }
      } else if (ae.getSource() == b2) {
        setVisible(false);
        new Login1().setVisible(true);
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new Signup3("");

  }

}
