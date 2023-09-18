package accessmodifiers.peopleevidence;

public class ChildPerson extends Person {
    public String getName() {
        return this.name;
    }

    public ChildPerson(String name, long idnp, String maritalStatus, boolean isRetired) {
        this.name = name;
        setIdnp(idnp);
        this.maritalStatus = maritalStatus;
        this.isRetired = false;
    }

    public ChildPerson(String name, long idnp, boolean isRetired) {
        this.name = name;
        setIdnp(idnp);
        this.isRetired = isRetired;
    }
}
