package swingExample;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javafx.scene.text.Font;
import javax.swing.*;
public class LoginGUI implements ActionListener {
    JFrame f;
    JPanel p;
    JLabel headingLbl, unLbl, pwdLbl;
    JTextField unTxt;
    JPasswordField pwd;
    JButton loginBtn, resetBtn, exitBtn;
    public LoginGUI(){
        f= new JFrame("Login System");
        f.setSize(500, 300);
        p = new JPanel();
        p.setLayout(null);
        p.setBackground(Color.red);
        headingLbl = new JLabel("Login System");
        headingLbl.setBounds(100, 10, 100, 20);
        unLbl = new JLabel("Username: ");
        unLbl.setBounds(100, 50, 100, 20);
        unTxt = new JTextField();
        unTxt.setBounds(220, 50, 100, 20);
        
        pwdLbl = new JLabel("Password: ");
        pwdLbl.setBounds(100, 90, 100, 20);
        pwd = new JPasswordField();
        pwd.setBounds(220, 90, 100, 20);
        
        loginBtn = new JButton("Login");
        loginBtn.setBounds(100, 130, 80, 20);
        loginBtn.addActionListener(this);
        
        resetBtn = new JButton("Reset");
        resetBtn.setBounds(220, 130, 80, 20);
        resetBtn.addActionListener(this);
        
        exitBtn = new JButton("Exit");
        exitBtn.setBounds(320, 130, 80, 20);
        exitBtn.addActionListener(this);
        
        f.add(p);
        p.add(headingLbl);
        p.add(unLbl);
        p.add(unTxt);
        p.add(pwdLbl);
        p.add(pwd);
        p.add(loginBtn);
        p.add(resetBtn);
        p.add(exitBtn);
        f.setVisible(true);
    }
    public void resetFields(){
        unTxt.setText(null);
        pwd.setText(null);
        
    }
    public static void main(String[] args) {
        LoginGUI l = new LoginGUI();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == loginBtn){
            if(unTxt.getText().equals("admin") && pwd.getText().equals("admin")){
                JOptionPane.showMessageDialog(null,"You are Sucessfully Loggged in");
                f.setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null,"Login Error");
            }
        }
        else if(e.getSource() == resetBtn){
            resetFields();
        }
        else if(e.getSource() == exitBtn){
            f.setVisible(false);
            System.exit(0);
        }
    }
}
