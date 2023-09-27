package zooclubservice;

public class Cat extends Animal {
private String culoare;
private int ani;

    public int getKg() {
        return kg;
    }

    private int kg;

    public Cat(String name, int ani, int kg) {
        super(name);
        this.ani = ani;
        this.kg = kg;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " mananca cotlete");

    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " face meeeewwww");
    }
    public int mewSaIngrasat(){
        int newKg = kg++;
        return newKg;
    }
}

