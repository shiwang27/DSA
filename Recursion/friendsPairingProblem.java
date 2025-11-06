package Recursion;

public class friendsPairingProblem {

    public static int totalPairs(int n){

        if(n==1||n==0){
            return n;
        }
        return totalPairs(n-1) + (n-1) * totalPairs(n-2);
    }

    public static void main(String[] args) {
        System.out.println(totalPairs(3));
        
    }

}
