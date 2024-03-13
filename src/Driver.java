public class Driver {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.insertPerson("Gunapala","X.Y.Z","0771234567","NO 01, Peradeniya road, Kandy");
        q1.insertPerson("Matilda","P.Q.R","0701239876","No 03/A, Agunawala");
        q1.insertPerson("Padmavati","A.B.D","0812345689","No 123, Peradeniya");
        q1.printRegisteredList();
        q1.removeRegisteredPerson();
        q1.printRegisteredList();
    }
}
