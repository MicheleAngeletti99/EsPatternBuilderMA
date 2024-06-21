public class Main {
    public static void main(String[] args) {
        PersonBuilder builder1 = new PersonBuilder();
        builder1.setFirstName("Michele");
        builder1.setLastName("Angeletti");
        builder1.setAddress("Via spalato");
        Person michele = builder1.buildPerson();
        michele.stampaDettagli();

        PersonBuilder builder2 = new PersonBuilder();
        builder2.setFirstName("Riccardo");
        builder2.setLastName("Cavaleri");
        builder2.setAge(29);
        Person riccardo = builder2.buildPerson();
        riccardo.stampaDettagli();
    }
}