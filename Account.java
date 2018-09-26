
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
    public String level;
    public String author;

    /**
     * Constructor for objects of class Account
     */
    public Account()
    {
        // initialise instance variables
        this.verifyid = "";
        this.password ="";
        this.level="";
        this.author="";
    }

    public Account(String verifyid, String password, String level, String author)
    {
        this.verifyid = verifyid;
        this.password = password;
        this.level = level;
        this.author = author;
    }
    
    public boolean Vldtpwd(String verifyid, String password)
    {
        if(verifyid == this.verifyid && password == this.password)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
