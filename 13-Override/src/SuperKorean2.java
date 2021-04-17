class Hello1 {
    public void say() {
        System.out.println("Hello World");
    }
}

class Korean1 extends Hello1 {
    public void say() {
        System.out.println("안녕하세요.");
    }

    public void sayHello() {
        super.say();
        this.say();
    }
}

public class SuperKorean2 {
    public static void main(String[] args) {
        Korean1 k = new Korean1();
        k.sayHello();
    }
}

/*
자식 클래스 Korean이 부모의 say()를 재정의 하고 있기 때문에 Korean 클래스를 통해 Hello의
say()를 호출할 방법은 Korean에서 super를 통해 간접적으로 호출해 주지 않는 이상 불가능
 */


