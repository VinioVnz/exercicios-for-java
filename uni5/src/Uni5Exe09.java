import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o número de n: ");
        int n = input.nextInt();
        
        String nomes = "";
        int numIdades = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Digite o nome: ");
            String nome = input.next();
            
            System.out.println("Digite a idade: ");
            int idade = input.nextInt();
           
            if(idade == 18){
                if(nomes.isEmpty()){
                    nomes = nome;
                }else{
                    nomes = nomes + " e " + nome;

                }
            }
            if(idade > 20){
                numIdades++;
            }
            
        }

        input.close();
        System.out.println("Nomes dos alunos que tem 18 anos: "+nomes);
        System.out.println("Quantidade de alunos que tem idade acima de 20 anos: "+numIdades);
    }
}
