/**
 *  Inner 클래스에 대한 객체 생성하기
 *  -------------------------------
 *  Inner 클래스가 Inner 형태인 경우, 부모 클래스의 객체를 통해서만 객체 생성이 가능하다.
 *  Inner 클래스가 static 형태인 경우, 부모 클래스의 이름을 통해서 객체 생성이 가능하다.
 */
public class Main01 {
    public static void main(String[] args) {
        // inner 클래스에 대한 객체는 부모클래스에 대한 객체를 통해서 접근한다.
        People p = new People();
        People.Man man = p.new Man("철수", 19, true);

        // static inner 클래스는 부모 클래스 자체를 통해서 접근한다.
        People.Woman woman = new People.Woman("영희", 18);

        System.out.println(man.toString());
        System.out.println(woman.toString());
    }
}
