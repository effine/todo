package effine.cn.todo;

/**
 * Created by effine on 6/6/16.
 */
public class DemoTest {
    private int id;
    private String name;
    private String age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DemoTest demoTest = (DemoTest) o;

        return new org.apache.commons.lang3.builder.EqualsBuilder()
                .append(id, demoTest.id)
                .append(name, demoTest.name)
                .append(age, demoTest.age)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new org.apache.commons.lang3.builder.HashCodeBuilder(17, 37)
                .append(id)
                .append(name)
                .append(age)
                .toHashCode();
    }
}
