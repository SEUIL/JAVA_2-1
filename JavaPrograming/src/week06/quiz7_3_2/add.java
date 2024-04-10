package easyjava.week06.quiz7_3_2;

abstract class Calc{
    protected int a,b;
    public void setValue(int a,int b){
        this.a=a;
        this.b=b;
    }
    public abstract int calculate();
}
class Add extends Calc {
    public int calculate(){
        return a+b;
    }
}

class Mul extends Calc {
    public int calculate(){
        return a*b;
    }
}

class Sub extends Calc {
    public int calculate(){
        return a-b;
    }
}

class Div extends Calc {
    public int calculate(){
        return a/b;
    }
}
