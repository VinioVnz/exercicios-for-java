import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Digite o valor de n: ");
       int n = input.nextInt();
       double menorNeg = Double.MAX_VALUE;
       double soma = 0;
       int contadorPos =0;
        for(int i = 0; i < n; i++){
            System.out.println("Digite um numero: ");
            double numero = input.nextDouble();
            if(numero < 0){
                menorNeg = numero;
            }else{
                soma += numero;
                contadorPos +=1;
            }
        }
        double media = soma / contadorPos; 
        input.close();
       System.out.println("Menor valor negativo: "+menorNeg);
       System.out.println("Média dos números positivos: "+media);

    }
}
