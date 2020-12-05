package animals;

public class Dog implements Animal, IDog {

    @Override
    public void sayHello() {
        System.out.println("Hallo ich bin ein Hund");
    }

    @Override
    public void bellt() {
        System.out.println("Bell bell");
    }
}
