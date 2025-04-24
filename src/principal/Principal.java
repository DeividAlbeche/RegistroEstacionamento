package principal;

import java.util.ArrayList;
import java.util.List;

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
		
		
	}

}
