package example01.e220325;

public class Practice6 {
    public static void main(String[] args) {
        // 1번째 자동차 인스턴스 생성
        Car car1 = new Car("소나타", 1234, 10.0);
        // 2번째 자동차 인스턴스 생성
        Car car2 = new Car("K8", 6789);
        // 2대의 차를 주행
        car1.run(7.0);
        car2.run(7.0);
        // 2대의 차량정보 출력
        car1.showInfo();
        car2.showInfo();
    }
}

class Car {
    private String type;
    private int number;
    private double gasoline;

    public Car(String type, int number, double gasoline) {
        this.type = type;
        this.number = number;
        this.gasoline = gasoline;
    }
    public Car(String type, int number) {
        this.type = type;
        this.number = number;
        this.gasoline = 5.;
    }

    public void run(double gasoline) {
        if(this.gasoline < gasoline)
            System.out.println("넘버 " + this.number + "의 " + this.type + "는 휘발유 부족으로 주행할 수 없습니다");
        else {
            System.out.println("넘버 " + this.number + "의 " + this.type + "는 휘발유 " + gasoline + "리터 분 주행했습니다.");
            this.gasoline -= gasoline;
        }
    }

    public void showInfo() {
        System.out.println("차종：" + this.type + " 넘버：" + this.number+ " 가솔린：" + this.gasoline +" 리터");
    }
}