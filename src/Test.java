public class Test {
    public static void main(String[] args) {
        NoDupArray nd=new NoDupArray(10);
        nd.insert(4);
        nd.insert(8);
        nd.insert(34);
        nd.insert(-7);
        nd.insert(47);
        nd.insert(21);
        nd.insert(7);
        nd.insert(1);
        nd.insert(19);
        nd.display();
        nd.insert(3);
        nd.insert(6);
        nd.delete(21);
        nd.display();
    }
}

class NoDupArray {
    private long[] a;//ref to array a
    private int nEliments;//number of data items

    public NoDupArray(int max) {//constructor
        //Fill the body
        this.a = new long[max];
        this.nEliments = 0;
    }

    public boolean find(long SearchKey) {//find specified value
        for (int i = 0; i < this.nEliments; i++) {
            if (this.a[i] == SearchKey) {
                return true;
            }
        }
        return false;
    }// end find()

    public void insert(long value) {//put element into array
        if (this.nEliments == this.a.length) {
            System.out.println("the array is full.insertion terminated");
        } else {
            if (find(value)) {
                System.out.println("value duplicated.Insertion terminated.");
            } else {
                this.a[nEliments] = value;
                this.nEliments++;
                System.out.println("value inserted");
            }
        }
    }//end insert()

    public boolean delete(long value) {//delete the element if it found
        if (this.nEliments == 0) {
            System.out.println("array is empty.deletion terminated");
            return false;
        }
        for (int i = 0; i < this.nEliments; i++) {
            if (this.a[i] == value) {
                for (int j = i; j <= this.nEliments - 1; j++) {
                    this.a[j] = this.a[j + 1];
                }
                nEliments--;
                System.out.println("value deleted");
                return true;
            }
        }
        System.out.println("value deleted");
        return false;
    }//end delete()
    public void display () {//display array contents
        for (int i = 0; i < this.nEliments; i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    } //end display()
}
