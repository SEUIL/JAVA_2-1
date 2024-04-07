package week05.quiz6_1_1;

public class quiz6_1_1_007 {
    public static void main(String[] args) {
        Girl g1 = new Girl();
        Girl g2 = new GoodGirl();
        GoodGirl gg = new BestGirl();

        // g2.show();
        gg.show();
    }
}
class Girl {
    String name;
    void show(){
        System.out.println("그녀는 자바를 한다");
    }
}

class GoodGirl extends Girl {
    void show() {
        System.out.println("그녀는 자바를 잘 안다.");
    }
}

class BestGirl extends GoodGirl {
    void show() {
        System.out.println("그녀는 자바를 무지하게 잘 안다.");
    }
}

