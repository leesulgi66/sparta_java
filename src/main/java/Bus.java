public class Bus extends Car{
    public Bus(String name, String status, String num, int speed, int fuel,int customer,int maxcustomer) {
         super(name, status, num, speed, fuel,customer,maxcustomer);
    }
    public void printStart(){
        System.out.println(name + " 운행 시작");
        status = "운행중";
    }public void printEnd(){
        System.out.println(name + " 운행 종료");
        status = "차고지행";
    }

    public int printFuel(int downfuel){
        int currenfuel = fuel - downfuel;
        if(currenfuel < 10 && currenfuel > 0){
            System.out.println("경고 현재 남은 연료 양은 "+currenfuel+"입니다. 주유가 필요합니다.");
        }else if (currenfuel >= 10)
            System.out.println("현재 남은 연료 양은 "+currenfuel+"입니다.");
        if(currenfuel < 1){
            System.out.println("기름이 다 떨어졌습니다. 차고지로 이동합니다.");
            printEnd();
        }

        fuel = currenfuel;
        return fuel;
    }

    public int customerIn(int customers){
        if(status == "운행중"){
            if(customer+customers <maxcustomer){
                customer += customers;
                System.out.println("현재 탑승객의 수는 " + customer+"명 입니다.");
            }else{
                System.out.println("현재 탑승객 수는 "+customer+"명이며 더이상 태울 수 없습니다.");
            }
        }else{
            System.out.println("지금은 손님을 태울 수 없습니다.");
        }
        return customer;
    }

    public int boosspeed(int updownspeed){
        if (fuel > 10) {
            int currentspeed = speed + updownspeed;
            System.out.println("속도를 " + currentspeed + "로 변경 합니다.");
            return currentspeed;
        }else {
            System.out.println("주유량을 확인 해 주세요");
        }
        return speed;
    }
}
