import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double media = 0;
        double soma = 0;
        for(int i = 0; i < 20; i++){
            double altura = input.nextDouble();
            soma += altura;
        }
        input.close();
        media = soma/20;
        System.out.println("media: "+media);
    }
}
