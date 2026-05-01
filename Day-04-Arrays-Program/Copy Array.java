public class CopyArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] copy = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        for(int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + " ");
        }
    }
}
//1 2 3
