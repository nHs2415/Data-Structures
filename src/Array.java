public class Array {
    public void printArray(int[] arr){
        int n = arr.length;
        for (int i = 0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void arrayDemo(){
        int[] myArray = new int[5];
        myArray[0] = 5;
        myArray[1] = 6;
        myArray[2] = 7;
        myArray[3] = 8;
        myArray[4] = 10;
        printArray(myArray);

        System.out.println( myArray.length);

        System.out.println(myArray[myArray.length-1]);

        int[] arr = {5,1,8,10};
        printArray(arr);

        printArray(new int[] {5,1,2,9});
    }

    //given an array of integers, return an array with even integers removed.
    //arr = {3,2,4,7,10,6,5}
    //arr = {3, 7, 5}
    public void removeEvenNum(int[] array){

        int oddCount = 0;
        for (int i = 0; i<array.length; i++){
            if (array[i] %2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount+1];
        int index = 0;
        for (int j = 0; j<array.length; j++){
            if (array[j] %2 != 0){
                result[index] = array[j];
                System.out.print(result[index]+" ");
                index++;

            }

        }
        System.out.println();


    }

    public static void main(String[] args) {
        Array array = new Array();
        array.arrayDemo();

        int[] arr = {3,2,4,7,1,10,6,5};
        array.removeEvenNum(arr);
    }
}
