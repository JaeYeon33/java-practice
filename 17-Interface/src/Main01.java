/**
 *  주인공과 몬스터가 등장하는 프로그램
 */
public class Main01 {
    public static void main(String[] args) {
        Character ch = new Character("주인공");
        ch.walk();
        ch.run();
        ch.attack();
        ch.shield();
        ch.pickup();

        System.out.println("----------------------");

        Monster mon = new Monster("악당");
        mon.walk();
        mon.run();
        mon.attack();
        mon.shield();
    }
}
