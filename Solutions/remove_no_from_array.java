public class Main {
    public static void main(String[] args) {
        // create an example array
        int[] arr = {10, 20, 30, 40, 50, 60};
        int removeno = 20;
        System.out.println("Old Array before removing "+removeno+":");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        // remove number 4 from the array
        
        int[] ar = removeNum(arr, removeno);

        // print the new array
        System.out.println("\nNew Array after removing "+removeno+":");
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static int[] removeNum(int[] ar, int rno) {
        // creating a new array with the size less by 1
        int[] na = new int[ar.length - 1];

        // copying all elements from the original array to the new array except the given number
        int j = 0;
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != rno) {
                na[j] = ar[i];
                j++;
            }
        }

        return na;
    }
}