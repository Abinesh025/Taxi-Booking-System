
import java.util.ArrayList;
import java.util.List;

public class BookingMangementSystem {
    
    private List<Taxi> taxies;
    private int bookingId = 1;

    public BookingMangementSystem(int taxiCount) {

        taxies = new ArrayList<>();

        for(int i = 1; i<taxiCount;i++){
            taxies.add(new Taxi(1));
        }
    }

    public int  getCharges(char pickup,char drop){

        int charges = 100;

        int distance = Math.abs(pickup - drop) * 15;
        distance -= 5;
        
        charges =+ distance * 10;
        return charges;
    }

    Taxi findTaxi(char point,int pickUpTime){
        List<Taxi> freeTaxi = new ArrayList<>();
        for(Taxi t : taxies){
          if(  t.isFree(point, pickUpTime)){
                freeTaxi.add(t);
          }
        }

        if(freeTaxi == null){
            return null;
        }

        int minDistance  = Integer.MAX_VALUE;
          List<Taxi> nearTaxi = new ArrayList<>();
        for(Taxi t : freeTaxi){
            int distance = Math.abs(point - t.getCurrentPoint());

            if(distance < minDistance){
                nearTaxi.add(t);
            }
        }

        Taxi selected = nearTaxi.get(0);
        // List <Taxi> minTaxi = new ArrayList<>();

        for(Taxi t : nearTaxi){
            if(t.getEarnings() < selected.getEarnings()){
                selected = t;
            }
        }
        return selected;
    }

  public void bookTaxi(Customer c){

        Taxi selected = findTaxi(c.getPickUpPoint(), c.getPickUpTime());

        if(selected == null){
            System.out.println("Not able to Book");
        }

        int travel = Math.abs(c.getPickUpPoint() + c.getDropPoint());
        int dropTime = c.getPickUpTime() + travel;
        int charges = getCharges(c.getPickUpPoint(), c.getDropPoint());

        Booking book = new Booking(bookingId, c, dropTime, charges);
        bookingId++;



        selected.isBooking(book);
        selected.setFreeTime(dropTime);
        selected.setEarnings(selected.getEarnings() + charges);


        System.out.println("Selected" + selected.getTaxiId() + "is allocated");
    }
    
    
}
