import java.util.ArrayList;
import java.util.List;
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StoreOwner
{
    // instance variables - replace the example below with your own
    public String name;   
    public String email;
    public String phone;
    public List<Product> products = new ArrayList<Product>();

    /**
     * Constructor for objects of class Customer
     */
    public StoreOwner()
    {
        // initialise instance variables
        this.name = "";
        this.email = "";
        this.phone = "";
    }
    
     public StoreOwner(Account account)
    {
        name = account.verifyid;
    
    }
    
      public StoreOwner(StoreOwner storeowner)
    {
        this.name = storeowner.name;
        this.email = storeowner.email;
        this.phone = storeowner.phone;    
    }

    public StoreOwner(String name, String level, String address, String email, String paymentinfo, String phone)
    {
        this.name = name;        
        this.email = email;;
        this.phone = phone;
    }
    
    boolean createProduct()
    {
        return true;
    }
    
    boolean deleteProduct()
    {
        return true;
    }
    
    boolean modifyProduct()
    {
        return true;
    }
    
    public List<Product> search()
    {
        
        return this.products;
    }
}
