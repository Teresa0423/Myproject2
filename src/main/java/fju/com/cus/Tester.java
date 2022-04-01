package fju.com.cus;

public class Tester {
    public static void main(String[] args){
        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        SileCustomer c3 = new SileCustomer("0003",2000);
        DiscountCustomer c5 = new DiscountCustomer("0005",900);
        PlatinumCustomer c6 = new PlatinumCustomer("0006",2000);
        c1.println();
        c2.println();
        c3.println();
        c5.println();
        c6.println();
    }
}
