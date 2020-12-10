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
        Cat cat2 = new Cat();

        Dog dog = new Dog();

        List<IDog> dogs = new ArrayList<>();

        List<Animal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        dogs.add(dog);

        for (Animal animal: animals){

            if(animal instanceof IDog){
                IDog iDog = (IDog) animal;
                iDog.bellt();
            }
        }

        animals.remove(cat);

        System.out.println(cat);
        System.out.println(cat2);

        System.out.println(cat == cat2);
    }

}
