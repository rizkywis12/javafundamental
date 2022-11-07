public class Sorting {
    static void sortAngka(int[] arr) {
        int n = arr.length;
        int hasil = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
                if(arr[j-1] > arr[j]){
                    hasil = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = hasil;
                }

            }
        }

    }
    public static void main(String[] args) {
        int arr[] ={3,2,4,1,5};
        sortAngka(arr);
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
}

