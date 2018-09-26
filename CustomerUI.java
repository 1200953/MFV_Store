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
    public CUser customer;
    public JPanel jp1,jp2;
    public JLabel jlbcate,jlbname,jlbnewcate;
    public JTextField jtfname;
    JComboBox  jtfcate;
    public JButton jbback,jbexit,jbmodify,jbsearch;
    private String oldcate="";
    public JPasswordField jtfpwd1,jtfpwd2;

    /**
     * Constructor for objects of class CustomerUI
     */
    public CustomerUI(Account account)
    {
        this.customer = new CUser(account);
        this.setModal(true);
        jp1 = new JPanel();
        jp2 = new JPanel();
        jp3 = new JPanel();
        
        
        jbback=new JButton("Back");
        jbexit=new JButton("Exit");
		
        
        
               
        jlbcate=new JLabel("Category");
        jlbname=new JLabel("ProductName");
        jbsearch=new JButton("Search");
        
        
        
        jtfcate=new JComboBox();
        jtfname =new JTextField(10);
        
          
        this.setLayout(new GridLayout(2, 1));
        
        initcate();
	getSkill();
          
        jp1.add(jlbcate);  
        jp1.add(jtfcate); 
        jp1.add(jlbname);  
        jp1.add(jtfname); 
        jp1.add(jbsearch);
        //jp3.add(jbsend);
        ;
        jp2.add(jbback);
        jp2.add(jbexit); 
          
        this.add(jp1);  
        this.add(jp2);  
         
          

	jtfcate.setEditable(true);
        
	jbsearch.addActionListener(new ActionListener() 
        {
           @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                search();
                }
                catch(Exception ex)
                {
                    MyMsgBox mbox = new MyMsgBox(ex.getMessage());
                }
            }
        }); 
		
        
		
       
        
        jbback.addActionListener(new ActionListener() 
        {
           @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                   dispose();
                }
                catch(Exception ex)
                {
                    MyMsgBox mbox = new MyMsgBox(ex.getMessage());
                }
            }
        }); 
        
        jbexit.addActionListener(new ActionListener() 
        {
           @Override
            public void actionPerformed(ActionEvent e) {
                try
                {
                    exit();
                }
                catch(Exception ex)
                {
                    MyMsgBox mbox = new MyMsgBox(ex.getMessage());
                }
            }
        }); 
          
        
        
               
    }

    public void exit()
    {
        MyMsgBox mbox = new MyMsgBox("Login Out OJSS Successed!");
        System.exit(0);
    }
    
    public void init() throws Exception
    {
        this.setTitle("MVF SYSTEM");
        this.setSize(600, 300);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);  
        this.setVisible(true);
        this.setResizable(false);  
    }  
    
    public void initcate()
    {
        try
        {
            jtfcate.removeAllItems(); 
            String strsql="select distinct([cate]) from [categories] order by [cate] ";
			 
            ConnectAccess ca=new ConnectAccess();  
            ca.OpenAccessFile();
            ResultSet rs = ca.GetSet(strsql);
            while (rs.next()) 
            {
                jtfcate.addItem(rs.getString(1));  
            }
            rs.close();
            ca.CloseAccessFile();
            this.jtfcate.setSelectedItem("");
        } 
        catch(Exception e)
        {
            MyMsgBox mbox = new MyMsgBox(e.getMessage());
        }
    }




public void search()
    {
        try
        {
        JobSearchUI job = new JobSearchUI(this.seeker);
				   job.init();
        } 
        catch(Exception e)
        {
            MyMsgBox mbox = new MyMsgBox(e.getMessage());
        }
    }


}
