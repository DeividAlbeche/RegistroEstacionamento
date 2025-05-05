package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;

import entidades.Registro;

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
	
	public void inserirRegistro(Registro registro) {

		String consulta = "insert into pessoa " + "(hora_entrada, hora_saida, data_registro, valor_total, id_cliente, id_veiculo) values"
				+ " (?,?,?,?,?,?)";

		try {
			Connection conn = getConexao();
			PreparedStatement pst = conn.prepareStatement(consulta);
			
			pst.setTimestamp(1, registro.getHora_entrada());
			pst.setTimestamp(2, registro.getHora_saida());
			pst.setDate(3, registro.getData_registro());
			pst.setDouble(4, registro.getValor_total());
			pst.setString(5, registro.getCliente().getCpf());
			pst.setString(6, registro.getVeiculo().getPlaca());


			// Executando a consulta
			pst.executeUpdate();

			pst.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}


	}


	}
	
	
	
}
