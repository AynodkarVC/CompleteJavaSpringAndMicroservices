package clases.CoreJava;
// binding data and methods so no outside member can modify it;
public class Encapsutlation_ {
    public static void main(String[] args) {
       Human obj1 = new Human();

       obj1.setAge(23);
       obj1.setName("Vishal");

        System.out.println(obj1.getAge());
        System.out.println(obj1.getName());

    }
}
// getters and setters
class Human {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}