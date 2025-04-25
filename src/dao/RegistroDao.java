package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import entidades.Registro;
import entidades.Veiculo;
import entidades.Cliente;

public class RegistroDao {

	
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
	
	public void inserirRegistro(Registro novaRegistro) {

		String consulta = "insert into pessoa " + "(hora_entrada, hora_saida, data_registro, valor_total, id_cliente, id_veiculo) values"
				+ " (?,?,?,?,?,?)";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(consulta);
			// RETURN_GENERATED_KEYS: Retornando o id criado pelo DB
			pst.setTimestamp(1, hora_entrada.getHora_entrada());
			pst.setTimestamp(1, hora_saida.getHora_entrada());
			pst.setLocaldate(3, novaPessoa.getIdade());
			pst.setString(4, novaPessoa.getEmail());

			// Executando a consulta
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {

		}


	}
	
	
	
}
