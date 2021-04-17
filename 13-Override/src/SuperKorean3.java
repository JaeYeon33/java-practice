/**
 *  Override 과정에서의 메서드 이름의 오타
 */
class Hello3 {
    public void say() {
        System.out.println("Hello World");
    }
}

class Korean3 extends Hello3 {
    // 부모 메서드를 재정의 하고자 했으나 오타로 인해 새로운 메서드를 생성하게 된다.
    public void sai() {
        System.out.println("안녕하세요.");
    }
}

public class SuperKorean3 {
    public static void main(String[] args) {
        Korean3 k = new Korean3();
        k.say();
    }
}
