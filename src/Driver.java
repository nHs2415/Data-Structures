public class Driver {
    public static void main(String[] args) {
        Queue q1 = new Queue();
        q1.enterForService(5423,"Car","Full Service");
        q1.enterForService(3456,"Van","Body Wash Only");
        q1.enterForService(3455,"SUV","Interior Cleaning Only");
        q1.enterForService(2635,"Jeep","Oil Change Only");
        q1.enterForService(5246,"Lorry","Body Wash Only");

        q1.showQueue();

        q1.exitService(5423);
        q1.showQueue();

        q1.exitService(5246);

        q1.inLine(5246);

        q1.inLine(5678);
    }
}
