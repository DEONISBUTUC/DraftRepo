package ta_2_autoservice;

public class Handler {
    public static void main(String[] args) {
        Car car1 = new Car("Audi","CRT 125",25545);

        Garage autoDoctor = new Garage();
        autoDoctor.name = "Autodoctor";
        autoDoctor.address = "Stefan cel Mare 32";
        autoDoctor.phoneNumber = 79025874;
        autoDoctor.postalCode = 24850;

        Worker worker1 = new Worker();
        worker1.name = "Ion";
        worker1.isAvailable = false;

        System.out.println("Bine ati venit la " + autoDoctor.name + " care este situat pe strada: " + autoDoctor.address);
        System.out.println("In scurt timp masina dumnevoastra de marca " + car1.name + " cu numarul de imatriculare " + car1.plateNumber + " va fi luata in lucrul de mecanicul " + worker1.name );
        System.out.println("In caz ca aveti careva intrebari ne puteti contacta la nr de tel " + autoDoctor.phoneNumber);
    }
}
