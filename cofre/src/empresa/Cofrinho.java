package empresa;

import java.util.ArrayList;

public class Cofrinho {
	private static ArrayList<Moeda> moedas ;
	
	public Cofrinho() {
		moedas = new ArrayList<>();
	}
	public void adicionarMoeda (Moeda moeda) {           // Metodo para adicionar moeda ao cofrinho
		moedas.add(moeda);
	}
	public void removerMoeda(int indice) {               // Metodo para remover uma moeda especifica do cofrinho
		if (indice >= 0 && indice < moedas.size()) {
			moedas.remove(indice);
		}
	}
	public void listarMoedas() {                         // Metodo que lista todas as moedas no cofrinho 
		System.out.println(" Moedas no cofrinho : ");
		for (int i = 0 ; i < moedas.size(); i ++) {      // loop para percorrer todas as moedas no cofrinho
			Moeda moeda = moedas.get(i);                 // obter a moeda atual na posicao 'i' da lista de moedas 
			System.out.println((i + 1 )+ " . " + moeda.getDescricao() + "- valor: " + moeda.getValor());  // imprimir a descricao e o valor da moeda 
		                                                 // o indice (i + 1 ) e utilizado para exibir a numeracao da moeda comecando de 1
		}
	}
	public static double calcularTotalEmReais(double taxaDolar, double taxaEuro) {  
		                                                 // calcula o valor total em reais no cofrinho 
		double total = 0.0 ;
		for (Moeda moeda : moedas) {
			if (moeda instanceof Dolar) {
				total+=moeda.getValor() * taxaDolar;
			}else if (moeda instanceof Euro) {
				total+= moeda.getValor() * taxaEuro;
			}else if (moeda instanceof Real) {
				total += moeda.getValor();               // nao e necessario conversao 
		}
		}
		return total;
	}
}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	

