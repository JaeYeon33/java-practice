/**
 *  Member 클래스에 대한 객체 생성
 *  - 생성자가 여러 가지 형태로 Overload 되어 있기 때문에
 *  객체를 생성하는 방법이 다양해졌다.
 */
public class Main02 {
    public static void main(String[] args) {
        Member m1 = new Member();
        System.out.println(m1.toString());

        Member m2 = new Member(19);
        System.out.println(m2.toString());

        Member m3 = new Member("학생");
        System.out.println(m3.toString());

        Member m4 = new Member("강사", 20);
        System.out.println(m4.toString());
    }
}
