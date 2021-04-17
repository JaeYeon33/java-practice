/**
 *  오버로드된 메서드의 활용 예시
 *  - 객체의 멤버변수에 데이터를 설정하기 위한 다양한 방법이 마련되었다.
 */
public class Main01 {
    public static void main(String[] args) {
        Charactor c = new Charactor();
        System.out.println(c.toString());

        c.setProperty(19);
        System.out.println(c.toString());

        c.setProperty("회사원");
        System.out.println(c.toString());

        c.setProperty("자영업", 20);
        System.out.println(c.toString());

        c.setProperty(30, "교수");
        System.out.println(c.toString());
    }
}
