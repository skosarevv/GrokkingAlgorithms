public class Main {
    public static void main(String[] args) {
        int[] array = new int[] { 1, 3, 11, 18, 39, 45, 61, 127, 193, 247, 298, 1000 };
        
        System.out.println(binarySearch(array, 18));
        System.out.println(binarySearch(array, 247));
        System.out.println(binarySearch(array, 3));
    }

    public static int binarySearch(int[] arr, int itemToFind) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;
            if (arr[mid] == itemToFind) {
                return mid;
            }
            if (arr[mid] < itemToFind) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}