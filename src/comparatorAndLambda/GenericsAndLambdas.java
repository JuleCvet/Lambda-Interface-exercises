package comparatorAndLambda;

import java.util.ArrayList;
import java.util.Comparator;

public class GenericsAndLambdas {

    public static void main(String[] args) {

        ArrayList<Animal> animals = new ArrayList<>();

        Cat c1 = new Cat("Saranda", 3, "gray and white", "Cat");
        Cat c2 = new Cat("Dara", 6, "gray and white", "Cat");
        Cat c3 = new Cat("Marika", 4, "gray and white", "Cat");
        Cat c4 = new Cat("Larka", 2, "gray and white", "Cat");
        Dog d1 = new Dog("lajko", 2, "Labrador", "Dog");
        Dog d2 = new Dog("Tajko", 3, "Dalmatinec", "Dog");
        Dog d3 = new Dog("Majko", 4, "Puddel", "Dog");
        Dog d4 = new Dog("Sharko", 6, "Ovcarsko", "Dog");

        animals.add(c1);
        animals.add(c2);
        animals.add(c3);
        animals.add(c4);
        animals.add(d1);
        animals.add(d2);
        animals.add(d3);
        animals.add(d4);

        System.out.println("\n============================================================================");
        System.out.println("Animals unsorted:");
        System.out.println("\n============================================================================");

        animals.forEach((animal) -> animal.printInfo());
        //animals.forEach(Animal::printInfo);//same as above

        System.out.println("\n============================================================================");
        System.out.println("Animals sorted by age ascending:");
        System.out.println("\n============================================================================");
        animals.sort((Animal t, Animal t1) -> t.age - t1.age);
        animals.forEach((animal -> animal.printInfo()));

        System.out.println("\n============================================================================");
        System.out.println("Animals sorted by age descending:");
        System.out.println("\n============================================================================");
        animals.sort((t, t1) -> t1.age - t.age);
        animals.forEach((animal -> animal.printInfo()));

        System.out.println("\n============================================================================");
        System.out.println("Animals sorted by name ascending:");
        System.out.println("\n============================================================================");
        animals.sort((Animal t, Animal t1) -> t.name.compareTo(t1.name));
        animals.forEach((animal) -> animal.printInfo());

        System.out.println("\n============================================================================");
        System.out.println("Animals sorted by name descending:");
        System.out.println("\n============================================================================");
        animals.sort((t, t1) -> t1.name.compareTo(t.name));
        animals.forEach((animal) -> animal.printInfo());


        System.out.println("\n============================================================================");
        System.out.println("Animals sorted by name and age descending:");
        System.out.println("\n============================================================================");
        animals.sort((Animal t, Animal t1) -> {
            if ((t.name).equals(t1.name)){
                return (t.age.compareTo(t1.age));
            }else{
                return (t1.name.compareTo(t.name));
            }

        });
        animals.forEach((animal) -> animal.printInfo());

        System.out.println("Animals sorted by name and age ascending:");
        System.out.println("\n============================================================================");
        animals.sort(Comparator.comparing(Animal::getName).thenComparing(Animal::getAge).reversed());
        animals.forEach((animal) -> animal.printInfo());

        System.out.println("\n\n====================================Descending============================");
        System.out.println("\n============================================================================");
        System.out.println("Animals sorted by type and color ascending:");
        System.out.println("\n============================================================================");
        animals.sort((Animal t, Animal t1) -> {
            if((t instanceof Cat)&&(t1 instanceof Cat)){
                return (((Cat) t).color.compareTo(((Cat) t1).color));
            }
            else if ((t instanceof Cat)&&(t1 instanceof Dog)){
                return -1;
            }else if ((t instanceof Dog)&&(t1 instanceof Cat)){
                return 1;
            }else{
                return ((Dog)t).type.compareTo(((Dog)t1).type);
            }
        });
        animals.forEach((animal) -> animal.printInfo());
    }
}
