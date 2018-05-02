package comparatorAndLambda;

public class Dog extends Animal{

    String type;

    public Dog(String name, Integer age, String type, String sort){
        super(age, name, sort);
        this.type = type;
    }

    @Override
    public void printInfo() {
        System.out.println("Sort: dog  Name: " + name + " age: " + age + " Type: " + type);
        System.out.println("===================================================================================");
    }
}
