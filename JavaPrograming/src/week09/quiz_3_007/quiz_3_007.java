package easyjava.week09.quiz_3_007;

public class quiz_3_007 {
    public static void main(String[] args) {
        Mouse m1 = new Mouse("Logitech");
        Mouse m2 = new Mouse("Logitech");
        Mouse m3 = m1;
        Keyboard k1 = new Keyboard("Microsoft");
        Keyboard k2 = new Keyboard("Microsoft");

        System.out.println(m1.toString());
        System.out.println(m1);

        System.out.println(k1.toString());
        System.out.println(k1);

        System.out.println(m1.equals(m2)); //Object에 해당하는 equals
        System.out.println(m1.equals(m3));
        System.out.println(k1.equals(k2));

    }
}
