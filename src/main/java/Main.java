import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Bus bus = new Bus("Bus","운행",UUID.randomUUID().toString(),10,80,0,30);
        Taxi taxi = new Taxi("taxi","운행불가",UUID.randomUUID().toString(),0,120,100,0,4,5000,0);
        bus.printMyCar();
        bus.printStart();
        bus.printFuel(9);
        bus.customerIn(6);
        bus.customerIn(8);
        bus.customerIn(10);
        bus.printEnd();
        bus.customerIn(10);
        bus.printStart();
        bus.customerIn(5);
        bus.printFuel(60);
        bus.boosspeed(5);
        bus.printFuel(5);
        bus.boosspeed(5);
        System.out.println("- - - - - - - - - - - - - - - - - - -");
        taxi.customerIn(1);
        taxi.printStart();
        taxi.customerIn(2);
        taxi.boostspeed(30);
        taxi.boostspeed(80);
        taxi.boostspeed(-20);
        taxi.fareCalculator(400);
        taxi.fareCalculator(800);

    }
}