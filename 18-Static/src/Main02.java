/**
 *  싱글톤 객체의 사용 방법
 */
public class Main02 {
    public static void main(String[] args) {
        Calc loader1 = Calc.getInstance();
        loader1.plus(100, 50);

        Calc.getInstance().minus(100, 50);
    }


}
