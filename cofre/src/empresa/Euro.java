package empresa;

public class Euro extends Moeda{

	public Euro(double valor) {
		super(valor);
	}	
	@Override
	public String getDescricao() {
		return "Euro";
	}

}