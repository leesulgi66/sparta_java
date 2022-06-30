public class Car {
    String name;
    String status;
    String num;
    int speed;
    int maxspeed;
    int fuel;
    int customer;
    int maxcustomer;
    int price;
    int distance;

    public Car(String name, String status,String num,int speed, int fuel,int customer,int maxcustomer) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.fuel = fuel;
        this.customer = customer;
        this.maxcustomer = maxcustomer;
    }

    public Car(String name, String status, String num, int speed, int maxspeed, int fuel, int customer, int maxcustomer, int price, int distance) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.maxspeed = maxspeed;
        this.fuel = fuel;
        this.customer = customer;
        this.maxcustomer = maxcustomer;
        this.price = price;
        this.distance = distance;
    }

    public Car(String name, String status, String num, int speed, int fuel) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.fuel = fuel;

    }

    protected void printMyCar() {
        System.out.println("This car is " + name);
    }


}
