package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private static ArrayList<Moeda> moedas ;
	
	public Cofrinho() {
		moedas = new ArrayList<>();
	}
	public void adicionarMoeda (Moeda moeda) {           // Method to add Currency to the currency holder 
		moedas.add(moeda);
	}
	public void removerMoeda(int indice) {               // Method to remove a specific currency from the currency holder  
		if (indice >= 0 && indice < moedas.size()) {
			moedas.remove(indice);
		}
	}
	public void listarMoedas() {                         // Method that lists all currencies 
		System.out.println(" List of coins in the Currency holder: ");
		for (int i = 0 ; i < moedas.size(); i ++) {      // loop to loop through all coins in the vault
			Moeda moeda = moedas.get(i);                 // get the current currency at position 'i' in the currency list 
			System.out.println((i + 1 )+ " . " + moeda.getDescricao() + "- valor: " + moeda.getValor());  // print the coin description and value  
		                                                 // the index (i + 1 ) is used to display the currency numbering starting from 1 
		}
	}
	public static double calcularTotalEmReais(double taxaDolar, double taxaEuro) {  
		                                                 // calculate the total value in Real on the Currency holder 
		double total = 0.0 ;
		for (Moeda moeda : moedas) {
			if (moeda instanceof Dolar) {
				total+=moeda.getValor() * taxaDolar;
			}else if (moeda instanceof Euro) {
				total+= moeda.getValor() * taxaEuro;
			}else if (moeda instanceof Real) {
				total += moeda.getValor();               // no conversion is necessary for (Real)
		}
		}
		return total;
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

