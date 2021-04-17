/**
 *  Unit을 상속받는 공군 클래스의 정의
 *  - 앞서 작성한 클래스와 동일한 방식으로 정의한다.
 */
public class AirForce extends Unit {
    public AirForce(String name) {
        super(name);
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println(this.getName() + " >> 이룩");
        System.out.println(this.getName() + " >> 공중공격 실행함");
    }

    public void bombing() {
        System.out.println(this.getName() + " >> 폭격");
    }
}
