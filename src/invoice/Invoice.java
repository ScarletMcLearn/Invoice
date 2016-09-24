/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package invoice;

/**
 *
 * @author mac
 */
public class Invoice {

    /**
     * @param args the command line arguments
     */
    
    
   // a part number (type String), a part description (type String), a quantity of the item being purchased (type int) and a price per item (double)
       
    private String partNumber = null;
    private String partDescription = null;
    private int quantity = 0;
    private double pricePerItem = 0;
    
    
    public String getPartNumber()
    {
        return partNumber;
    }
    
    
    public String getPartDescription()
    {
        return partDescription;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    
    public double getPerPartPrice()
    {
        return pricePerItem;
    }
            
    
    
    public void setPartNumber(String no)
    {
        partNumber = no;
    }
    
    
    public void setPartDescription(String Desc)
    {   
        partDescription = Desc;
    }
    
    public void setQuantity(int amount)
    {   
        if (((amount == 0) || (amount > 0)))
                {quantity = amount;}
        
        else
            quantity = 0;
        
    }
    
    
    public void setPerPartPrice(double amount)
    {
        if (amount < 0)
            pricePerItem = 0;
        
        else
            pricePerItem = amount;
    }
    
    
    
    //provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item), then returns the amount as a double value. If the
    
    //eitate problem bujhi nai get set diye kivabe
    
    public double getInvoiceAmount(int amount, double price)
    {
        return amount*price;
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //how to write test? in same file or diff? and ki korbo?
    }
    
}
