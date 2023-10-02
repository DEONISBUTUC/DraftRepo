package zooclubservice;

public class Dog extends Animal {
    private int age;
    private String rasa;

    public Dog(String name, int age, String rasa) {
        super(name);
        this.age = age;
        this.rasa = rasa;
    }

    public int getAge() {
        return age;
    }

    public String getRasa() {
        return rasa;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " papa ceva de " + getAge() + " ani");

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " face haw hau har");
    }

    public int changeAge() {
        int newAge = age++;
        return newAge;
    }

}
