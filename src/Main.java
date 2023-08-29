public class Main {
    public static void main(String[] args) {
        Car avante = new Car("현대","올 뉴 아반떼 1.5l 알파","검정",200,5800, new Body(), new Engine(), new Tire());
        System.out.println(avante.company);

        System.out.println("BEFORE MAXSPEED: "+avante.maxSpeed);
        Car genesis= avante.addMaxSpeedLimit(avante); //아반떼 최고속도 업그레이드
        System.out.println("AFTER MAXSPEED: "+genesis.maxSpeed);
        
        
        Car temp = new Car("Benz","","",0,0,new Body(), new Engine(), new Tire());
        Car Benz = avante.changeCompanyName(temp);

        System.out.println("Benz.company = " + Benz.company);
        System.out.println("Benz.model = " + Benz.model);
    }

}

