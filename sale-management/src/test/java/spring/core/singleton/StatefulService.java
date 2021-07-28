package spring.core.singleton;

public class StatefulService {

//    private int price; // 이렇게 상태를 유지하면 안된다.

//    public StatefulService(int price) {
//        this.price = price;
//    }

//    public int getPrice() {
//        return price;
//    }

    public int order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        return price;
    }
}
