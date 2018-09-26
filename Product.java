

/**
 * This class contains information of products in store.
 *
 * @author  Liu
 * @version 1
 */
public class Product
{
    // instance variables - replace the example below with your own
    public String name;
    public String category;
    public int price;
    public String provider;
    public String stock;
    public int shelflife;
    public int arriveDate;

    /**
     * Constructor for objects of class Product
     */
    public Product()
    {
        // initialise instance variables
        this.name = "";
        this.category = "";
        this.price = 0;
        this.provider = "";
        this.stock = "";
        this.shelflife = 0;
        this.arriveDate = 2000/01/01;
       
    
    }
    public Product(String name, String category, int price, String provider, String stock, int shelflife)  
    {
        this.name = name;
        this.category = category;
        this.price = price;
        this.provider = provider;
        this.stock = stock;
        this.shelflife = shelflife;
        this.arriveDate = arriveDate;
    }    
        
}
