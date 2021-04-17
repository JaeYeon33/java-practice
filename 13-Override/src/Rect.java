public class Rect extends Shape {
    /**
     * 생성자
     * @param width    - 가로길이
     * @param height   - 세로길이
     */
    public Rect(int width, int height) {
        super(width, height);
    }

    /**
     * 면적을 구해서 리턴한다.
     */
    @Override
    public int getArea() {
        int x = this.getWidth();
        int y = this.getHeight();
        int z = x * y;
        return z;
    }

    /**
     *
     * 둘레의 길이를 구해서 리턴한다.
     */
    @Override
    public int getRound() {
        int x = this.getWidth();
        int y = this.getHeight();
        int z = (x * 2) + (y * 2);
        return z;
    }

    //----------------------- 0502 관련 내용

    /**
     *
     * 면적을 구해서 리턴한다.
     */
    public int getArea(int x, int y) {
        // Exam0502 에서 toString() 메서드를 통해 멤버변수의 값이
        // 출력되었다는 것은 전달받은 파라미터를 멤버변수에 설정했다는 의미
        // --> 직접 멤버변수에 접근할 수 없으므로 setter를 사용한다.
        this.setWidth(x);
        this.setHeight(y);
        int z = x * y;
        return z;
    }

    /**
     * 둘레의 길이를 구해서 리턴한다.
     */
    public int getRound(int x, int y) {
        // Exam0502 에서 toString() 메서드를 통해 멤버변수의 값이
        // 출력되었다는 것은 전달받은 파라미터를 멤버변수에 설정했다는 의미
        // --> 직접 멤버변수에 접근할 수 없으므로 setter를 사용한다.
        this.setWidth(x);
        this.setHeight(x);
        int z = (x * 2) + (y * 2);
        return z;
    }
}