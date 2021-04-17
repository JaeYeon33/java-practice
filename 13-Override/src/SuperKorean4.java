class Hello4 {
    public void say() {
        System.out.println("Hello World");
    }
}

class Korean4 extends Hello4 {
    // 부모의 메서드를 재정의 하고자 했으나 오타로 인해 새로운 메서드를 생성하게 된다.
    @Override
    public void say() {
        System.out.println("안녕하세요.");
    }
}
public class SuperKorean4 {
    public static void main(String[] args) {
        Korean4 k = new Korean4();
        k.say();
    }
}

/**
 * @Override 라는 어노테이션은 선언한 메서드가 오버라이드 되었다는 것을 나타낸다.
 * 만약 상위(부모) 클래스 (또는 인터페이스) 에서 해당 메서드를 찾을 수 없다면 컴파일 에러를 발생시킨다.
 * Korean 클래스의 sai 메서드를 정상적으로 say() 로 수정하지 않으면 컴파일 에러 메시지가 표시된다.
 */