package methodstask;

public class Customer {

    private String name;
    private String surName;
    private int age;

    public Customer(String name, String surName, int age) {
        this.surName = surName;
        this.name = name;
        if ((age >= 127) || (age <= 1)) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age >= 127) || (age <= 1)) {
            this.age = 0;
        } else {
            this.age = age;
        }

    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
