public class Main02 {
    public static void main(String[] args) {
        int point = 75;

        // AND(&&) --> 두 조건이 모두 참이어야 전체가 참
        if (point > 70 && point <= 80) {
            System.out.println("C학점입니다.");
        }

        // OR(||) --> 두 조건중 하나라도 참이면 전체가 참
        if (point <= 70 || point > 80) {
            System.out.println("범위를 벗어났습니다.");
        }
    }
}
