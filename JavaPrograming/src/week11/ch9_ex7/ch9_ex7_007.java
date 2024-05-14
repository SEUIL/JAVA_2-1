package easyjava.week11.ch9_ex7;

public class ch9_ex7_007 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(100);
        System.out.println(i.get());
        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}

class Box<T> {
    private T data;

    public void set(T data) {
        this.data = data;
    }

    public T get() {
        return data;
    }
}
