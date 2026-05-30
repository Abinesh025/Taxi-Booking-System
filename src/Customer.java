public class Customer{

    private int id;
    private int pickUpTime;
    private char dropPoint;
    private char pickUpPoint;

    public Customer(int id,int pickUpTime,char dropPoint,char pickUpPoint){
        this.id = id;
        this.pickUpTime = pickUpTime;
        this.dropPoint = dropPoint;
        this.pickUpPoint = pickUpPoint;
    }

    public int getId(){
        return id;
    }

    public int getPickUpTime(){
        return pickUpTime;
    }

    public char getDropPoint(){
        return dropPoint;
    }

    public char getPickUpPoint(){
        return pickUpPoint;
    }


}