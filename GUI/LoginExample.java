package GUI;
import java.awt.Color;
import javax.swing.*;
public class LoginExample {
    public LoginExample(){
        JFrame f = new JFrame("Login System");
        f.setSize(300,150);
        JPanel p = new JPanel();
        p.setLayout(null);
        JLabel usernameL,passwordL;
        usernameL = new JLabel("Username: ");
        usernameL.setBounds(50,30,100,20);
        JTextField usernameT = new JTextField();
        usernameT.setBounds(130,30,100,20);
        passwordL = new JLabel("Password: ");
        passwordL.setBounds(50,70,100,20);
        JPasswordField passwordP = new JPasswordField();
        passwordP.setBounds(130,70,100,20);
        f.add(p);
        p.add(usernameL);
        p.add(usernameT);
        p.add(passwordL);
        p.add(passwordP);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new LoginExample();
    }
}
