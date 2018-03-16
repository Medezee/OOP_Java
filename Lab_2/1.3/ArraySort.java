public class ArraySort {

    public static void main(String[] args) {
        int[] array = {30, 2, 10, 4, 6};
        int length = array.length;

        int tm;

        for (int j = 0; j < length - 1; j++){
            for (int i = 0; i < length - 1; i++){
                if (array[i] > array[i+1]){
                    tm = array[i];
                    array[i] = array[i+1];
                    array[i+1] = tm;
                }
            }
        }

        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}