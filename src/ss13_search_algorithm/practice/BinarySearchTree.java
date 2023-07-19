package ss13_search_algorithm.practice;

public class BinarySearchTree {
    static  int[] list = {2,4,6,8,10,12,14,16};
    static int binarySearch(int[] list, int key){
        int low = 0;
        int high  = list.length -1;
        while (low <= high){
            int mid = (high + low) /2 ;
            if (list[mid] > key){
                high = mid - 1;
            }else if (list[mid] < key){
                low = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,8));
        System.out.println(binarySearch(list,14));
        System.out.println(binarySearch(list,16));
        System.out.println(binarySearch(list,9));
    }


}
