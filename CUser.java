
/**
 * Create new account and check the validation
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public class CUser
{
    // instance variables - replace the example below with your own
    public String name;
    public String password;
    public String level;
    public String address;
    public String paymentInfo;
    public String email;
    
    public CUser()
    {
        name="";
        password="";
        level="";
        address="";
        paymentInfo="";
        email="";
    }

    public CUser(String name1, String password1, String level1, String address1, String paymentInfo1, String email1)
    {
        name=name1;
        password=password1;
        level=level1;
        address=address1;
        paymentInfo=paymentInfo1;
        email=email1;
    }

    public boolean Vldtpwd(String name2, String password2)//Check the validation of the account
    {
        if(name == name2 && password == password2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
