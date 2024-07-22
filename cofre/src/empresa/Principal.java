package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
        
		while (true) {                                   // menu do programa //
			System.out.println(" 1 - Adicionar Moeda");
			System.out.println(" 2 - Remover Moeda");
			System.out.println(" 3 - Listar Moedas");
			System.out.println(" 4 - Calcular Total em reais");
			System.out.println(" 5 - Sair");
            int opcao = scanner.nextInt();
            
            switch (opcao) { // adicionar moedas ao cofrinho//
            case 1:
            	System.out.println(" 1 - Dolar");
            	System.out.println(" 2 - Euro");
            	System.out.println(" 3 - Real");
            	int tipoMoeda = scanner.nextInt();
            	System.out.println(" Digite o valor da Moeda");
            	double valorMoeda = scanner.nextDouble();
            	
            	Moeda moeda = null;
            	switch (tipoMoeda) {
            	case 1 :
            		moeda = new Dolar(valorMoeda);
            		break;
            	case 2 :
            		moeda = new Euro(valorMoeda);
            		break;
            	case 3 :
            		moeda = new Real(valorMoeda);
            		break;
            	default :
            		System.out.println(" Opcao invalida.");
            		break;
            	}
            	if (moeda != null) {
					cofrinho.adicionarMoeda(moeda);
            		System.out.println("Moeda adicionada ao cofrinho");	
            	}
            	break;
            case 2 : // Remover moedas do cofrinho*/
            	System.out.println("Digite o indice da moeda a ser removida(1-Dolar , 2-Euro , 3-Real :");
            	int indiceMoeda = scanner.nextInt();
            	cofrinho.removerMoeda(indiceMoeda - 1);
            	System.out.println(" Moeda removida do cofrinho");
            	break;
            case 3 :
            	cofrinho.listarMoedas();// listar todas as moedas presente no cofrinho //
            	break;
            case 4 :                    // valores do Dolar e Euro para conversao em Real//
            	double taxaDolar = 5.0;
            	double taxaEuro = 5.30;
            	double totalReais = Cofrinho.calcularTotalEmReais(taxaDolar , taxaEuro);
            	System.out.println(" Total em Reais no cofrinho:  R$ " + totalReais);
            	break;
            case 5 :                   // saida do programa//
            	System.out.println(" Saindo do programa.");
            	scanner.close();
            	System.exit(0);
            default : 
            	System.out.println(" Opcao invalida");
            	break ;
            	
            	}
            }
	   }
   }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	