package principal;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Registro;
import entidades.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		List<Registro> registros = new ArrayList<Registro>();
		
		// Registro 1
		Cliente cliente = new Cliente("Giovane", "88099767582", "48911112222");
		clientes.add(cliente);
		
		Veiculo veiculo = new Veiculo("aaa7k55", "kawasaki ninja", "cinza", cliente, "moto");
		veiculos.add(veiculo);
		
		//registrando a entrada e a saida
		Timestamp entrada = Timestamp.valueOf("2025-02-10 08:30:00");
		Timestamp saida = Timestamp.valueOf("2025-02-10 10:31:00");
		
		Registro registro = registro(veiculo, cliente, entrada, saida);	 
		registros.add(registro);
		
		//Registro 2
		cliente = new Cliente("Cleiton", "38519797584", "49911112222");
		clientes.add(cliente);
		
		veiculo = new Veiculo("bbb6e75", "Ford toro", "vermelha", cliente, "carro");
		veiculos.add(veiculo);
		
		
		//registrando a entrada e a saida
		entrada = Timestamp.valueOf("2025-02-10 08:30:00");
		saida = Timestamp.valueOf("2025-02-10 9:30:00");
		
		registro = registro(veiculo, cliente, entrada, saida);
		registros.add(registro);
		
		
		//Resgistro 3
		cliente = new Cliente("Milena", "28077767512", "51911112222");
		clientes.add(cliente);
		
		veiculo = new Veiculo("ooo7l55", "gol", "branco", cliente, "carro");
		veiculos.add(veiculo);
		
		
		//registrando a entrada e a saida
		entrada = Timestamp.valueOf("2025-02-10 06:35:00");
		saida = Timestamp.valueOf("2025-02-10 12:36:00");
		
		registro = registro(veiculo, cliente, entrada, saida);	 
		registros.add(registro);
		
		for(Registro registro_estacionamento : registros) {
			System.out.println(registro_estacionamento);
		}
		
	}

	private static Registro registro(Veiculo veiculo, Cliente cliente, Timestamp entrada, Timestamp saida) {
		
		
		Scanner leia = new Scanner(System.in);
		
		double valor_hora = 0;
		
		if(veiculo.getTipo_veiculo().equals("carro")) {
			valor_hora = 5;
		}else if(veiculo.getTipo_veiculo().equals("moto")) {
			valor_hora = 3;
		}else {
			System.out.println("Não existe essa opção");
		}
		
		
		//Convertendo para localDateTime
		LocalDateTime entradaLDT = entrada.toLocalDateTime();
		LocalDateTime saidaLDT = saida.toLocalDateTime();
		
		LocalDate data = entradaLDT.toLocalDate();
		
		Duration duracao = Duration.between(entradaLDT, saidaLDT);

		long horas = duracao.toHours();
		long minutos = duracao.toMinutes() % 60;
		
		double valor_total = horas * valor_hora;
		
		Registro registro = new Registro(entrada, saida, data, valor_total, cliente, veiculo);
		
		return registro;
		
	}

}
