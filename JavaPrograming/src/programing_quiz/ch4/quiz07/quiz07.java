package easyjava.programing_quiz.ch4.quiz07;

public class quiz07 {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();

        GolfClub g2 = new GolfClub(8);
        g2.print();

        GolfClub g3 = new GolfClub("퍼터");
        g3.print();
    }
}

class GolfClub {
    int number;
    String Name = "아이언";

    void print(){
        if (Name.equals("아이언")) {
            System.out.printf("%d번 %s입니다.\n", number, Name);
        }
        else System.out.printf("%s입니다.\n", Name);
    }

    GolfClub(String Name){
        this.Name = Name;
    }

    GolfClub(int number){
        this.number = number;
    }

    GolfClub(){
        number = 7;
    }
}

//class GolfClub{
//    int clubNumber;
//    String club;
//    GolfClub(){
//        System.out.print("7번 아이언");
//    };
//    GolfClub(int clubNumber){
//        this.clubNumber = clubNumber;
//        System.out.print(clubNumber+"번 아이언");
//    };
//    GolfClub(String club){
//        this.club=club;
//        System.out.print(club);
//    };
//    void print(){
//        System.out.println("입니다.");
//    }

