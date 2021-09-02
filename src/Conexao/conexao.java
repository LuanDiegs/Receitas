/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Aluno
 */
public class conexao {
    public static Statement statement = null;

    // String com o caminho onde está o banco de dados
    String URL = "jdbc:mysql://localhost:3306/bd_receitas";
    //Login
    String usuario = "root";
    //Senha
    String senha = "";
    // Variavel para o comando SQL
    public static Statement stm = null;
    // Variavel para a conexão
    public static Connection conexao = null;
 
    // Métodos Conectar e Desconectar Banco de Dados 
    // =============================================

    public void conectar() throws ClassNotFoundException, SQLException {
       
        // Carga do driver de conexão
        Class.forName("com.mysql.jdbc.Driver");
        // Fazendo a conexão
        conexao = DriverManager.getConnection(URL, usuario, senha);
        statement = (Statement) conexao.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    }

    public void desconectar() throws SQLException{
           
        // Fechando a conexão
        conexao.close();
    }
public static int runSQL(String sql) 
    {
        int qtdreg = 0;
     
    try{
      qtdreg = statement.executeUpdate(sql);
      //   JOptionPane.showMessageDialog(null, "Registro processado");
      }catch(SQLException sqlex){
           System.out.println("Erro acesso ao BD"+ sqlex);
      //   JOptionPane.showMessageDialog(null, "Erro");
      }
   return qtdreg;
    }
}
