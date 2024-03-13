import java.util.NoSuchElementException;

public class Queue {
    Person front;
    Person rear;
    int length = 0;

    public Queue(){
        this.front = null;
        this.rear = null;
    }



    public void insertPerson(String lastName,String initials,String contactNum,String address){
        Person newPerson = new Person(contactNum);
        newPerson.lastName=lastName;
        newPerson.initials=initials;
        newPerson.address=address;

        if (front == null){
            this.front = newPerson;
        }else {
            this.rear.next = newPerson;
        }
        this.rear = newPerson;
        length++;
    }

    public String removeRegisteredPerson(){

        if (front == null){
            throw new NoSuchElementException("All the registered person are donated dry foods...");
        }
        String  temp = this.front.contactNumber;
        this.front = this.front.next;
        if(front == null){
            rear = null;
        }
        System.out.println("contact number : "+temp+ " was given dry foods");
        length--;
        return temp;


    }


    public void printRegisteredList(){
        if (front == null){
            System.out.println("No person to display");
        }
        Person temp = this.front;
        while (temp != null){
            System.out.println(temp.lastName);
            System.out.println(temp.initials);
            System.out.println(temp.contactNumber);
            System.out.println(temp.address);

            //  System.out.println();
            temp = temp.next;
        }
        System.out.println();
    }

    public void getPersonDetails(String contactNum){

    }




}
