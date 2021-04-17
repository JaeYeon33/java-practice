/**
 *  Unit을 상속받는 해군 클래스 정의
 *  - 육군 클래스와 동일한 방식으로 구성한다.
 */
public class Navy extends Unit {
    public Navy(String name) {
        super(name);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(this.getName() + " >> 어뢰 발사!!");
        System.out.println(this.getName() + " >> 지상 상륙");
    }

    public void nucleus() {
        System.out.println(this.getName() + " >> 핵미사일");
    }
}
