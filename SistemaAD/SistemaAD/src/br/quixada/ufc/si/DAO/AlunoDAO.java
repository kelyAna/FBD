package br.quixada.ufc.si.DAO;

import br.quixada.ufc.si.fbd.model.Aluno;
import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class AlunoDAO {
       private Connection con;
      
        public  AlunoDAO (){
		this.con = Conexao.getConnection();
	}

    public void create(Aluno alu) {
  
        String sql = "insert into aluno values (?, ?, ?, ?, ?, ?, ?, ?,?)";
        
        try {
            
            PreparedStatement insert_alu = con.prepareStatement(sql);
            
            insert_alu.setString(1, alu.getNome());
            insert_alu.setInt(2, alu.getMatricula());
            insert_alu.setString(3, alu.getData_nasc());
            insert_alu.setString(4, alu.getEstado());
            insert_alu.setString(5, alu.getCidade());
            insert_alu.setString(6, alu.getBairro());
            insert_alu.setString(7, alu.getComplemento());
            insert_alu.setString(8, alu.getRua());
            insert_alu.setString(9, alu.getNumero()); 
            insert_alu.executeQuery();
            insert_alu.close();
            System.out.println("Aluno cadastrado");
        } catch (Exception e) {
            System.out.println("Erro ao incluir Aluno.Mensagem: " + e.getMessage());
        }
        
      
    }
    
    	public List<Aluno> getAlunoList() {
		String sql = "SELECT * FROM aluno;";
		
		try {
			List<Aluno> aluList = new ArrayList<Aluno>();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Aluno alu = new Aluno();
                                alu.setNome(rs.getString("Nome"));
                                alu.setMatricula(rs.getInt("Matricula"));
                                alu.setData_nasc(rs.getString("Date"));
                                alu.setEstado(rs.getString("Estado"));
                                alu.setCidade(rs.getString("Cidade"));
                                alu.setBairro(rs.getString("Bairro"));
                                alu.setComplemento(rs.getString("Complemento"));
                                alu.setRua(rs.getString("Rua"));
                                alu.setNumero(rs.getString("Número"));
				aluList.add(alu);
			}
			rs.close();
                        stmt.close();
                        return aluList;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} 
		}
		
	
        
        public boolean update(Aluno alu) {
		String sql = "update aluno set nome = ? where matricula = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			
	
			stmt.setString(1, alu.getNome());
                        stmt.setInt(2,alu.getMatricula());
			/*stmt.setString(3, alu.getData_nasc());
                        stmt.setString(4, alu.getEstado());
                        stmt.setString(5, alu.getCidade());
                        stmt.setString(6, alu.getBairro());
                        stmt.setString(7, alu.getComplemento());
                        stmt.setString(8, alu.getRua());
                        stmt.setString(9, alu.getNumero());
                                */
			int qtd = stmt.executeUpdate();
                                
			stmt.close();
                        
			if(qtd > 0){
                            return true;
                        
                        }
			return false;
		} catch (SQLException e) {
			System.out.println("Erro ao atualizar!");
		} finally {
			try {
				this.con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
        
        public boolean delete(int matricula) {
		String sql = "delete from aluno where matricula = ?";
		
		try {
			
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, matricula);
			
			int qtd = stmt.executeUpdate();
			stmt.close();
			if(qtd > 0) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			System.out.println("Erro ao tentar excluir");
		} finally {
			try {
				this.con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
          public List<Aluno> read(int matricula){
		String sql = "select * from aluno where matricula = ?";
		try {
                        List<Aluno> alu = new ArrayList<Aluno>();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, matricula);	
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Aluno aluno = new Aluno();
                                aluno.setNome(rs.getString("nome"));
                                aluno.setData_nasc(rs.getString("dt_nasc"));
                                aluno.setMatricula(rs.getInt("matricula"));
                                aluno.setEstado(rs.getString("estado"));
                                aluno.setCidade(rs.getString("cidade"));
                                aluno.setBairro(rs.getString("bairro"));
                                aluno.setComplemento(rs.getString("complemento"));
                                aluno.setRua(rs.getString("rua"));
                                aluno.setNumero(rs.getString("numero"));
                                alu.add(aluno);
			}
                        rs.close();
			stmt.close();
                        if(alu.isEmpty()){
                            System.out.println("vazio");
                        }else{
                            return alu;
                        }
                        
                        
		} catch (SQLException e) {
			System.out.println("");
		} finally {
			try {
				this.con.close();
			} catch(SQLException e) {
				e.printStackTrace();
			}
		}
            return null;
          }
       
}
