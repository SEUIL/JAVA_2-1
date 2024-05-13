package easyjava.programing_quiz.ch4.quiz07;

// 테스트를 위한 메인 클래스
public class quiz07 {
    public static void main(String[] args) {
        // 골프 클럽 객체 생성 및 출력
        GolfClub g1 = new GolfClub(); // 디폴트 생성자로 아이언 클럽 생성
        g1.print(); // 생성된 골프 클럽 출력

        GolfClub g2 = new GolfClub(8); // 번호가 8번인 골프 클럽 생성
        g2.print(); // 생성된 골프 클럽 출력

        GolfClub g3 = new GolfClub("퍼터"); // 이름이 '퍼터'인 골프 클럽 생성
        g3.print(); // 생성된 골프 클럽 출력
    }
}

// 골프 클럽을 나타내는 클래스
class GolfClub {
    int number; // 골프 클럽의 번호를 나타내는 변수
    String Name = "아이언"; // 골프 클럽의 이름을 나타내는 변수, 기본값은 '아이언'

    // 골프 클럽 정보를 출력하는 메서드
    void print(){
        // 골프 클럽의 이름이 '아이언'인 경우
        if (Name.equals("아이언")) {
            System.out.printf("%d번 %s입니다.\n", number, Name); // 번호와 이름 출력
        }
        // 골프 클럽의 이름이 '아이언'이 아닌 경우
        else {
            System.out.printf("%s입니다.\n", Name); // 이름만 출력
        }
    }

    // 이름을 받아 골프 클럽을 초기화하는 생성자
    GolfClub(String Name){
        this.Name = Name; // 입력된 이름으로 골프 클럽 초기화
    }

    // 번호를 받아 골프 클럽을 초기화하는 생성자
    GolfClub(int number){
        this.number = number; // 입력된 번호로 골프 클럽 초기화
    }

    // 디폴트 생성자: 아이언 클럽으로 초기화
    GolfClub(){
        number = 7; // 아이언 클럽의 번호는 기본적으로 7
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

