import java.util.Scanner;

public class Uni5Exe13 {
    /* 
     * Um motorista acaba de voltar de um feriado prolongado. Antes de sair de viagem e imediatamente após retornar,
     *  o motorista encheu o tanque do veículo e registrou as medidas do odômetro. Em cada parada feita durante a viagem, 
     * foi registrado o valor do odômetro e a quantidade de combustível comprado para reabastecer o veículo 
     * (suponha que o tanque foi enchido a cada parada). Descreva um algoritmo que leia o número total de reabastecimentos 
     * feitos e os dados registrados relativos à compra de combustível. Calcule e escreva:

a quilometragem obtida por litro de combustível em cada parada;
a quilometragem média obtida por litro de combustível em toda a viagem.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero total de reabastecimentos: ");
        int numReabastecimentos = input.nextInt();
        double somaTotal = 0;
        double mediaTotal = 0;
        for(int i = 0; i < numReabastecimentos; i++){
            System.out.println("Digite a Quilometragem em km: ");
            double quilometragem = input.nextDouble();
            
            System.out.println("Digite o combustivel em litros: ");
            double combustivel = input.nextDouble();
            double  mediaQuilo = quilometragem / combustivel;
            somaTotal += mediaQuilo;

            System.out.println("Quilometragem por litro: "+mediaQuilo);

        }
        input.close();
        mediaTotal = somaTotal / numReabastecimentos;
        System.out.println("Media total: "+mediaTotal);
    }
}