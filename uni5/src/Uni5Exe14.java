import java.util.Scanner;

public class Uni5Exe14 {
    /* 
     * Um comerciante deseja fazer um levantamento do lucro das 20 mercadorias que comercializa. Para cada mercadoria ele tem o nome, 
     * o preço de compra (PC) e o preço de venda (PV). Descreva um algoritmo que:
     * escreva quantas mercadorias proporcionam: (lucro < 10%), (10% <= lucro <= 20%) e (lucro > 20%), onde o percentual de lucro é
     * calculado da seguinte forma: % = (PV - PC) / PC * 100;
     * determine e escreva o valor total de compra e de venda de todas as mercadorias, assim como o lucro total.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int quantMenos10 = 0;
        int quantMeio = 0;
        int quantMaior20 = 0;
        double valorTotalCompra = 0;
        double valorTotalVenda = 0;
        double lucroTotal = 0;
        for(int i = 0; i < 3; i++){
            System.out.println("Digite o nome do produto");
            String nomeProduto = input.next();
            
            System.out.println("Digite o preco de compra");
            double precoCompra = input.nextDouble();
            valorTotalCompra += precoCompra;

            System.out.println("Digite o preco de venda");
            double precoVenda = input.nextDouble();
            valorTotalVenda += precoVenda;

            double lucro = precoVenda - precoCompra;
            lucroTotal += lucro;
            double porcentagem = lucro / precoCompra *100;

            if(porcentagem < 10){
                quantMenos10++;
            }
            else if(10 <= porcentagem && porcentagem <= 20){
                quantMeio++;
            }else{
                quantMaior20++;
            }
            
        }
        input.close();
            
            System.out.println("Quantidade de produtos com lucro abaixo de 10%: "+quantMenos10);
            System.out.println("Quantidade de produtos com lucro acima de 10% e abaixo de 20%: "+quantMeio);
            System.out.println("Quantidade de produtos com lucro acima de 20%: "+quantMaior20);

            System.out.println("Valor total de compra: "+valorTotalCompra);
            System.out.println("Valor total de venda: "+valorTotalVenda);
            System.out.println("Lucro total: "+lucroTotal);
    }
}
