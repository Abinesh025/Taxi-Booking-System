public class Booking {
    
    private int bookingId;
    private Customer customer;
    private char dropPoint;
    private int charge;

    // Constructor
    public Booking(int bookingId,Customer customer,int dropPoint,int charge){
        this.bookingId = bookingId;
        this.customer = customer;
        this.dropPoint =  (char)dropPoint;
        this.charge = charge; 
    }
    public int getBookingId(int bookingId){
        return bookingId;
    }

    public Customer getCustomerId(Customer customer){
        return customer;
    }

    public char getDropPoint(char dropPoint){
        return dropPoint;
    }

    public double getCharge(double charge){
        return charge;
    }
}
