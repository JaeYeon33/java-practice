/**
 *  생성자의 Overload
 *  - Memeber 클래스를 다양한 방법으로 생성할 수 있도록 하였다.
 */
public class Member {
    private String job;
    private int age;

    public Member() {}

    public Member(int age) {
        this.age = age;
    }

    public Member(String job) {
        this.job = job;
    }

    public Member(String job, int age) {
        this.job = job;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Charactor job = [" + job + ", age = " + age + "]";
    }
}
