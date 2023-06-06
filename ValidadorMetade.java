package testes;
import dominio.*;

public class ValidadorMetade {
    public static void main(String[] args){
		System.out.println("[Laboratório I]\n Desafio: Validador - Etapa 01\n");
		
		//// Verificação da classe Loja
		Loja loja1 = new Loja ("E3", 5);
		System.out.println("[OK] Classe Loja identificada (construtor com dois parâmetros)");
		
		Loja loja2 = new Loja ("E7", 20, 2000);
		System.out.println("[OK] Classe Loja identificada (construtor com três parâmetros)");
		
		//public String getNome();
		System.out.println(loja1.getNome().equals("E3") ? "[OK] Método Loja.getNome()" : "[NOK] Método Loja.getNome()");
		
		//public void setNome(String nome);
		loja1.setNome("E10");
		System.out.println("[OK] Método Loja.setNome()");
		
		//public int getQuantidadeFuncionarios();
		System.out.println(loja1.getQuantidadeFuncionarios() == 5 ? "[OK] Método Loja.getQuantidadeFuncionarios()" : "[NOK] Método Loja.getQuantidadeFuncionarios()");

		//public void setQuantidadeFuncionarios(int quantidadeFuncionarios);
		loja1.setQuantidadeFuncionarios(3);
		System.out.println("[OK] Método Loja.setQuantidadeFuncionarios()");

		//public double getSalarioBaseFuncionario();
		System.out.println(loja1.getSalarioBaseFuncionario() == -1 ? "[OK] Método Loja.getSalarioBaseFuncionario()" : "[NOK] Método Loja.getSalarioBaseFuncionario()");

		//public void setSalarioBaseFuncionario(double salarioBaseFuncionario);
		loja1.setSalarioBaseFuncionario(3000);
		System.out.println("[OK] Método Loja.setSalarioBaseFuncionario()");
		
		//public String toString();
		loja1.toString();
		System.out.println("[OK] Método Loja.toString()");
		
		//public double gastosComSalario();
		System.out.println(loja1.gastosComSalario() == 9000 ? "[OK] Método Loja.gastosComSalario()" : "[NOK] Método Loja.gastosComSalario()");
		
		//public char tamanhoDaLoja();
		System.out.println(loja1.tamanhoDaLoja() == 'P' ? "[OK] Método Loja.tamanhoDaLoja()" : "[NOK] Método Loja.tamanhoDaLoja()");
		
	
    }
}
