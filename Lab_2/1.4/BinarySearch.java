public class BinarySearch {

    public static void main(String[] args) {

        int data[] = { 3, 6, 7, 10, 34, 56, 60 };
        int numberToFind = 10;

        int position = -1;
        int min = 0;
        int max = data.length -1;
        int result = -2;
        
        
        while (min <= max) {
        	int center = (min + max)/2;
        	if (numberToFind == data[center]) {
        		result = center;
        		break;
        	}
        	else if(numberToFind < data[center]) {
        		max = center - 1;
        	}
        	else {
        		min = center + 1;
        	}
        }
        if(result > position) {
        	System.out.println(result);
        }
        else
        	System.out.println(position);
    }
}