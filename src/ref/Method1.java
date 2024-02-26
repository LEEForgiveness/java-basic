package ref;

public class Method1 {
    public static void main(String[] args) {
        Student student1 = new Student(); //student1에는 메모리 주소값(참조 값)이 들어감.
        initStudent(student1, "학생1", 15, 90); //메소드에 student1의 값(참조값)이 복사 되서 넘어간다.
        //메모리 주소값(참조 값)이 넘어가기 때문에 student1의 내부 값을 바꿀 수 있다.

        Student student2 = new Student();
        initStudent(student2, "학생2", 16, 80);

        printStudent(student1);
        printStudent(student2);
    }

    static void initStudent(Student student, String name, int age, int grade){
        student.name = name;
        student.age = age;
        student.grade = grade;
    }

    static void printStudent(Student student){
        System.out.println("이름: " + student.name + " 나이: " + student.age + " 성적: " + student.grade);
    }
}
