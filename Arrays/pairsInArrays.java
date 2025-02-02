package Arrays;

public class pairsInArrays {
    public static void pairs_in_array(int num []){
        int totalPairs=0;
        for(int i = 0; i < num.length ; i++ ){
            int current = num[i];
            for(int j = i+1; j<num.length; j++){
                System.out.print("("+current+","+ num[j]+")");
                totalPairs++;
            }
        }System.out.println();
        System.out.println("Total number of possible pairs: "+totalPairs);
    }
    public static void main(String[] args) {
        int num [] = {1,2,3,4,5};
        pairs_in_array(num);
    }    
}
