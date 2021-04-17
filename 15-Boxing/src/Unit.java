/**
 *  육/해/공군의 공통 특성을 표현한 클래스
 */
public class Unit {
    private String name;

    // 생성자가 정의되어 있다.
    public Unit(String name) {
        super();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 이 메서드를 재정의 한다.
    public void attack() {
        System.out.println(this.name + " >> 공격준비 ");
    }
}
