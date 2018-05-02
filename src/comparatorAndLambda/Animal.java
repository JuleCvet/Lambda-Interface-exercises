package comparatorAndLambda;

public abstract class Animal {

    Integer age;
    String name;
    String sort;

    public abstract void printInfo();

    public Animal(Integer age, String name, String sort) {
        this.age = age;
        this.name = name;
        this.sort = sort;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }
}
