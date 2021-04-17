/**
 *  생서자 정의하기
 *  - 정의된 멤버변수들을 모두 초기화 하는 완전한 형태의 생성자를 정의한다.
 */
public class Article {
    private int seq;
    private String subject;
    private String writer;

    public Article(int seq, String subject, String writer) {
        super();
        this.seq = seq;
        this.subject = subject;
        this.writer = writer;
    }

    /**
     * 생성자 Overload
     * - 파라미터가 서로 다른 생성자들이 하나의 완전한 생성자를 호출하도록 하여, 데이터의 초기화를 한 곳에서 일괄적으로 처리하도록 구현할 수 있다.
     */
    public Article(int seq) {
        this(seq, "제목없음", "익명");
    }

    public Article(int seq, String subject) {
        this(seq, subject, "익명");
    }

    @Override
    public String toString() {
        return "Article [seq = " + seq + ", subject = " + subject + ", writer = " + writer + "]";
    }
}
