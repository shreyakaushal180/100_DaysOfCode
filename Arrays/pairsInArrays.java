package Arrays;

public class pairsInArrays {
    public static void pairs_in_array(int num []){
        for(int i = 0; i < num.length ; i++ ){
            int current = num[i];
            for(int j = i+1; j<num.length; j++){
                System.out.print("("+current+","+ num[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        pairs_in_array(num);
    }    
}
