public class PersonBuilder {

    private String firstName;
    private String lastName;
    private Integer age;
    private String address;

    public PersonBuilder() {
        this.age = 0;
        this.address = "";
    }

    public String getFirstName() {
        return firstName;
    }

    public PersonBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public PersonBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Integer getAge() {
        return age;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person buildPerson() {
        return new Person(this);
    }
}
