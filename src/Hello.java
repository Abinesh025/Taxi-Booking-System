public class Hello {
    public static void main(String[] args) {
        
        Customer cus = new Customer(1, 9, 'A', 'B');
        Customer cus1 = new Customer(2, 9, 'B', 'D');
        Customer cus3 = new Customer(3, 12, 'B', 'C');

        BookingMangementSystem obj = new BookingMangementSystem(6);

        obj.bookTaxi(cus);
        obj.bookTaxi(cus1);
        obj.bookTaxi(cus3);

    }
}
