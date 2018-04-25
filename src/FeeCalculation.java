
public class FeeCalculation {

double itemPrice;    
public static double SuccessFee; 

public FeeCalculation()
{
    itemPrice = 0;
    SuccessFee = 0;
}

public double FeeCalculation(double itemPrice)
{
    if(itemPrice <5)
    {
        return 0;
    }
    else if (itemPrice >=5 && itemPrice <=100)
    {
        return itemPrice *0.05;
    }
    else if (itemPrice >=101 && itemPrice <=1000)
    {
        return itemPrice *0.1;
    }
    else
    {
        return itemPrice*0.15;
    }
}    
}
