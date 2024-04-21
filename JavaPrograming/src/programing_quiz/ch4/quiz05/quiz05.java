package easyjava.programing_quiz.ch4.quiz05;

public class quiz05 {
    public static void main(String[] args) {
        Line a = new Line(1);
        Line b = new Line(1);

        System.out.println(a.isSameLine(b));
        System.out.println(a==b);
    }
}

class Line{
    int line;
    Line(int line){
        this.line = line;
    }
    boolean isSameLine(Line l){
        if (this.line == l.line) {
            return true;
        }else{
            return false;
        }
    }
}
