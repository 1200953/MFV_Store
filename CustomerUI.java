import java.awt.*;  
import javax.swing.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*; 
import java.awt.event.ItemListener;  
import java.awt.event.ItemEvent; 
import java.util.Date; 
import java.text.SimpleDateFormat;  
import java.awt.Desktop;
import java.io.File;
public class CustomerUI extends JDialog
{
    // instance variables - replace the example below with your own
    public Customer customer;
    public JPanel jp1,jp2,jp3,jp4;
    public JLabel jlbcate,jlblocaltion,jlbsarary,jlbnewcate;
    public JTextField jtflocaltion,jtfsarary;
    JComboBox  jtfcate;
    public JButton jbback,jbexit,jbcreate,jbmodify,jbdel,jbsearch,jbsend,jbrecv;
    private String oldcate="";
    public JPasswordField jtfpwd1,jtfpwd2;

    /**
     * Constructor for objects of class CustomerUI
     */
    public CustomerUI(Account account)
    {
        this.customer = new Customer(account);
        this.setModal(true);
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        jp4 = new JPanel();
        
        jbback=new JButton("Back");
        jbexit=new JButton("Exit");
		
        jbcreate=new JButton("Create");
        jbmodify=new JButton("Modify");
        jbdel=new JButton("Delete");

		
        jbsearch=new JButton("Jobs");
        jbsend=new JButton("Send");
        jbrecv=new JButton("Receive");
        
        jlbcate=new JLabel("Category");
        jlblocaltion=new JLabel("ProduName");
        jlbsarary=new JLabel("Sarary"); 
        
        
        jtfcate=new JComboBox();
        jtflocaltion =new JTextField(10);
        jtfsarary=new JTextField(10);
          
        this.setLayout(new GridLayout(4, 1));
        
        initcate();
		getSkill();
          
        jp1.add(jlbcate);  
        jp1.add(jtfcate); 
        jp1.add(jlblocaltion);  
        jp1.add(jtflocaltion);
        jp1.add(jlbsarary);
        jp1.add(jtfsarary); 
        jp2.add(jbcreate);
        jp2.add(jbmodify); 
        jp2.add(jbdel);
        jp3.add(jbsearch);
        //jp3.add(jbsend);
        jp3.add(jbrecv);
        jp4.add(jbback);
        jp4.add(jbexit); 
          
        this.add(jp1);  
        this.add(jp2);  
        this.add(jp3); 
        this.add(jp4);  

		jtfcate.setEditable(true);
        
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
