package zooclubservice;

public class App {
    public static void main(String[] args) {
        Animal dog1 = new Dog("Cihuahua", 4, "Pocherman");
        System.out.println("Pe caine il cheama " + dog1.getName());
        dog1.setName("Rax");
        System.out.println("Pe caine il cheama " + dog1.getName());
        dog1.eat();
        dog1.makeSound();
        Dog dog2 = new Dog("Damir", 4, "pitbull");
        dog2.eat();
        dog2.makeSound();
        dog2.changeAge();
        System.out.println(dog2.getName() + " are " + dog2.getAge() + " de ani" + " si e de rasa " + dog2.getRasa());


        Animal cat1 = new Cat("Mimi", 2, 24);
        cat1.makeSound();
        cat1.eat();
        System.out.println("Pe mat il cheama " + cat1.getName());
        Cat cat2 = new Cat("Titi", 4, 15);
        cat2.eat();
        cat2.makeSound();
        System.out.println("Greutatea " + cat2.getName() + " este de " + cat2.getKg());
        cat2.mewSaIngrasat();
        System.out.println("Greutatea " + cat2.getName() + " este de " + cat2.getKg());

    }
}
