
import java.awt.*;  
import javax.swing.*;  
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyMsgBox extends JDialog {  
      
    public JPanel jp1,jp2,jp3; 
    public JLabel jlb1,jlb2;  
    public JButton jb1;  
     
    public MyMsgBox(String msg){  
        this.setModal(true);
          
        jp1=new JPanel();  
        jp2=new JPanel();  
        jp3=new JPanel();  
        
        jlb1=new JLabel(msg);  
        
        jb1=new JButton("OK");  
        
          
         
        this.setLayout(new GridLayout(3, 1));  
          
          
        jp1.add(jlb1);  
        
          
        jp3.add(jb1);  
          
          
        this.add(jp1);  
        this.add(jp2);  
        this.add(jp3);  
          
        jb1.addActionListener(new ActionListener() {
           @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });        
        init();
          
    } 
    
    public void clickon()
    {
        dispose();
    }
    
    public void init()
    {  
        this.setTitle("Message"); 
        this.setSize(300, 150);  
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);  
        this.setVisible(true);
        this.setResizable(false);  
        
        
    }
}  