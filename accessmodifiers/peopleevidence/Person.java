package accessmodifiers.peopleevidence;

public class Person {
    public long getIdnp() {
        return idnp;
    }
    public void setIdnp(long idnp) {
        this.idnp = idnp;
    }
    //Private -instance variable
    private long idnp;
    //Default - instance variable;
    String maritalStatus;
    //Protected - instance variable;
    protected String name;
    //Public - instance variable;
    public boolean isRetired;
    public Person() {
        System.out.println("Constructor defined fara parametrii");
    }
    public Person(String name, long idnp, String maritalStatus, boolean isRetired) {
        this.name = name;
        this.idnp = idnp;
        this.maritalStatus = maritalStatus;
        this.isRetired = false;
    }
    public Person(String name, long idnp, boolean isRetired) {
        this.name = name;
        this.idnp = idnp;
        this.isRetired = isRetired;
    }

}
