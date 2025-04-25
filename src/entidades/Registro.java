package entidades;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDate;

public class Registro {

	int id;
	Timestamp hora_entrada;
	Timestamp hora_saida;
	LocalDate data_registro;
	double valor_total;
	Cliente cliente;
	Veiculo veiculo;
	
	public Registro(int id, Timestamp hora_entrada, Timestamp hora_saida, LocalDate data_registro, double valor_total, Cliente cliente,
			Veiculo veiculo) {
		
		this.id = id;
		this.hora_entrada = hora_entrada;
		this.hora_saida = hora_saida;
		this.data_registro = data_registro;
		this.valor_total = valor_total;
		this.cliente = cliente;
		this.veiculo = veiculo;
	}
	
	

	public Registro(Timestamp hora_entrada, Timestamp hora_saida, LocalDate data_registro, double valor_total, Cliente cliente,
			Veiculo veiculo) {
		
		this.hora_entrada = hora_entrada;
		this.hora_saida = hora_saida;
		this.data_registro = data_registro;
		this.valor_total = valor_total;
		this.cliente = cliente;
		this.veiculo = veiculo;
		
	}



	public Registro() {
		
	}



	@Override
	public String toString() {
		return "Registro [id=" + id + ", hora_entrada=" + hora_entrada + ", hora_saida=" + hora_saida
				+ ", data_registro=" + data_registro + ", valor_total=" + valor_total + ", cliente=" + cliente
				+ ", veiculo=" + veiculo + "]";
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public Timestamp getHora_entrada() {
		return hora_entrada;
	}



	public void setHora_entrada(Timestamp hora_entrada) {
		this.hora_entrada = hora_entrada;
	}



	public Timestamp getHora_saida() {
		return hora_saida;
	}



	public void setHora_saida(Timestamp hora_saida) {
		this.hora_saida = hora_saida;
	}



	public LocalDate getData_registro() {
		return data_registro;
	}



	public void setData_registro(LocalDate data_registro) {
		this.data_registro = data_registro;
	}



	public double getValor_total() {
		return valor_total;
	}



	public void setValor_total(double valor_total) {
		this.valor_total = valor_total;
	}



	public Cliente getCliente() {
		return cliente;
	}



	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}



	public Veiculo getVeiculo() {
		return veiculo;
	}



	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
	
	
	
}
