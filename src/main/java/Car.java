public class Car {
    String name;
    String status;
    int num;
    int speed;
    int fuel;
    int customer;
    int maxcustomer;

    public Car(String name, String status,int num,int speed, int fuel,int customer,int maxcustomer) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.fuel = fuel;
        this.customer = customer;
        this.maxcustomer = maxcustomer;
    }

    public Car(String name, String status,int num,int speed, int fuel,int customer) {
        this.name = name;
        this.status = status;
        this.num = num;
        this.speed = speed;
        this.fuel = fuel;
        this.customer = customer;
    }
    public Car(String name, String status,int num,int speed, int fuel) {
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
