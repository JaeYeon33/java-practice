/**
 *  생성자의 활용
 * - 생성자는 멤버변수의 값을 초기화 하기 위해 사용한다.
 */
class Book {
    String subject;
    String content;

    // 생성자 --> 객체가 생서될 대, 자동으로 실행되는 특수한 메서드
    // 특징 : 리턴형을 명시하지 않는다. 클래스와 이름이 동일하다.
    Book() {
        System.out.println("----- 생성자 실행됨 -----");
        this.subject = "JAVA 입문";
        this.content = "JAVA는 어쩌구 저쩌구...";
    }

    void read() {
        System.out.println("---- read() 실행됨 -----");
        System.out.println(this.subject);
        System.out.println(this.content);
    }
}

/**
 *  생성자를 갖는 클래스에 대한 객체 생성
 *  - Book 클래스의 생성자에서 멤버변수에 대한 기본값을 설정하기 때문에,
 *    객체를 생성하는 것 만으로 멤버변수가 초기화 된다.
 */
public class Main06 {
    public static void main(String[] args) {
        Book book = new Book();
        book.read();

    }
}
