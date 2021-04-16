/**
 *  멤버변수 은닉 처리
 *  - 거의대부분의 멤버변수는 은닉처리를 기본으로 한다.
 *  - Studnet 클래스에 은닉된 멤버변수를 정의한다.
 */
class Student {
    // 은닉된 멤버변수 --> 현재 블록 안에서만 접근 가능함
    private String name;
    private int age;


    // 은닉된 멤버변수에 값을 넣는 방법 --> 메서드를 이용
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // 은닉된 멤버변수의 값을 읽는 방법
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

}

/**
 *  Student 클래스에 대한 객체의 사용
 *  - 객체를 생성하고, setter 메서드를 사용하여 데이터를 설정한다.
 *  - 설정된 데이터를 getter 메서드를 통해 리턴 받아 화면에 출력한다.
 */
public class Main01 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("JAVA학생");
        s.setAge(20);

        String name = s.getName();
        System.out.println("이름: " + name);

        int age = s.getAge();
        System.out.println("나이: " + age);

    }
}
