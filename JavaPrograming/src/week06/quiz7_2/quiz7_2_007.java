package easyjava.week06.quiz7_2;

//2133007
//황스일
public class quiz7_2_007 {
    public static void main(String[] args) {
        GoodCalc c = new GoodCalc();
        System.out.println(c.add(2,3));
        System.out.println(c.subtract(2,3));
        System.out.println(c.average(new int[]{2,3,4}));
    }
}

abstract class Calculaor{
    public abstract int add(int a, int b);
    public abstract int subtract(int a, int b);
    public abstract double average(int[] a);
}

class GoodCalc extends Calculaor{
    @Override
    public int add(int a, int b){
        return a + b;
    }
    @Override
    public int subtract(int a, int b){
        return a - b;
    }
    @Override
    public double average(int[] a){
        double sum = 0;
        for (int i=0; i<a.length; i++){
            sum += a[i];
        }
        return sum/a.length;

    }
}
