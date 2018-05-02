package comparatorAndLambda;

public class Cat extends Animal {

    String color;

    public Cat(String name, Integer age, String color, String sort){
        super(age, name, sort);
        this.color = color;
    }

    @Override
    public void printInfo() {
        System.out.println("Sort: cat  Name: " + name + " age: " + age + " Color: " + color);
        System.out.println("===================================================================================");
    }
}
