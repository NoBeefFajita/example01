package example01.e220325;

public class Practice4 {
    public static void main(String[] args) {
        // 요리사 객체 생성
        Chef chef = new Chef();
        // 재료 객체 생성
        Egg egg = new Egg();
        Rice rice = new Rice();
        Milk milk = new Milk();
        Cheese cheese = new Cheese();
        // 요리사가 풀코드 요리함
        System.out.println("1품목 " + chef.cook(egg, cheese) + "입니다");
        System.out.println("2품목 " + chef.cook(rice, egg) + "입니다");
        System.out.println("3품목 " + chef.cook(rice, cheese) + "입니다");
        System.out.println("4품목 " + chef.cook(milk, egg) + "입니다.");
    }
}
// 각종 식재료
class Egg{}
class Rice{}
class Milk{}
class Cheese{}

// 여기에 Chef클래스를 만듬
class Chef {
//    public String cook(Object stuff1,Object stuff2) {
//        Egg egg = new Egg();
//        Rice rice = new Rice();
//        Milk milk = new Milk();
//        Cheese cheese = new Cheese();
//        String food = "";
//        if(stuff1.getClass().isInstance(egg) && stuff2.getClass().isInstance(cheese))
//            food = "스크럼블에그";
//        else if (stuff1.getClass().isInstance(rice) && stuff2.getClass().isInstance(egg))
//            food = "오므라이스";
//        else if (stuff1.getClass().isInstance(rice) && stuff2.getClass().isInstance(cheese))
//            food = "리조또";
//        else if (stuff1.getClass().isInstance(milk) && stuff2.getClass().isInstance(egg))
//            food = "푸딩";
//       return food;
//    }
    public String cook(Egg egg,Cheese cheese) {     // 클래스도 자료형
        return "스크럼블에그";
    }
    public String cook(Rice rice,Egg egg) {
        return "오므라이스";
    }
    public String cook(Rice rice,Cheese cheese) {
        return "리조또";
    }
    public String cook(Milk milk,Egg egg) {
        return "푸딩";
    }
}
