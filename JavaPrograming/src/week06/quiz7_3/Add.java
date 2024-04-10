package easyjava.week06.quiz7_3;

class Add {
    private int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a + b;
    }
}

class Mul {
    private int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a * b;

    }
}
class Sub {
    private int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        return a - b;

    }
}
class Div {
    private int a, b;
    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public int calculate() {
        int res = 0;
        try{
            res = a/b;
        } catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다");
        }
        return res;
    }
}
