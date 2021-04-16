/**
 *  하나의 게시물을 표현하기 위한 클래스 (Article)
 *  - Article 클래스를 추가한다.
 *  - 게시물에 포함되는 정보들을 멤버변수로 추가하고,
 *  - getter, setter 메서드들을 추가해야 한다.
 */
public class Article {
    private int seq;         // 글 번호
    private String subject;  // 글 제목
    private String content;  // 글 내용
    private String writer;   // 작성자
    private int hit;         // 조회수
    private String regDate;  // 작성일시

    public Article(int seq, String subject, String content, String writer, int hit, String regDate) {
        this.seq = seq;
        this.subject = subject;
        this.content = content;
        this.writer = writer;
        this.hit = hit;
        this.regDate = regDate;
    }

    public int getSeq() {
        return seq;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public String getRegDate() {
        return regDate;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }
}
