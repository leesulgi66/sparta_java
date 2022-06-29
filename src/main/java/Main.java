public class Main {
    public static void main(String[] args) {
        // write your code here
        Bus bus = new Bus("Bus1","운행",1,10,80,0,30);
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
    }
}