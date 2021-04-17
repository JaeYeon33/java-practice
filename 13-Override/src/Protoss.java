public class Protoss {
    private String name;
    private int power;
    private int speed;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void attack(String target) {
        System.out.printf("%s(이)가 %d의 힘으로 %s(을)를 공격\n", this.name, this.power, target);
    }

    public void move(String target) {
        System.out.printf("%s(이)가 %d의 속도로 %s(으)로 이동\n", this.name, this.speed, target);
    }
}
