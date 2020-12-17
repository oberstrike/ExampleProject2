package patterns;

/*
Konstruktoren-Verkettung
 */
public class Person {

    private static Integer count = 0;

    private String vorname;
    private String nachname;
    private Integer alter;
    private Integer id;

    public Person() {
        this.id = ++count;
    }

    public Person(String vorname, String nachname) {
        this();
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, Integer alter) {
        this(vorname, nachname);
        this.alter = alter;
    }


    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public Integer getAlter() {
        return alter;
    }

    public void setAlter(Integer alter) {
        this.alter = alter;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person("Markus", "Jürgens");
        Person person3 = new Person("Markus", "Jürgens", 22);

        System.out.println("Person 1 Id: " + person1.getId());
        System.out.println("Person 2 Id: " + person2.getId());
        System.out.println("Person 3 Id: " + person3.getId());

    }

}
