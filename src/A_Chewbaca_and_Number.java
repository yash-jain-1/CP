import java.util.Scanner;

public class A_Chewbaca_and_Number{
    public static void main(String[] args) {
        for(int i= 0;i<3;i++){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int temp = n;
            int count  = 0;
            while (temp>0){
                temp= temp-temp%10;
                count++;
            }
            for(int j = 0;j<count;j++){
                int digit = n%10;
                if(digit==9 && j==0){
                    System.out.print(digit);
                }
                else if(digit>4){
                    System.out.print(9-digit);
                }
                else{
                    System.out.print(digit);
                }
                n=n/10;
            }
        }
    }
}
