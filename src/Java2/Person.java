package Java2;

/**
 * Created by larryg on 5/16/17.
 */
public class Person {

    private String name;


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
        Person user1 = new Person();
        user1.setName("Rocky");
        user1.sayHello();
    }

}
