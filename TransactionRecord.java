
/**
 * Write a description of class TransactionRecord here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TransactionRecord
{
    // instance variables - replace the example below with your own
    public String transaction_id;
    public String transaction_info;
    /**
     * Constructor for objects of class Transaction_record
     */
    public TransactionRecord()
    {
        // initialise instance variables
        this.transaction_id = "";
        this.transaction_info = "";
    }
    public TransactionRecord(String transaction_id, String transaction_info)
    {
        this.transaction_id = transaction_id;
        this.transaction_info = transaction_info;
    }
}
