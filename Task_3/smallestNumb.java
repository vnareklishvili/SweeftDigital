package Task_3;

public class smallestNumb {
    public static void main(String[] args) {

        int [] arr = new int [] {1, 12, 7, 75, 56};
        int min = arr[0];
        int x = 0;

        for (int i = 0; i < arr.length; i++) {

            if(0 < x )
                min = x;
        }
        System.out.println("Smallest element present in given array: " + min);
    }
}
