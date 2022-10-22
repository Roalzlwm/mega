package OOP;

public class Student {

    String name;
    int grade;
    String department;

    // 생성자 (메서드의 일부)
    // 생성자는 커스터마이징해주는 것 (customize student)
    // 타입명이 아닌 자신의 이름을 기입 (??: 제가 장르입니다)

    // this() 생성자
    Student(){
    }

    // this. 자기참조
    Student(String name, int grade, String department){
        this.name = name;
        this.grade = grade;
        this.department = department;
    }

}
