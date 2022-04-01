package fju.com.cus;

import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args){
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",1200));
        customers.add(new Customer("0002",800));
        customers.add(new SileCustomer("0003",2000));
        customers.add(new DiscountCustomer("0005",900));
        customers.add(new PlatinumCustomer("0006",2000));
        for (int i = 0; i < 5; i++) {
            customers.get(1).println();
        }
        for(Customer c: customers){
            c.println();
        }


/*        Customer c1 = new Customer("0001",1200);
        Customer c2 = new Customer("0002",800);
        SileCustomer c3 = new SileCustomer("0003",2000);
        DiscountCustomer c5 = new DiscountCustomer("0005",900);
        PlatinumCustomer c6 = new PlatinumCustomer("0006",2000);
        c1.println();
        c2.println();
        c3.println();
        c5.println();
        c6.println();*/
    }
}
