/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import javax.swing.UIManager.LookAndFeelInfo;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.border.Border;
import javax.swing.*;


public class LogininUI extends JFrame {

    private JMenuBar menuBar;
    private JButton Login;
    private JLabel System_Title;
    private JButton button1;
    private JButton button2;
    private JLabel label2;
    private JPasswordField passwordfield1;
    private JLabel passwordl;
    private JTextField userfield1;
    private JLabel useridl;

    //Constructor 
    public LogininUI(){

        this.setTitle("MFV Management System");
        this.setSize(572,360);
        //menu generate method
        generateMenu();
        this.setJMenuBar(menuBar);

        //pane with null layout
        JPanel contentPane = new JPanel(null);
        contentPane.setPreferredSize(new Dimension(572,360));
        contentPane.setBackground(new Color(192,192,191));


        Login = new JButton();
        Login.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent arg0){
              //add account validation here
              JOptionPane.showMessageDialog(null, "you are sucessfully logined");
              
           
          }
          });
        
        Login.setBounds(184,275,90,35);
        Login.setBackground(new Color(214,217,223));
        Login.setForeground(new Color(0,0,0));
        Login.setEnabled(true);
        Login.setFont(new Font("sansserif",0,12));
        Login.setText("Login");
        Login.setVisible(true);

        System_Title = new JLabel();
        System_Title.setBounds(153,26,305,59);
        System_Title.setBackground(new Color(214,217,223));
        System_Title.setForeground(new Color(0,0,0));
        System_Title.setEnabled(true);
        System_Title.setFont(new Font("SansSerif",1,20));
        System_Title.setText("MFV MANAGEMENT SYSTEM");
        System_Title.setVisible(true);

        button1 = new JButton();
        button1.setBounds(286,274,90,35);
        button1.setBackground(new Color(214,217,223));
        button1.setForeground(new Color(0,0,0));
        button1.setEnabled(true);
        button1.setFont(new Font("sansserif",0,12));
        button1.setText("Signup");
        button1.setVisible(true);

        button2 = new JButton();
        button2.setBounds(387,274,90,35);
        button2.setBackground(new Color(214,217,223));
        button2.setForeground(new Color(0,0,0));
        button2.setEnabled(true);
        button2.setFont(new Font("sansserif",0,12));
        button2.setText("Quit");
        button2.setVisible(true);

        label2 = new JLabel();
        label2.setBounds(67,126,90,35);
        label2.setBackground(new Color(214,217,223));
        label2.setForeground(new Color(0,0,0));
        label2.setEnabled(true);
        label2.setFont(new Font("SansSerif",1,15));
        label2.setText("Username");
        label2.setVisible(false);

        passwordfield1 = new JPasswordField();
        passwordfield1.setBounds(222,175,167,41);
        passwordfield1.setBackground(new Color(255,255,255));
        passwordfield1.setForeground(new Color(0,0,0));
        passwordfield1.setEnabled(true);
        passwordfield1.setFont(new Font("sansserif",0,12));
        passwordfield1.setVisible(true);

        passwordl = new JLabel();
        passwordl.setBounds(129,180,90,35);
        passwordl.setBackground(new Color(214,217,223));
        passwordl.setForeground(new Color(0,0,0));
        passwordl.setEnabled(true);
        passwordl.setFont(new Font("SansSerif",1,17));
        passwordl.setText("Password:");
        passwordl.setVisible(true);

        userfield1 = new JTextField();
        userfield1.setBounds(222,112,167,41);
        userfield1.setBackground(new Color(255,255,255));
        userfield1.setForeground(new Color(0,0,0));
        userfield1.setEnabled(true);
        userfield1.setFont(new Font("sansserif",0,12));
        userfield1.setText("");
        userfield1.setVisible(true);

        useridl = new JLabel();
        useridl.setBounds(143,115,81,36);
        useridl.setBackground(new Color(214,217,223));
        useridl.setForeground(new Color(0,0,0));
        useridl.setEnabled(true);
        useridl.setFont(new Font("SansSerif",1,17));
        useridl.setText("User ID:");
        useridl.setVisible(true);

        //adding components to contentPane panel
        contentPane.add(Login);
        contentPane.add(System_Title);
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(label2);
        contentPane.add(passwordfield1);
        contentPane.add(passwordl);
        contentPane.add(userfield1);
        contentPane.add(useridl);

        //adding panel to JFrame and seting of window position and close operation
        this.add(contentPane);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.pack();
        this.setVisible(true);
    }

    //method for generate menu
    public void generateMenu(){
        menuBar = new JMenuBar();

        JMenu help = new JMenu("Help");

        JMenuItem about = new JMenuItem("About   ");
        JMenuItem hop = new JMenuItem("hop   ");


        help.add(about);

        menuBar.add(help);
    }



    public static void main(String[] args){
         
        System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new LogininUI();
            }
        });
    }

}