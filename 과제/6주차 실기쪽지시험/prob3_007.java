package ex1_007;

public class prob3_007 {
    public static void main(String[] args) {
        Company[] company = {new Company("A회사",10000),
        new Manager("B회사",20000,"이과장"),
        new Staff("C회사",30000,"박과장","황스일_007")};

        for (Company company1 : company) {
            company1.printshow();
        }

    }
}

class Company{
    String c_name;
    int income;

    Company(String c_name, int income){
        this.c_name = c_name;
        this.income = income;
    }

    void printshow(){
        System.out.println("회사[회사명: "+c_name+", 매출: "+ income +"]");
    }
}

class Manager extends Company{
    String m_name;

    Manager(String c_name, int income,String m_name) {
        super(c_name, income);
        this.m_name = m_name;
    }
    void printshow(){
        System.out.println("회사[회사명: "+c_name+", 매출: "+ income+", 과장명: "+m_name +"]");
    }
}

class Staff extends Manager{
    String st_name;

    Staff(String c_name, int income, String m_name,String st_name) {
        super(c_name, income, m_name);
        this.st_name = st_name;
    }
    void printshow(){
        System.out.println("회사[회사명: "+c_name+", 매출: "+ income+", 과장명: "+m_name
                +", 사원명: "+st_name +"]");
    }
}