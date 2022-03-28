package fju.com.ticket;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args){
        Ticket ticket = new Ticket
                (Ticket.TAIPEI_STATION,
                        Ticket.TAICHUNG_STATION);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your start station?"+"(1.Taipei 2.Taichung 3.Kaohsiung)");
    }
}
