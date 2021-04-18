import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 *  문자열을 파일로 저장하기
 */
public class Main02 {
    public static void main(String[] args) {
        // 저장할 파일의 경로
        final String PATH = "./text.txt";

        // 파일에 저장할 내용
        String write_string = "가나다라마바사nabcdefg";

        /** 특정 인코딩 방식 적용 */
        byte[] buffer = null;
        try {
            buffer = write_string.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        /** 파일 저장 절차 시작 */
        // finally 블록에서 인식하기 위해서 선언부를 위로 이동시킨다.
        OutputStream out = null;
        try {
            out = new FileOutputStream(PATH);
            // 파일쓰기
            out.write(buffer);
            System.out.println("[INFO] 파일 저장 성공 >> " + PATH);
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR] 지정된 경로를 찾을 수 없음. >> " + PATH);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("[ERROR] 파일 저장 실패 >> " + PATH);
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("[ERROR] 알 수 없는 에러 >> " + PATH);
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
