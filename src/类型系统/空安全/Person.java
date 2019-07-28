package 类型系统.空安全;

/**
 * @author guang
 * @since 2019-07-27 22:53
 */
public class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
