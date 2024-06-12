
/**
 *@author Adarsh Kunal
 **/
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transactions extends JFrame implements ActionListener {
  JLabel l1;
  JButton b1, b2, b3, b4, b5, b6, b7;
  String pin;
  String Accountno;

  Transactions(String pin, String Accountno) {
    this.Accountno = Accountno;
    this.pin = pin;

    setLayout(null);

    setTitle("Transaction Machine");

    ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/transs.png"));
    Image h2 = h1.getImage().getScaledInstance(791, 751, Image.SCALE_DEFAULT);
    ImageIcon h3 = new ImageIcon(h2);
    JLabel image1 = new JLabel(h3);
    image1.setBounds(700, 10, 791, 751);
    add(image1);

    // ImageIcon p1 = new
    // ImageIcon(ClassLoader.getSystemResource("icons/deposit1.jpg"));
    // Image p2 = p1.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
    // ImageIcon p3 = new ImageIcon(p2);
    // JLabel image3 = new JLabel(p3);
    // image1.setBounds(400,400,500,500);
    // add(image3);

    JLabel text = new JLabel("WELCOME TO THE BANK ");
    text.setFont(new Font("Osward", Font.BOLD, 32));
    text.setBounds(200, 40, 450, 40);
    text.setForeground(Color.white);
    add(text);

    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
    Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
    ImageIcon i3 = new ImageIcon(i2);
    JLabel label = new JLabel(i3);
    label.setBounds(70, 10, 100, 100);
    add(label);

    l1 = new JLabel("Please Select Your Transaction");
    l1.setForeground(Color.WHITE);
    l1.setFont(new Font("System", 1, 20));
    l1.setFont(new Font("Arial", Font.BOLD, 20));
    l1.setBounds(150, 120, 500, 55);
    add(l1);

    b1 = new JButton("DEPOSIT");
    b1.setBounds(150, 180, 180, 45);
    b1.setBackground(new Color(204, 229, 255));
    b1.setFont(new Font("Arial", Font.BOLD, 13));
    b1.setForeground(Color.BLACK);
    b1.addActionListener(this);
    add(b1);

    b2 = new JButton("WITHDRAWL");
    b2.setBounds(400, 180, 180, 45);
    b2.setBackground(new Color(204, 229, 255));
    b2.setFont(new Font("Arial", Font.BOLD, 13));
    b2.setForeground(Color.black);
    b2.addActionListener(this);
    add(b2);

    b3 = new JButton("FAST-CASH");
    b3.setBounds(150, 250, 180, 45);
    b3.setBackground(new Color(204, 229, 255));
    b3.setFont(new Font("Arial", Font.BOLD, 13));
    b3.setForeground(Color.black);
    b3.addActionListener(this);
    add(b3);

    b4 = new JButton("MINI STATEMENT");
    b4.setBounds(400, 250, 180, 45);
    b4.setBackground(new Color(204, 229, 255));
    b4.setFont(new Font("Arial", Font.BOLD, 13));
    b4.setForeground(Color.black);
    b4.addActionListener(this);
    add(b4);

    b5 = new JButton("CHANGE PASSWORD");
    b5.setBounds(150, 330, 180, 45);
    b5.setBackground(new Color(204, 229, 255));
    b5.setFont(new Font("Arial", Font.BOLD, 13));
    b5.setForeground(Color.black);
    b5.addActionListener(this);
    add(b5);

    b6 = new JButton("BALANCE ENQUIRY");
    b6.setBounds(400, 330, 180, 45);
    b6.setBackground(new Color(204, 229, 255));
    b6.setFont(new Font("Arial", Font.BOLD, 13));
    b6.setForeground(Color.black);
    b6.addActionListener(this);
    add(b6);

    b7 = new JButton("SIGN-OUT");
    b7.setBounds(300, 410, 180, 45);
    b7.setBackground(new Color(190, 229, 255));
    b7.setFont(new Font("Arial", Font.BOLD, 13));
    b7.setForeground(Color.black);
    b7.addActionListener(this);
    add(b7);

    getContentPane().setBackground(new Color(0, 51, 102));
    setSize(1600, 1200);
    setVisible(true);
  }

  // String pin;

  public void actionPerformed(ActionEvent ae) {

    if (ae.getSource() == b1) {
      setVisible(false);
      new Deposit(this.pin, this.Accountno).setVisible(true);

    } else if (ae.getSource() == b2) {
      setVisible(false);
      new Withdrawl(this.pin, this.Accountno).setVisible(true);

    } else if (ae.getSource() == b3) {
      setVisible(false);
      new FastCash(this.pin, this.Accountno).setVisible(true);

    } else if (ae.getSource() == b4) {
      new MiniStatement(this.pin, this.Accountno).setVisible(true);

    } else if (ae.getSource() == b5) {
      setVisible(false);
      new Pin(this.pin, this.Accountno).setVisible(true);

    } else if (ae.getSource() == b6) {
      setVisible(false);
      new BalanceEnquiry(this.pin, this.Accountno).setVisible(true);

    } else if (ae.getSource() == b7) {
      System.exit(0);
    }
  }

  public static void main(String[] args) {
    new Transactions("", "");
  }
}