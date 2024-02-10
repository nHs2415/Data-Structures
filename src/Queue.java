public class Queue {
    QueueNode front;
    QueueNode rear;
    int length;

    public Queue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    //Method to checks weather a vehicle is in the access road
    public void inLine(int vehicle_id_num){

        QueueNode temp = front;
        int count = -1;
          while (temp != null){

              if (temp.vic == vehicle_id_num){
                  System.out.println("Found!...Vehicle is in the line.");
                  System.out.println("There are " + count + " vehicles before " + vehicle_id_num + " vehicle");
              }else {
                  System.out.println("Oops... " + vehicle_id_num + "  vehicle number is not found.");
              }
              temp = temp.next;
              count ++;
          }
        System.out.println("");

    }

    //adds the vehicles to the list
    public void enterForService(int vehicle_id_num,String vehicleType, String serviceType){
        QueueNode newVehicle = new QueueNode(vehicle_id_num,vehicleType,serviceType);

        if (this.front == null){
            this.front = this.rear = newVehicle;
            return;
        }

        this.rear.next = newVehicle;
        this.rear = newVehicle;

    }

    //exit a vehicle from queue
    public void exitService(int vehicle_id_num){

        if (this.front == null){
            return;
        }

        QueueNode temp = this.front;
        if (vehicle_id_num != front.vic){
            System.out.println("ERROR... " +temp.vic + " is being servicing...you cannot exit");
        }else {
            System.out.println("service is almost done...you can exit");
            this.front = this.front.next;

            if (this.front == null)
                this.rear = null;
        }

    }

    //print vehicle details
    public void showQueue(){
        QueueNode temp = this.front;

        while (temp != null){
            System.out.println("Vehicle Identification Number : "+temp.vic+ "   Vehicle Type : " + temp.vehicleType + "     Service Type : "+ temp.serviceType);
            temp = temp.next;
        }
        System.out.println("");
    }
}
