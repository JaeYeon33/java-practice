/**
 * 예외상황의 이해를 위한 예제(2)
 */
public class Main02 {
    public static void main(String[] args) {

        int[] arr = new int[3];

        for (int i = 0; i < 5; i++) {
            /** 고전적인 에러 방지 방법 */
            if (i < arr.length) {
                arr[i] = i;  // <-- i가 3일때 에러 발생
                System.out.println(arr[i]);
            }
        }
    }
}
