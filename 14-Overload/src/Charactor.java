/**
 *  캐릭터의 이름과 나이를 설정하기 위한 다양한 방법을 준비한 예
 */
public class Charactor {
    private String job;
    private int age;

    public void setProperty(String job) {
        this.job = job;
    }

    public void setProperty(int age) {
        this.age = age;
    }

    public void setProperty(String job, int age) {
        this.job = job;
        this.age = age;
    }

    public void setProperty(int age, String job) {
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Charactor [job = " + job + ", age = " + age + "]";
    }
}
