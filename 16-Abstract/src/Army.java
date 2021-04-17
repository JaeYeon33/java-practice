/**
 *  추상 클래스를 상속받으면 자식은 부모의 모든 추상 메서드를
 *  재정의 해야 한다.
 */
public class Army extends Unit {

    // 생성자가 자동 추가된 결과
    public Army(String name) {
        super(name);
    }

    /**
     *  추상 메서드의 Override
     *  - 부모가 정의하고 있는 모든 추상 메서드들을 재정의해야 한다.
     *  - 추가된 메서드의 기능을 구현하기
     */
    @Override
    public void attack() {
        System.out.println(this.getName() + " >> 육상공격");
    }

    @Override
    public void move() {
        System.out.println(this.getName() + " >> 육상이동");

    }
}
