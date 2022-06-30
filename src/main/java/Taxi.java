import java.util.UUID;

public class Taxi extends Car{

    public Taxi(String name, String status, String num, int speed, int maxspeed, int fuel, int customer, int maxcustomer, int price, int distance) {
        super(name, status, num, speed, maxspeed, fuel, customer, maxcustomer, price, distance);
    }

    public void printStart(){
        if(fuel > 10){
            System.out.println(name + " 운행 시작");
            status = "일반";
            speed = 40;
        }else{
            System.out.println(name + " 운행이 불가능 합니다.");
        }
    }

    public int customerIn(int customers){
        if(status == "일반"){
            System.out.println(customers +"의 승객이 탑승 했습니다.");
            status = "탑승 불가";
        }else{
            System.out.println("탑승 불가.");
        }
        return customer;
    }

    public int boostspeed(int updownspeed){
        int currentspeed = speed + updownspeed;
        if (currentspeed < maxspeed){
            System.out.println("속도를 " + currentspeed + "로 변경 합니다.");
        }else if (currentspeed >= maxspeed){
            System.out.println("최고 속도 도달!!! 더이상 속도를 높이지 마세요!!");
            speed = maxspeed;
            return speed;
        }else {System.out.println("속도를 변경 할 수 없습니다.");
        }

        speed = currentspeed;
        return speed;
    }

    public void  fareCalculator(int distan){
        int basemove = 500;
        int totalmove = distan;
        if (basemove > totalmove){
            System.out.println("기본 요금 5000원 입니다.");
        }else{
            price = (distan-basemove)/100*1000+5000;
            System.out.println("요금은 "+price+"원 입니다.");
        }

    }

}
