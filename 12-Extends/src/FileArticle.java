/**
 *  자료실을 표현한 클래스
 *  - 공통 기능을 상속받고 있기 때문에, 첨부파일이라는 개념만 추가한다.
 */
public class FileArticle extends Article {
    // 자료의 확장 --> 파일이름
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String toString() {
        return "자료실 [번호 = " + getNum() + ", 제목 = " + getTitle() + ", 첨부파일 = " + fileName + "]";
    }
}
