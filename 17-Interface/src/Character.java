/**
 *  주인공 클래스 만들기
 *  - 주인공의 이름을 설정할 수 있도록 멤버변수와 생성자를 정의한다.
 */
public class Character implements Action, Move, Fight {

    private String name;

    public Character(String name) {
        this.name = name;
    }

    /** 추상메서드의 Override */
    // 인터페이스가 정의하고 있는 메서드들을 재정의 하기 위해 기능을 활용
    @Override
    public void pickup() {
        System.out.println(this.name + " >> " + "아이템을 줍는다.");
    }

    @Override
    public void attack() {
        System.out.println(this.name + " >> " + "공격");
    }

    @Override
    public void shield() {
        System.out.println(this.name + " >> " + "방어");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " >> " + "걷다");
    }

    @Override
    public void run() {
        System.out.println(this.name + " >> " + "뛰다");
    }

    @Override
    public void jump() {
        System.out.println(this.name + " >> " + "점프");
    }
}
