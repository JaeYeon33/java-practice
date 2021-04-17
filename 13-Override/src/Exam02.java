/**
 * [연습문제 05일차 02]
 *---------------------------------
 * 다음의 출력결과가 표시되도록 함께 제공되는 Rect클래스에
 * 기능을 추가하시오.
 *
 *
 * [실행결과 예시]
 *---------------------------------
 *      Shape [width=20, height=5]
 *      사각형의 면적: 100
 *      Shape [width=30, height=10]
 *      사각형의 둘레: 80
 */
public class Exam02 {
    public static void main(String[] args) {
        Rect r = new Rect(0, 0);

        int a = r.getArea(20, 5);
        System.out.println(r.toString());
        System.out.println("사각형의 면적: " + a);

        int b = r.getRound(30, 10);
        System.out.println(r.toString());
        System.out.println("사각형의 둘레: " + b);
    }
}
