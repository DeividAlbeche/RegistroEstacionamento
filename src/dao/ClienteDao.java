package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Cliente;

public class ClienteDao {

	public Connection getConexao() {

		// Driver
		String driver = "com.mysql.cj.jdbc.Driver";
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// URL do banco de dados
		String url = "jdbc:mysql://localhost:3306/registroEstacionamento";

		// login
		String login = "root";

		// Senha
		String senha = "root";

		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url, login, senha);
			System.out.println("Conectado ao banco de dados");

		} catch (SQLException e) {
			System.err.println("Credenciais inválidas. Erro ao conectar");
		}

		return conn;
	}
	
	public void inserirCliente(Cliente cliente) {

		String consulta = "insert into pessoa " + "(nome, cpf, telefone) values"
				+ " (?,?,?)";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(consulta);
			
			pst.setString(1, cliente.getNome());
			pst.setString(2, cliente.getCpf());
			pst.setString(3, cliente.getTelefone());

			// Executando a consulta
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}
	
}
