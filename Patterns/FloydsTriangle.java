public class FloydsTriangle {
    public static void floydsTriangle(int n){
        int a = 1;
        for (int i = 1 ; i<=n ; i++){
            for(int j =1; j<=i; j++){
                System.out.print(a+" ");
                a++;
            }System.out.println();
        }
    }
    public static void main(String[] args) {
        floydsTriangle(7);
    }
}
