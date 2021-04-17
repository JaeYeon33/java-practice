/**
 * 스타크래프트 게임의 프로토스 종족에 대한 유닛을 클래스로 정의하기 위해 다음의 특성들을 도출해 보았다.
 * 유닛명 : Zerg, Dragun, Akan
 * 공통 특성 : name(String), power(int)
 * 공통 기능 : attack(String), move(string)
 * -------------------------------------------------------------------------------
 * 공통적인 특성을 표현하기 위해 Protoss라는 부모 클래스를 정의하고 이를 상속받는 Zerg, Dragun, Akan 클래스를 정의하여
 * 왼쪽과 같은 구조의 클래스를 작성하였다.
 */
public class StarcraftTest {
    public static void main(String[] args) {
        Zerg1 z1 = new Zerg1();
        z1.setName("저그1호");
        z1.setPower(10);
        z1.setSpeed(7);

        Zerg1 z2 = new Zerg1();
        z2.setName("저그2호");
        z2.setPower(10);
        z2.setSpeed(7);

        Dragun1 d1 = new Dragun1();
        d1.setName("드라군1호");
        d1.setPower(20);
        d1.setSpeed(5);

        Dragun1 d3 = new Dragun1();
        d3.setName("드라군3호");
        d3.setPower(20);
        d3.setSpeed(5);

        Akan1 a1 = new Akan1();
        a1.setName("아칸1호");
        a1.setPower(30);
        a1.setSpeed(15);

        z1.move("테란본진");
        z2.move("테란본진");
        d1.move("테란본진");
        d1.move("테란본진");
        a1.move("테란본진");
        System.out.println("-----------------------");
        z1.attack("탱크");
        z2.attack("탱크");
        d1.attack("마린");
        d1.attack("마린");
        a1.attack("마린");
    }
}
