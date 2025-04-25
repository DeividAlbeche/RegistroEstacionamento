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
	
	
	
}
