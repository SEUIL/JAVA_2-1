package easyjava.programing_quiz2.ch09.quiz07;

public class quiz07 {
    public static void main(String[] args) {
        Box<Integer> i = new Box<>();
        i.set(new Integer(100));
        System.out.println(i.get());

        Box<String> s = new Box<>();
        s.set("만능이네!");
        System.out.println(s.get());
    }
}

class Box<T>{
    private T content;
    public void set(T content){
        this.content = content;
    }
    public T get(){
        return content;
    }
}