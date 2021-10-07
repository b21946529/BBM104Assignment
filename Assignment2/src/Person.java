public class Person {
    private int uniqueID;
    private String name;
    private String surname;
    private String country;

    public Person(int uniqueID, String name, String surname, String country) {
        this.uniqueID = uniqueID;
        this.name = name;
        this.surname = surname;
        this.country = country;
    }

    public Person() {

    }

    public int getUniqueID() {
        return uniqueID;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
