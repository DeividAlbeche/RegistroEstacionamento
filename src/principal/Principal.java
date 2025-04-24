package principal;

import java.sql.Timestamp;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Veiculo;

public class Principal {

	public static void main(String[] args) {
		
		List<Cliente> clientes = new ArrayList<Cliente>();
		Cliente cliente = new Cliente("Giovane", "88099767582", "48911112222");
		clientes.add(cliente);
		
		List<Veiculo> veiculos = new ArrayList<Veiculo>();
		Veiculo veiculo = new Veiculo("aaa7k55", "Toyota corrola", "cinza", cliente);
		veiculos.add(veiculo);
		
		System.out.println("cliente: " + cliente.getNome());
		System.out.println("Veiculo: " + veiculo.getModelo());
		System.out.println();
		
		cliente = new Cliente("Cleiton", "38519797584", "49911112222");
		clientes.add(cliente);
		
		veiculo = new Veiculo("bbb6e75", "Ford toro", "vermelha", cliente);
		veiculos.add(veiculo);
		
		System.out.println("cliente: " + cliente.getNome());
		System.out.println("Veiculo: " + veiculo.getModelo());
		System.out.println();
		
		cliente = new Cliente("Milena", "28077767512", "51911112222");
		clientes.add(cliente);
		
		veiculo = new Veiculo("ooo7l55", "gol", "branco", cliente);
		veiculos.add(veiculo);
		
		System.out.println("cliente: " + cliente.getNome());
		System.out.println("Veiculo: " + veiculo.getModelo());
		System.out.println();
		
		
		// registro
		
		 Scanner leia = new Scanner(System.in);
		
		double valor_hora = 0;
		
		System.out.println("tipo do veiculo: 1-Carro 2-Moto");
		int tipo_veiculo = leia.nextInt();
		
		if(tipo_veiculo == 1) {
			valor_hora = 5;
		}else if(tipo_veiculo == 2) {
			valor_hora = 3;
		}else {
			System.out.println("Não existe essa opção");
		}
		
		//registrando a entrada e a saida
		Timestamp entrada = Timestamp.valueOf("2025-02-10 08:30:00");
		Timestamp saida = Timestamp.valueOf("2025-02-10 10:31:00");
		
		//Convertendo para localDateTime
		LocalDateTime entradaLDT = entrada.toLocalDateTime();
		LocalDateTime saidaLDT = saida.toLocalDateTime();
		
		Duration duracao = Duration.between(entradaLDT, saidaLDT);

		long horas = duracao.toHours();
		long minutos = duracao.toMinutes() % 60;
		
		double valor_total = horas * valor_hora;
		
		System.out.print(valor_total);
	}

}
