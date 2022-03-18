package fju.com.cus;

public class SileCustomer extends Customer{
    //public static void main(String[] args){
    //    Customer c1 = new Customer("0001",2000);
    //    Customer c2 = new Customer("0002",4500);
    //}

    public SileCustomer (String id,int amount){
        super(id, amount);
    }

    public int getTotal(){
        return amount;
    }
}
