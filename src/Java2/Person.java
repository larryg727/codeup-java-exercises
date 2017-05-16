package Java2;

/**
 * Created by larryg on 5/16/17.
 */
public class Person {

    private String name;

    public Person(String name){
        this.setName(name);
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello " + this.getName());
    }

    public static void main(String[] args) {
        Person user1 = new Person("Rocky");
        user1.sayHello();

        Person person1 = new Person("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }

}
