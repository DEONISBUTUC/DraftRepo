package methodstask;

import javax.xml.crypto.Data;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(48, 68);
        System.out.println(" Variabila randomInt: " + randomInt);

        double randomInt1 = DataGeneratorUtil.getRandomInt(10.5);
        System.out.println("Variabila randomInt1: " + randomInt1);

        int randomInt2 = DataGeneratorUtil.getRandomDouble(10);
        System.out.println("Variabila randomInt2 " + randomInt2);

        String randomStrin1 = DataGeneratorUtil.getRandomEmail("gmail.com");
        System.out.println("Domain este: " + randomStrin1);

        System.out.println("Random Valid X characters " + DataGeneratorUtil.generateValidRandomEmilString(12));

        Customer customer1 = new Customer("NSAD", "ASDASD", -8);
        int cus = customer1.getAge();
        System.out.println(customer1.getName() + customer1.getSurName() + " cu varsta de: " + cus);
        customer1.setAge(58);
        System.out.println(customer1.getName() + customer1.getSurName() + " cu varsta de: " + customer1.getAge());
        customer1.setName("Ionel");
        customer1.setSurName("Butucel");
        System.out.println("Noul nume a clientului este :" + customer1.getName() + " " + customer1.getSurName() + " cu varsta de: " + customer1.getAge());

    }
}
