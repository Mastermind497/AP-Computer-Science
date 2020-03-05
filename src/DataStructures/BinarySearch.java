package DataStructures;

public class BinarySearch {
    public static void main(String[] args) {
        int[] integer = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(binarySearch(integer, 11));
    }
    public static boolean binarySearch(int[] arr, int x) {
        int min = 0;
        int max = arr.length - 1;
        while (min <= max) {
            int mid = (min + max) / 2;

            if (arr[mid] < x) min = mid + 1;
            else if (arr[mid] > x) max = mid - 1;
            else return true;
        }
        return false;
    }
}
