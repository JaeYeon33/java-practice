public class Shape {
    /** 1) 가로와 세로에 대한 멤버변수 정의 */
    private int width;
    private int height;

    /** 2) Rect 클래스에서 재정의 하고 있는 생성자를 구성한다. */
    public Shape(int width, int height) {
        super();
        this.width = width;
        this.height = height;
    }

    /**
     *  3) Rect 클래스의 getArea()와 getRound() 메서드에서의 호출하고 있는
     *  getter, setter 메서드 추가
     */
    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     *  4) Exam01 클래스에서 객체 생성 직후 호출하고 있는 toString() 메서드 재정의
     */
    @Override
    public String toString() {
        return "Shape [width = " + width + ", height = " + height + "]";
    }

    /**
     *  5) 도형의 둘레를 리턴하는 메서드 정의하기
     *  - Rect 클래스에서는 어떤 도형인지 명시되지 않았으므로
     *    특별히 계산 결과를 리턴할 필요는 없다.
     * @return int
     */
    public int getArea() {
        return 0;
    }

    /**
     *  6) 도형의 넓이를 리턴하는 메서드 정의하기
     *  - Rect 클래스에서는 어떤 도형인지 명시되지 않았으므로
     *    특별히 계산 결과를 리턴할 필요는 없다.
     * @return int
     */
    public int getRound() {
        return 0;
    }
}
