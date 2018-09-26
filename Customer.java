import java.util.ArrayList;
import java.util.List;
/**
 * Create new account and check the validation
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    public String name;
    public String password;
    public String level;
    public String address;
    public String paymentInfo;
    public String email;
    public List<Product> products = new ArrayList<Product>();
    
    public Customer()
    {
        name="";
        password="";
        level="";
        address="";
        paymentInfo="";
        email="";
    }
    
    public Customer(Account account)
    {
        name=account.verifyid;
    }
    
    public Customer(Customer customer)
    {
        this.name=customer.name;
        this.password=customer.password;
        this.level=customer.level;
        this.address=customer.address;
        this.paymentInfo=customer.paymentInfo;
        this.email=customer.email;
    }
    

    public Customer(String name1, String password1, String level1, String address1, String paymentInfo1, String email1)
    {
        this.name=name;
        this.password=password;
        this.level=level;
        this.address=address;
        this.paymentInfo=paymentInfo;
        this.email=email;
    }

    public boolean modify()
    {
        // put your code here
        return true;
    }
    
    public List<Product> search()
    {
        // put your code here
        return this.products;
    }
    
    
}
