package entidades;

public class Veiculo {

	String placa;
	String modelo;
	String cor;
	Cliente cliente;
	
	public Veiculo(String placa, String modelo, String cor, Cliente cliente) {
		
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.cliente = cliente;
	}
	
	
	
}
