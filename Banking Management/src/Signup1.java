
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author Adarsh Kunal
 */

public class Signup1 extends JFrame implements ActionListener {

    long fnum;
    JTextField nameTextField, fnameTextField, mnameTextField, dobTextField, emailTextField, addressTextField,
            cityTextField, stateTextField, natTextField;
    JButton next;
    JRadioButton male, female, other, married, unmarried;
    JButton npage;
    boolean True;

    Signup1() {

        setLayout(null);
        // setUndecorated(true);

        Random ran = new Random();
        fnum = (Math.abs(ran.nextLong() % 900L + 100000L));

        JLabel fromno = new JLabel("APPLICATION FORM NO:" + fnum);
        fromno.setFont(new Font("Raleway", Font.BOLD, 40));
        fromno.setBounds(150, 30, 800, 40);
        add(fromno);

        JLabel pdetails = new JLabel("PERSONAL DETAILS");
        pdetails.setFont(new Font("Raleway", Font.BOLD, 20));
        pdetails.setBounds(300, 90, 600, 30);
        add(pdetails);

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 18));
        name.setBounds(100, 150, 100, 30);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setBounds(250, 150, 400, 28);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 18));
        fname.setBounds(100, 200, 190, 30);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setBounds(250, 200, 400, 28);
        add(fnameTextField);

        JLabel mname = new JLabel("Mother's Name:");
        mname.setFont(new Font("Raleway", Font.BOLD, 18));
        mname.setBounds(100, 250, 190, 30);
        add(mname);
        mnameTextField = new JTextField();
        mnameTextField.setBounds(250, 250, 400, 28);
        add(mnameTextField);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 18));
        gender.setBounds(100, 300, 190, 30);
        add(gender);
        male = new JRadioButton("Male");
        male.setBounds(250, 300, 60, 30);
        male.setBackground(new Color(204, 255, 255));
        male.setFont(new Font("Raleway", Font.BOLD, 15));
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(370, 300, 80, 30);
        female.setBackground(new Color(204, 255, 255));
        female.setFont(new Font("Raleway", Font.BOLD, 15));
        add(female);

        ButtonGroup gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 18));
        dob.setBounds(100, 350, 190, 30);
        add(dob);
        dobTextField = new JTextField();
        dobTextField.setBounds(250, 350, 400, 28);
        add(dobTextField);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 18));
        email.setBounds(100, 400, 190, 30);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setBounds(250, 400, 400, 28);
        add(emailTextField);

        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 18));
        marital.setBounds(100, 450, 190, 30);
        add(marital);

        married = new JRadioButton("Married");
        married.setBounds(250, 450, 100, 30);
        married.setBackground(new Color(204, 255, 255));
        married.setFont(new Font("Raleway", Font.BOLD, 15));
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(380, 450, 120, 30);
        unmarried.setBackground(new Color(204, 255, 255));
        unmarried.setFont(new Font("Raleway", Font.BOLD, 15));
        add(unmarried);

        other = new JRadioButton("Other");
        other.setBounds(540, 450, 100, 30);
        other.setBackground(new Color(204, 255, 255));
        other.setFont(new Font("Raleway", Font.BOLD, 15));
        add(other);

        ButtonGroup gendergroup2 = new ButtonGroup();
        gendergroup2.add(married);
        gendergroup2.add(unmarried);
        gendergroup2.add(other);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 18));
        address.setBounds(100, 500, 190, 30);
        add(address);
        addressTextField = new JTextField();
        addressTextField.setBounds(250, 500, 500, 28);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 18));
        city.setBounds(100, 550, 190, 30);
        add(city);
        cityTextField = new JTextField();
        cityTextField.setBounds(250, 550, 400, 28);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 18));
        state.setBounds(100, 600, 190, 30);
        add(state);
        stateTextField = new JTextField();
        stateTextField.setBounds(250, 600, 400, 28);
        add(stateTextField);

        JLabel nat = new JLabel("Nationality:");
        nat.setFont(new Font("Raleway", Font.BOLD, 18));
        nat.setBounds(100, 650, 190, 30);
        add(nat);
        natTextField = new JTextField();
        natTextField.setBounds(250, 650, 400, 28);
        add(natTextField);

        npage = new JButton("NEXT PAGE");
        npage.setBounds(360, 710, 120, 35);
        npage.setBackground(Color.black);
        npage.setForeground(Color.white);
        npage.addActionListener(this);
        add(npage);

        getContentPane().setBackground(new Color(204, 255, 255));
        setSize(850, 850);
        setVisible(true);
    }

    public void actionPerformed(final ActionEvent ae) {

        String formno = "" + fnum;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String mname = mnameTextField.getText();
        String gender = null;
        if (male.isSelected()) {
            gender = "Male";
        } else if (female.isSelected()) {
            gender = "Female";

        }
        String dob = dobTextField.getText();
        String email = emailTextField.getText();
        String marital = "null";
        if (married.isSelected()) {
            marital = "Married";
        } else if (unmarried.isSelected()) {
            marital = "Unmarried";
        } else if (other.isSelected()) {
            marital = "Other";
        }
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String nat = natTextField.getText();

        try {
            if (name.equals("")) {
                JOptionPane.showMessageDialog(null, "Name is must be Required");
            } else {
                ConnectionSql c = new ConnectionSql();
                String query = "Insert into signup1 value('" + formno + "','" + name + "','" + fname + "','" + mname
                        + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','"
                        + city + "','" + state + "','" + nat + "')";
                c.s.executeUpdate(query);
                setVisible(false);
                new Signup2(formno).setVisible(true);
            }

        } catch (Exception e) {
            System.out.println(e);

        }
    }

    public static void main(final String[] args) {
        new Signup1();
    }
}
