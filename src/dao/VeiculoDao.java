package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Veiculo;

public class VeiculoDao {
	
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
	
	public void inserirVeiculo(Veiculo veiculo) {

		String consulta = "insert into pessoa " + "(placa, modelo, cor, id_cliente, tipo_veiculo) values"
				+ " (?,?,?,?,?)";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(consulta);
			
			pst.setString(1, veiculo.getPlaca());
			pst.setString(2, veiculo.getModelo());
			pst.setString(3, veiculo.getCor());
			pst.setString(4, veiculo.getCliente().getCpf());
			pst.setString(5, veiculo.getTipo_veiculo());


			// Executando a consulta
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
