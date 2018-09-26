
/**
 * Write a description of class User here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class User
{
    // instance variables - replace the example below with your own
    public String name;
    public String level;
    public String address;
    public String email;
    public String paymentinfo;
    public String phone;

    /**
     * Constructor for objects of class Customer
     */
    public User()
    {
        // initialise instance variables
        this.name = "";
        this.level = "";
        this.address = "";
        this.email = "";
        this.paymentinfo = "";
        this.phone = "";
    }

    public User(String name, String level, String address, String email, String paymentinfo, String phone)
    {
        this.name = name;
        this.level = level;
        this.address = address;
        this.email = email;
        this.paymentinfo = paymentinfo;
        this.phone = phone;
    }
}
