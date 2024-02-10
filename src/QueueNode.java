public class QueueNode {
    int vic;
    String vehicleType;
    String serviceType;
    QueueNode next;

    public QueueNode(int vic,String vehicleType,String serviceType){
        this.vic = vic;
        this.vehicleType = vehicleType;
        this.serviceType = serviceType;
        this.next = null;
    }
}
