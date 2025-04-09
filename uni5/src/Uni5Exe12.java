import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a quantidade de n: ");
        int n = input.nextInt();

        input.close();
        
        int num = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
