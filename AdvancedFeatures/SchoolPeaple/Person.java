package SchoolPeaple;

public abstract class Person {
    String name;
    String address;




    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "name ->" + name + "address ->" + address ;
    }
}
