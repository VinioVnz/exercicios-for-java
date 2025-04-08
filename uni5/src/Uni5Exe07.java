import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("DIgite o numero de n: ");
        int n = input.nextInt();
        double maior = Double.MIN_VALUE;
        double menor = Double.MAX_VALUE;
        for(int i = 0; i < n; i++){
            System.out.println("Informe um numero: ");
            double numero = input.nextDouble();

            if(numero > maior){ 
                maior = numero;
            }
            if(numero < menor){
                menor = numero;
            }
        }
        input.close();
        System.out.println("Maior: "+maior);
        System.out.println("Menor: "+menor);
    }
}
