package entidades;

import java.sql.Date;

public class Registro {

	int id;
	Date hora_entrada;
	Date hora_saida;
	Date data_registro;
	double valor_total;
	Cliente cliente;
	Veiculo veiculo;
	
	public Registro(int id, Date hora_entrada, Date hora_saida, Date data_registro, double valor_total, Cliente cliente,
			Veiculo veiculo) {
		
		this.id = id;
		this.hora_entrada = hora_entrada;
		this.hora_saida = hora_saida;
		this.data_registro = data_registro;
		this.valor_total = valor_total;
		this.cliente = cliente;
		this.veiculo = veiculo;
	}

	public Registro() {
		
	}
	
	
	
}
