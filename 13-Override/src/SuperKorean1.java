/**
 *  Override 되지 않은 부모 클래스의 메서드 이름 앞에 명시
 *  - 이미 상속되어 있기 때문에 this 키워드를 사용하는 것과 동일한 결과를 갖는다.
 */
class Hello {
    void say() {
        System.out.println("Hello World");
    }
}

class Korean extends Hello {
    void sayHello() {
        super.say();
        this.say();
    }
}

public class SuperKorean1 {
    public static void main(String[] args) {
        Korean k = new Korean();
        k.sayHello();
    }
}
