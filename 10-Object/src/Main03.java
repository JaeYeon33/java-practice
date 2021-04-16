/**
 * 메서드를 포함한 클래스
 * 변수의 유효성 범위 -> 멤버변수는 모든 메서드가 공유한다. (전역변수)
 */

class HelloWorld {
    String message;

    void sayHello()  {
        System.out.println(message);
    }

    void setEng() {
        System.out.println(message = "Hello, Java");
    }

    void setKor() {
        System.out.println(message = "안녕하세요. 자바");
    }
}

public class Main03 {
    public static void main(String[] args) {
        HelloWorld hello = new HelloWorld();

        // 메서드의 호출
        hello.setEng();
        hello.sayHello();

        hello.setKor();
        hello.sayHello();
    }
}
