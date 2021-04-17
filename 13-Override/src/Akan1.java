public class Akan1 extends Protoss {
    public void attack(String target) {
        System.out.printf("[Akan] %s(이)가 %d의 힘으로 %s(을)를 공격\n", this.getName(), this.getPower(), target);
    }

    public void move(String target) {
        System.out.printf("[Akan] %s(이)가 %d의 속도로 %s(으)로 이동\n", this.getName(), this.getSpeed(), target);
    }
}
