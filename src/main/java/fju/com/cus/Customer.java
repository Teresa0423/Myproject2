package fju.com.cus;

public class Customer {
    String id;
    int amount;
    float discount = 0.1f;

    public  Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }
    

    //if (amount>=1000){
    //    amount-(int)(amount*discount);
    //}else{
    //    return amount;
    //}

    //public int getTotal(){
    //    return amount-(int)(amount*discount);
    //}
}
