package accessmodifiers;

import accessmodifiers.peopleevidence.ChildPerson;
import accessmodifiers.peopleevidence.Person;

public class ChisisnauEvidenceCatalog {
    public static void main(String[] args) {

        Person andrei = new Person();
        andrei.isRetired = false;
        andrei.setIdnp(5466464);
        if (!andrei.isRetired) {
            System.out.println("Andrei cu IDNP: " + andrei.getIdnp() + " nu-i la pensie");
        } else {
            System.out.println("Andrei cu IDNP: " + andrei.getIdnp() + " este la pensie");
        }
        ChildPerson cristina = new ChildPerson("Cristina", 454545, true);
        if (!cristina.isRetired) {
            System.out.println(cristina.getName() + " cu IDNP: " + cristina.getIdnp() + " nu-i la pensie");
        } else {
            System.out.println(cristina.getName() + " cu IDNP: " + cristina.getIdnp() + " ii babuta");
        }

        ChildPerson vasile = new ChildPerson("Vasile", 94946, "notMarital", false);
        if (vasile.isRetired) {
            System.out.println("Vasile ii babuta");
        } else {
            System.out.println(vasile.getName() + " cu IDNP: " + vasile.getIdnp() + " nu este la pensie");
        }
    }
}
