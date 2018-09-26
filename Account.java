
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    // instance variables - replace the example below with your own
    public String verifyid;
    public String password;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
        this.verifyid = "";
        this.password ="";
    }

    public Account(String verifyid, String password)
    {
        this.verifyid = verifyid;
        this.password = password;
    }
}
