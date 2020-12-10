package animals;

//Klasse Cat implementiert die Eigenschaften und Methoden von Animal
public class Cat implements Animal {
    private String name;

    @Override
    public void sayHello() {
        System.out.println("Hallo ich bin eine Katze");
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Cat))
            return false;
        Cat cat = (Cat) obj;

        return name.equals(cat.name);
    }
}
