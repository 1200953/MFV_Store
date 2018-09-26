
/**
 * Write a description of class Customer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Customer
{
    // instance variables - replace the example below with your own
    public String name;
    public String level;
    public String address;
    public String email;
    public String paymentinfo;

    /**
     * Constructor for objects of class Customer
     */
    public Customer()
    {
        // initialise instance variables
        this.name = "";
        this.level = "";
        this.address = "";
        this.email = "";
        this.paymentinfo = "";
    }

    public Customer(String name, String level, String address, String email, String paymentinfo)
    {
        this.name = name;
        this.level = level;
        this.address = address;
        this.email = email;
        this.paymentinfo = paymentinfo;
    }
}
