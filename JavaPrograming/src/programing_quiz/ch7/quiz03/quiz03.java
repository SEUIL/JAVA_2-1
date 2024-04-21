package easyjava.programing_quiz.ch7.quiz03;


import java.util.Arrays;

public class quiz03 {
    public static void main(String[] args) {
        Book[] books = {new Book(15000),new Book(50000),new Book(20000)};
        int[] collectBooks = new int[3];
        int count = 0;

        System.out.println("정렬 전");
        for (Book book : books) {
            book.print();

        }

        Arrays.sort(books);

        System.out.println("정렬 후");
        for(int i=0; i<books.length; i++){
            books[i].print();
        }
    }
}

class Book implements Comparable<Book>{
    int price;
    Book(int price){
        this.price = price;
    }
    void print(){
        System.out.println("Book [price="+price+"]");
    }
    public int compareTo(Book other) {
        return Integer.compare(this.price, other.price);
    }
}

