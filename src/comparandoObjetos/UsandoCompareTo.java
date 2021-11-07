package comparandoObjetos;
/*
For the example given in the topic about people,
implement the compareTo method. It should compare people by name,
 and if they have the same name, compare them by age.


 */
public class UsandoCompareTo {

    public static void main(String[] args) {
        Person person = new Person("Jose", 24, 170, 90);
        Person person2 = new Person("Jose", 26, 13, 70);

        System.out.println(person.compareTo(person2) > 0 ? "La persona uno es mayor" : "la persona uno es menor");

    }
}
class Person implements Comparable<Person> {
    private String name;
    private int age;
    private int height;
    private int weight;

    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWeight() {
        return this.weight;
    }

    // comparando por nombre, si tienen el mismo nombre se compara por edad
    @Override
    public int compareTo(Person otherPerson) {
        int resultName = this.getName().compareTo(otherPerson.getName());
        int resultAge = Integer.compare(this.getAge(), otherPerson.getAge());

        return resultName == 0 ? resultAge : resultName;
    }
}
