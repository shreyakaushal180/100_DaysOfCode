package func;

public class checkprime {
    public static boolean cheakPrime(int num){
        boolean isPrime = true;
        if(num==2){
            return true;
        }
        for(int i = 2; i <= (int)Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }return true;
    }
    public static void rangeOfPrime(int n,int m) {
        for (int i = n; i<=m; i++ ){
            if(cheakPrime(i)){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        
    }
    public static void main(String[] args) {
        rangeOfPrime(6,100);
    }
    
}
