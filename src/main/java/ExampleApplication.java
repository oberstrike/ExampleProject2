import animals.Animal;
import animals.Cat;
import animals.Dog;
import animals.IDog;
import numbers.NumberExamples;

import java.util.ArrayList;
import java.util.List;

public class ExampleApplication {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (Animal animal: animals){
            boolean isDog = animal instanceof IDog;
            if(isDog){
                IDog iDog = (IDog) animal;
                iDog.bellt();

            }
        }
    }

}
