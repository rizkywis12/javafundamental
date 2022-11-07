public class Array {
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 4, 5};
        int[] arr2 = {1, 3, 5, 7};
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) {
                    System.out.print(i+ ",");
                }
            }
        }
    }
}