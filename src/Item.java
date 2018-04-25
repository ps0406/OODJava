
public class Item {
    
    int ItemID;
    String ItemTitle;
    String ItemDescription;
    double ItemPrice;
    String DMethod;
    String Seller;
    String Buyer;
    double SuccessFee;
    
            
    public Item(String item) 
    {
        ItemID = 0;
        ItemTitle = "";
        ItemDescription = "";
        ItemPrice = 0;
        DMethod = "";
        Seller = "";
        Buyer = "";
        SuccessFee = 0;
        
        
        String[] readItem = item.split("\t");
        try 
        {
            ItemID = Integer.parseInt(readItem[0]);
            ItemTitle = readItem[1];
            ItemDescription = readItem[2];
            ItemPrice = Double.parseDouble(readItem[3]);
            DMethod = readItem[4];
            Seller = readItem[5];   
            Buyer = readItem[6]; 
            SuccessFee = Double.parseDouble(readItem[7]);
            SellerAddItem.generateID = ItemID;
                    
            
            
        } 
        catch (Exception e) 
        {
           
        }
        
    }                     
}
