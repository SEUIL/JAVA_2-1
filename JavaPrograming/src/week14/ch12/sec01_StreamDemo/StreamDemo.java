package easyjava.week14.ch12.sec01_StreamDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//0~29 사이의 난수 20개중 10보다 큰 난수를 찾아 정렬한 후 출력
public class StreamDemo {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Random r = new Random();

        for (int i = 0; i < 10; i++)
            list.add(r.nextInt(30));

        //컬렉션으로 처리
        List<Integer> gt10 = new ArrayList<>();
        for (int i : list){
            if (i > 10){
                gt10.add(i);
            }
        }

        Collections.sort(gt10);
        System.out.println(gt10);

        //스트림으로 처리 람다식으로 표현
        list.stream().filter(i -> i > 10).sorted().forEach(x -> System.out.print(x + " "));
    }
}