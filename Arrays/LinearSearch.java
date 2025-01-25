package Arrays;

public class LinearSearch{
    public static int linearSearch(int[] num, int key) {

        for(int i=0; i<num.length; i++){
            if(num[i]==key){
                return i;
            }
        }return -1;
    }
    public static void main(String[] args) {
        int num[]={24,77,67,90,23,56,78};
        int key = 77;
        int c=linearSearch(num, key);
        System.out.println("Index of the num "+key+" in the array is: "+c);

        
    }

}