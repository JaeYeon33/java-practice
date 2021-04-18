import study.java.helper.FileHelper;

/**
 *  구현 기능 확인하기
 *  - 파일 입출력에서 상황에 따라 변경되어야 하는 요소는 인코딩 형식, 파일경로, 내용이다.
 *  - 읽기/쓰기 에 대한 방법은 항상 일정한 코드 구조를 유지한다.
 */
public class Main04 {
    public static void main(String[] args) {
        String encType = "UTF-8";
        String filePath = "myfile.txt";
        String content = "안녕하세요. 자바 프로그래밍";

        boolean result = FileHelper.getInstance().writeString(filePath, content, encType);

        if (!result) {
            System.out.println("파일 저장에 실패했습니다.");
            return;
        }

        String read = FileHelper.getInstance().readString(filePath, encType);
        System.out.println(read);
    }
}
