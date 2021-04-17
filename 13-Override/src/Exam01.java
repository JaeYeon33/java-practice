/**
 * [연습문제 05일차 01]
 *-------------------------------
 * 다음의 출력결과가 표시되도록 함께 제공되는 Rect 클래스를
 * 참고해서 Shape 클래스를 완성하세요
 * 단, Rect 클래스와 Exam0501 클래스는 수정할 수 없습니다.
 *
 *
 * [실행결과 예시]
 *-------------------------------
 *      Shape [width=10, height=5]
 *      면적: 50
 *      둘레: 30
 */
public class Exam01 {
    public static void main(String[] args) {
        Rect r = new Rect(10, 5);
        System.out.println(r.toString());

        int a = r.getArea();
        int b = r.getRound();

        System.out.println("사각형의 면적: " + a);
        System.out.println("사각형의 둘레: " + b);
    }
}
