/**
 *  육, 해, 공군 객체를 사용하는 프로그램 본체
 *  - 앞서 작성한 Unit, Navy, AirForce 클래스는
 *  - Main01에서 재료로 활용하기 위해 제작되었다.
 */
public class Main01 {
    public static void main(String[] args) {
        Army am = new Army("육군");
        Navy nv = new Navy("해군");
        AirForce af = new AirForce("공군");

        am.attack();
        am.tank();

        nv.attack();
        nv.nucleus();

        af.attack();
        af.bombing();

    }
}
