import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c = 0;
        for(int i=2;i<=n-1;i++){
            
        
        if(n%i==0){
            c++;
        }
        }
        if(c==0){
            System.out.println("Its prime");
        }else{
            System.out.println("Its Not Prime");
        }
        
    }
}
