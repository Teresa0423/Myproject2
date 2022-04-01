package fju.com.ticket;

public class StudentTicket extends Ticket{
    float off = 0.1f;
    public StudentTicket(Station start,Station destination){
        super(start, destination);
    }
}
