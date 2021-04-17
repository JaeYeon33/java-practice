/**
 *  질문/답변 게시판을 표현한 클래스
 *  - 공통 기능으로서 작성된 Article을 상속받기 때문에, 답변에 대한 개념만 추가한다.
 */
public class QNAArticle extends Article {
    private String answer;

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public String toString() {
        return "질문/답변 [글번호 = " + getNum() + ", 제목 = " + getTitle() + ", 답변 = " + answer + "]";
    }
}
