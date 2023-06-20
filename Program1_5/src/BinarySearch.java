public class BinarySearch {

    public static void main(String[] args) {
        int data[] = {3, 6, 7, 10, 34, 56, 60};
        int numberToFind = 10;

        int result = binarySearch(data, numberToFind);

        if (result == -1) {
            System.out.println(-1);
        } else {
            System.out.println(result);
        }
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (array[mid] == target) {
                return mid; 
            }

            if (array[mid] < target) {
                left = mid + 1; 
            } else {
                right = mid - 1; 
            }
        }

        return -1; 
    }
}