package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
        
		while (true) {                                   // Program Menu //
			System.out.println(" 1 - Add a Coin");
			System.out.println(" 2 - Remove a Coin");
			System.out.println(" 3 - List the coins");
			System.out.println(" 4 - Calculate the Total in Brazilian Real");
			System.out.println(" 5 - Exit");
            int opcao = scanner.nextInt();
            
            switch (opcao) { // add currencies to converter //
            case 1:
            	System.out.println(" 1 - Dollar");
            	System.out.println(" 2 - Euro");
            	System.out.println(" 3 - Real");
            	int tipoMoeda = scanner.nextInt();
            	System.out.println(" Enter the Currency Value: ");
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
            		System.out.println(" Invalid Option.");
            		break;
            	}
            	if (moeda != null) {
					cofrinho.adicionarMoeda(moeda);
            		System.out.println("The coin has been added!");	
            	}
            	break;
            case 2 : // Removing coins*/
            	System.out.println("Enter the index of the currency to be removed (1-Dollar , 2-Euro , 3-Real :");
            	int indiceMoeda = scanner.nextInt();
            	cofrinho.removerMoeda(indiceMoeda - 1);
            	System.out.println(" The coin has been removed!");
            	break;
            case 3 :
            	cofrinho.listarMoedas();// List all currencies present in the converter //
            	break;
            case 4 :                    // Dollar and Euro values for conversion into Brazilian Real//
            	double taxaDolar = 5.0;
            	double taxaEuro = 5.30;
            	double totalReais = Cofrinho.calcularTotalEmReais(taxaDolar , taxaEuro);
            	System.out.println(" Total in Real:  R$ " + totalReais);
            	break;
            case 5 :                   // program exit//
            	System.out.println(" Leaving the program.");
            	scanner.close();
            	System.exit(0);
            default : 
            	System.out.println(" Invalid option!");
            	break ;
            	
            	}
            }
	   }
   }
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	