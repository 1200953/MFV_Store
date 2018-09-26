
/**
 * Write a description of class Shoppingcart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Shoppingcart
{
    
    public String car_id;
    public String product_name;
    public int qunatily;

    /**
     * Constructor for objects of class Shoppingcart
     */
    public Shoppingcart()
    {
        // initialise instance variables
        this.car_id = "";
        this.product_name = "";
        this.qunatily = 0;
        
    }
    
    public Shoppingcart(String car_id, String product_name, int qunatitly)
    {
        this.car_id = car_id;
        this.product_name = product_name;
        this.qunatily = qunatily;
    }
}
