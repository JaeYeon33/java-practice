import helper.FileHelper;
import org.json.JSONObject;

public class Main02 {
    public static void main(String[] args) {
        // 파일로부터 JSONObject 객체 생성
        String source = FileHelper.getInstance().readString("29-JSON/src/res/02.json", "utf-8");
        JSONObject json = new JSONObject(source);

        // 각 Key에 대한 value들을 개별적으로 추출
        String title = json.getString("title");
        String description = json.getString("description");
        String pubDate = json.getString("pubDate");

        // 결과출력
        System.out.println("title = " + title);
        System.out.println("description = " + description);
        System.out.println("pubDate = " + pubDate);
    }
}
