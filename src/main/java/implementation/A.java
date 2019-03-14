package implementation;

public class A {

    String name;
    int age;

    public void printData(){
        System.out.println( "clasa A:");
        System.out.println(name);
        System.out.println(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



}
