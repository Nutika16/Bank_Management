
package banking.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.Date;
import java.sql.*;

/**
 *
 * @author Adarsh Kunal
 */

public class Deposit extends JFrame implements ActionListener 
{

    JLabel l1, l3;
    JTextField t1;
    JButton b1, b2;
    String pin;
    String Accountno;
    Deposit(String pin, String Accountno) {
        this.pin = pin;
        this.Accountno= Accountno;
        setLayout(null);     
         ImageIcon h1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
         Image h2 = h1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
         ImageIcon h3 = new ImageIcon(h2);  
         JLabel label = new JLabel(h3);
         label.setBounds(70, 30, 100, 100);
         add(label);
        
        
        ImageIcon j1 = new ImageIcon(ClassLoader.getSystemResource("icons/deposit1.jpg"));
        Image j2 = j1.getImage().getScaledInstance(800, 800, Image.SCALE_DEFAULT);
        ImageIcon j3 = new ImageIcon(j2);
        JLabel label6 = new JLabel(j3);
        label6.setBounds(800, 0, 800, 800);
        add(label6);
     
        JLabel text = new JLabel("Dear Customer,Welcome");
        text.setFont(new Font("Osward", Font.BOLD, 32));
        text.setForeground(Color.black);
        text.setBounds(200, 70, 450, 40);
        add(text);
        
        JLabel l1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT:");
        l1.setFont(new Font("Osward", Font.BOLD,20));
        l1.setForeground(Color.black);
        l1.setBounds(220, 220, 440, 40);
        add(l1);
        
        
        t1 = new JTextField();
        t1.setFont(new Font("Raleway", 1, 20));
        t1.setBounds(220, 280, 500, 40);
        t1.setBackground(Color.white);
        add(t1);
  
        
        b1 = new JButton("DEPOSIT");
        b1.setBounds(570, 400, 150, 40);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.white);
        b1.setFont(new Font("Raleway", 1, 15));
        
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("BACK");
        b2.setBounds(570, 458, 150, 40);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.white);
        b2.setFont(new Font("Raleway", 1, 15));
        b2.addActionListener(this);
        add(b2);

       getContentPane().setBackground(new Color(204, 229, 255));
        setSize(1600, 1200);
       // setUndecorated(true);
        // setLocation(500, 0);
        setVisible(true);
    }

//    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            String amount = t1.getText();
            Date date = new Date();
            this.Accountno=Accountno;
            if (ae.getSource() == b1) {
                if (t1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount to you want to Deposit");
                } else {
                    ConnectionSql c = new ConnectionSql();
                    c.s.executeUpdate("insert into bank values('" + pin + "', '" + Accountno + "', '" + date + "', 'Deposit', '" + amount + "')");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Deposited Successfully");
                    
                    setVisible(false);
                    new Transactions(pin,Accountno).setVisible(true);
                }
            } else if (ae.getSource() == this.b2) {
                this.setVisible(false);
                new Transactions(pin,Accountno).setVisible(true);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
   }

    public static void main(String[] args) {
        new Deposit("", "");
    }
}