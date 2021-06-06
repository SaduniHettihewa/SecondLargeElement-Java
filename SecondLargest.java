package secondlargest;

public class SecondLargest {

    public static void main(String[] args) {

// demo for finding second large number in arry

        int largest = 0;
        int secontLargest = 0;

        int[] arry = {20,5, 8, 9, 18, 5, 20, 20, 8, 19, 19};

        for (int i = 0; i < arry.length; i++) {
            if (arry[i] > largest) {
                secontLargest = largest;
                largest = arry[i];
            } else if (arry[i] == largest) {
                largest = arry[i];

            } else if (arry[i] > secontLargest) {
                secontLargest = arry[i];
            }
        }
        System.out.println("second large no is : " + secontLargest);
        
    }

}
