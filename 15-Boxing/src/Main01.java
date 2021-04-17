/**
 *  각각의 객체를 생성하고, 고유의 기능 호출하기
 *  - Unit 클래스를 상속받은 후, 각각의 클래스에 추가적으로 구현한 확장 기능을 사용한다.
 */
public class Main01 {
    public static void main(String[] args) {
        AirForce af = new AirForce("공군");
        Navy nv = new Navy("해군");
        Army am = new Army("육군");

        // 각각의 객체는 자신들의 고유 기능을 사용할 수 있음
        af.bombing();
        nv.nucleus();
        am.tank();

        /**
         *  상위 객체 형태로 암묵적 형변환
         *  - 상위 클래스의 객체로 암묵적 형변환이 이루어지면 Override 된 기능만 사용 가능하다.
         *  - 추가적으로 확장된 기능들은 사용할 수 없도록 잠김 상태가 된다.
         */
        // 모든 객체는 자신의 상위 형태로 암묵적 형변환 가능
        Unit temp1 = af;
        Unit temp2 = nv;
        Unit temp3 = am;

        // 형변환이 되더라도 상속받거나 재정의한(Override)
        // 자신들의 기본 특성들은 그대로 유지함
        temp1.attack();
        temp2.attack();
        temp3.attack();

        System.out.println("-----------------------");

        /**
         *  다시 원래의 기능을 복구하기
         *  - 확장된 추가 기능을 다시 사용하기 위해서는 본래의 형태로 명시적 형변환이 필요하다.
         */
        // 상위 클래스 형태로 형변환이 되면, 자신들의 독립 기능은
        // 사용하지 못함
        // temp1.bombing();
        // temp2.nucleus();
        // temp3.tank();

        // 다시 원래의 기능을 되돌리기 위해서는
        // 하위 클래스 형태로 명시적 형변환이 필요함
        AirForce re1 = (AirForce) temp1;
        Navy re2 = (Navy) temp2;
        Army re3 = (Army) temp3;

        re1.bombing();
        re2.nucleus();
        re3.tank();
    }
}
