package dominio;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        

        int opcao = 0;
        while(opcao != 3){

        System.out.println("===========MENU===========");
        System.out.println("== 1 - Nova Loja        ==");
        System.out.println("== 2 - Novo Produto     ==");
        System.out.println("== 3 - SAIR             ==");
        System.out.println("==========================");
        

        Scanner scan = new Scanner(System.in);
        

        opcao = Integer.parseInt(scan.nextLine());

        if(opcao == 1){
        
        Loja loja = new Loja("AA", 0, 0);

        System.out.println("Digite nome da Loja: ");
        // loja.setNome("E3");
        loja.setNome(scan.nextLine());
        
        System.out.println("Digite quantidade de funcionários: ");
        loja.setQuantidadeFuncionarios(Integer.parseInt(scan.nextLine()));

        System.out.println("Digite Salário base dos funcionários: ");
        loja.setSalarioBaseFuncionario(Double.parseDouble(scan.nextLine()));

        System.out.println("Loja criada com sucesso!");
        

        }

        if(opcao == 2){
            Produto prod = new Produto(" ", 0);

            System.out.println("Digite nome do produto: ");
            prod.setNome(scan.nextLine());

            System.out.println("Digite valor do produto: ");
            prod.setPreco(Double.parseDouble(scan.nextLine()));

            System.out.println("Produto cadastrado com sucesso! ");

        }

        if(opcao == 3){
            System.out.println("Saindo da aplicação...");
            scan.close();
        }
    }
    
    }
        

            
    
}
