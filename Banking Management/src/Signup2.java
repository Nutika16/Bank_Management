
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

public class Signup2 extends JFrame implements ActionListener {

  long fnum;
  JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
  JRadioButton r1, r2, r3, r4;
  JTextField t1, t2;
  JComboBox c1, c2, c3, c4, c5;
  JButton b;
  String formno;

  Signup2(String formno) {

    setLayout(null);
    // setUndecorated(true);

    this.formno = formno;
    setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

    l1 = new JLabel("Page 2: Additonal Details");
    l1.setFont(new Font("Raleway", 1, 22));
    l1.setBounds(280, 30, 600, 40);
    add(l1);

    l2 = new JLabel("Religion:");
    l2.setFont(new Font("Raleway", 1, 18));
    l2.setBounds(100, 120, 100, 30);
    add(l2);

    String[] religion = { "Hindu", "Muslim", "Sikh", "Christian", "Other" };
    c1 = new JComboBox(religion);
    c1.setBackground(Color.WHITE);
    c1.setFont(new Font("Raleway", 1, 14));
    c1.setBounds(350, 120, 320, 30);
    add(c1);

    l3 = new JLabel("Category:");
    l3.setFont(new Font("Raleway", 1, 18));
    l3.setBounds(100, 170, 100, 30);
    add(l3);

    String[] category = { "General", "OBC", "SC", "ST", "Other" };
    c2 = new JComboBox(category);
    c2.setBackground(Color.WHITE);
    c2.setFont(new Font("Raleway", 1, 14));
    c2.setBounds(350, 170, 320, 30);
    add(c2);

    l4 = new JLabel("Income:");
    l4.setFont(new Font("Raleway", 1, 18));
    l4.setBounds(100, 220, 100, 30);
    add(l4);

    String[] income = { "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000" };
    c3 = new JComboBox(income);
    c3.setBackground(Color.WHITE);
    c3.setFont(new Font("Raleway", 1, 14));
    c3.setBounds(350, 220, 320, 30);
    add(c3);

    l5 = new JLabel("Educational");
    l11 = new JLabel("Qualification:");
    l11.setFont(new Font("Raleway", 1, 18));
    l5.setFont(new Font("Raleway", 1, 18));
    l5.setBounds(100, 270, 150, 30);
    l11.setBounds(100, 290, 150, 30);
    add(l11);
    add(l5);

    String[] education = { "Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others" };
    c4 = new JComboBox(education);
    c4.setBackground(Color.WHITE);
    c4.setFont(new Font("Raleway", 1, 14));
    c4.setBounds(350, 270, 320, 30);
    add(c4);

    l6 = new JLabel("Occupation:");
    l6.setFont(new Font("Raleway", 1, 18));
    l6.setBounds(100, 340, 150, 30);
    add(l6);

    String[] occupation = { "Salaried", "Self-Employmed", "Business", "Student", "Retired", "Others" };
    c5 = new javax.swing.JComboBox(occupation);
    c5.setBackground(Color.WHITE);
    c5.setFont(new Font("Raleway", 1, 14));
    c5.setBounds(350, 340, 320, 30);
    add(c5);

    l7 = new JLabel("PAN Number:");
    l7.setFont(new Font("Raleway", 1, 18));
    l7.setBounds(100, 390, 150, 30);
    add(l7);

    l8 = new JLabel("Aadhar Number:");
    l8.setFont(new Font("Raleway", 1, 18));
    l8.setBounds(100, 440, 180, 30);
    add(l8);

    l9 = new JLabel("Senior Citizen:");
    l9.setFont(new Font("Raleway", 1, 18));
    l9.setBounds(100, 490, 150, 30);
    add(l9);
    r1 = new JRadioButton("Yes");
    r1.setFont(new Font("Raleway", 1, 14));
    r1.setBackground(new Color(204, 255, 255));
    r1.setBounds(350, 490, 100, 30);
    add(r1);
    r2 = new javax.swing.JRadioButton("No");
    r2.setFont(new Font("Raleway", 1, 14));
    r2.setBackground(new Color(204, 255, 255));
    r2.setBounds(460, 490, 100, 30);
    add(r2);

    ButtonGroup groupgender = new ButtonGroup();
    groupgender.add(r1);
    groupgender.add(r2);

    l10 = new JLabel("Existing Account:");
    l10.setFont(new Font("Raleway", 1, 18));
    l10.setBounds(100, 540, 180, 30);
    add(l10);
    r3 = new JRadioButton("Yes");
    r3.setFont(new Font("Raleway", 1, 14));
    r3.setBackground(new Color(204, 255, 255));
    r3.setBounds(350, 540, 100, 30);
    add(r3);
    r4 = new JRadioButton("No");
    r4.setFont(new Font("Raleway", 1, 14));
    r4.setBackground(new Color(204, 255, 255));
    r4.setBounds(460, 540, 100, 30);
    add(r4);

    ButtonGroup groupgender1 = new ButtonGroup();
    groupgender1.add(r3);
    groupgender1.add(r4);

    l12 = new JLabel("Form No:");
    l12.setFont(new Font("Raleway", 1, 13));
    l12.setBounds(700, 10, 60, 30);
    add(l12);

    l13 = new JLabel(formno);
    l13.setFont(new Font("Raleway", 1, 13));
    l13.setBounds(760, 10, 60, 30);
    add(l13);

    t2 = new JTextField();
    t2.setFont(new Font("Raleway", 1, 14));
    t2.setBounds(350, 440, 320, 30);
    add(t2);

    t1 = new JTextField();
    t1.setFont(new Font("Raleway", 1, 14));
    t1.setBounds(350, 390, 320, 30);
    add(t1);

    b = new JButton("NEXT PAGE>>");
    b.setFont(new Font("Raleway", 1, 13));
    b.setBackground(Color.BLACK);
    b.setForeground(Color.WHITE);
    b.setBounds(350, 650, 140, 35);
    add(b);
    b.addActionListener(this);

    getContentPane().setBackground(new Color(204, 255, 255));

    setSize(850, 790);
    // setLocation(500, 120);
    setVisible(true);
  }

  public void actionPerformed(ActionEvent ae) {
    // String formno = "" + fnum;
    String sreligion = (String) c1.getSelectedItem();
    String scategory = (String) c2.getSelectedItem();
    String sincome = (String) c3.getSelectedItem();
    String seducation = (String) c4.getSelectedItem();
    String soccupation = (String) c5.getSelectedItem();

    String pan = t1.getText();
    String aadhar = t2.getText();

    String scitizen = "";
    if (r1.isSelected()) {
      scitizen = "Yes";
    } else if (r2.isSelected()) {
      scitizen = "No";
    }

    String eaccount = "";
    if (r3.isSelected()) {
      eaccount = "Yes";
    } else if (r4.isSelected()) {
      eaccount = "No";
    }
    try {
      if (t2.getText().equals("")) {
        javax.swing.JOptionPane.showMessageDialog(null, "Fill all the required fields");
      } else {
        ConnectionSql c = new ConnectionSql();
        String q1 = "insert into signup2 values('" + formno + "','" + sreligion + "','" + scategory + "','" + sincome
            + "','" + seducation + "','" + soccupation + "','" + pan + "','" + aadhar + "','" + scitizen + "','"
            + eaccount + "')";
        c.s.executeUpdate(q1);

        setVisible(false);
        new Signup3(formno).setVisible(true);

      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

  public static void main(String[] args) {
    new Signup2("");
  }

}
