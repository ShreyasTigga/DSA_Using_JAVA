public class BinarySearch {

    public boolean binarySearch(int[] arr, int low, int high, int target){

        int mid = low + (high - low) / 2;
        
        if(low < high){
            if(target == arr[mid]){
                return true;
            }
            else if (target > arr[mid]){
                return binarySearch(arr, mid + 1, high, target);
            }
            else{
                return binarySearch(arr, low, mid - 1, target);
            }
        }
        else{
            return false;
        }
        
    }

    public static void main(String[] args){
        int[] arr = {2,5,7,8,10,15,17,23,32,45,64};
        int len = arr.length;

        int target = 9;

        BinarySearch obj = new BinarySearch();

        boolean found = obj.binarySearch(arr, 0, len - 1, target);

        System.out.println(found);
    }
}
