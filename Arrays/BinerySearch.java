package Arrays;

public class BinerySearch {
    public static int binerySearch(int[] num, int key) {
        int start = 0;
        int end = num.length-1;
        
        while(end>=start){
            int mid = (start+end)/2;
            if(key<num[mid]){
                end=mid-1;
            }
            if(key>num[mid]){
                start=mid+1;
            }
            if(key==num[mid]){
                return mid;
            } 
        }
        return -1;
    }
    public static void main(String[] args) {
        int num [] = {10,20,30,40,50,60,70,80,90,100};
        int key =70;
        int a = binerySearch(num, key);
        System.out.println("Index of the key is: "+a);
    }
}
