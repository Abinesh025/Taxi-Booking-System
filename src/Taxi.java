
import java.util.ArrayList;
import java.util.List;

public class Taxi {

    private int taxiId;
    private char currentPoint;
    private int charge;
    private List<Booking> Booking;
    private int freeTime;
    private int earnings;

    public Taxi(int taxiId){
        this.taxiId = taxiId;
        this.Booking = new ArrayList<>();
        this.charge = 0;
        this.earnings = 0;
        this.freeTime = 0;
        this.currentPoint = 'A';
    }

    public boolean isFree(char point,int pickUpTime){
        int travelTime = Math.abs(point - currentPoint);

        if(travelTime + freeTime <= pickUpTime){
            return true;
        }
        return false;
    }

    public void isBooking(Booking b){
        Booking.add(b);
    }

    public int getTaxiId(){
        return taxiId;
    }

    public char getCurrentPoint(){
        return currentPoint;
    }

    public int getCharge(){
        return charge;
    }

    public int getEarnings(){
        return earnings;
    }

    public List<Booking> getBookings(){
        return Booking;
    }

    public int getFreeTime(){
        return freeTime;
    }

    public int setFreeTime(int freeTime){
        return this.freeTime = freeTime; 
    }

    public int  setEarnings(int earnings){
        return this.earnings = earnings;
    }
}
