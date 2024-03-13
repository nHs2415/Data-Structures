public class Person {
    String lastName;
    String initials;
    String contactNumber;
    String address;
    Person next;

    public Person(String contactNumber){
        this.contactNumber=contactNumber;
        this.next = null;
    }

    public Person(String lastName, String initials, String contactNumber, String address) {
        this.lastName = lastName;
        this.initials = initials;
        this.contactNumber = contactNumber;
        this.address = address;
    }
}
