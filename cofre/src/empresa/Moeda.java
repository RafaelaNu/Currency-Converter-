package empresa;

abstract class Moeda {
	protected double valor ;

	public Moeda(double valor) {
		super();
		this.valor = valor;
	}
	public double getValor(){
	   return valor;
	}
	public abstract String getDescricao(); // Retorna Descricao da Moeda // 
	

}
