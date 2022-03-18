package fju.com.cus;

public class Customer {
    String id;
    int amount;
    float discount = 0.1f;
    public  Customer(String id, int amount){
        this.id = id;
        this.amount = amount;
    }

    public float backmoney(){
        return (amount/1000)*discount*1000;
    }

    public void println(){
        //float off = (amount/1000)+discount;
        System.out.println(id+"\t"+ amount+"\t"+(amount-backmoney()));
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
