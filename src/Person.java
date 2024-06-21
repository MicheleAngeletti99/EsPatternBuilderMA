public class Person {

    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void stampaDettagli() {
        System.out.println(firstName + " " + lastName);
        if (age.equals(0)) {
            System.out.println("Età non inserita");
        } else {
            System.out.println("Età: " + age);
        }
        if (address.isEmpty()) {
            System.out.println("Indirizzo non iserito");
        } else {
            System.out.println("Indirizzo: " + address);
        }
        System.out.println();
    }
}
