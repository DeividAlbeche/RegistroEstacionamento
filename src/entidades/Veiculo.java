package entidades;

public class Veiculo {

	String placa;
	String modelo;
	String cor;
	Cliente cliente;
	String tipo_veiculo;
	
	public Veiculo(String placa, String modelo, String cor, Cliente cliente, String tipo_veiculo) {
		
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.cliente = cliente;
		this.tipo_veiculo = tipo_veiculo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getTipo_veiculo() {
		return tipo_veiculo;
	}

	public void setTipo_veiculo(String tipo_veiculo) {
		this.tipo_veiculo = tipo_veiculo;
	}
	
	
	
	
}
