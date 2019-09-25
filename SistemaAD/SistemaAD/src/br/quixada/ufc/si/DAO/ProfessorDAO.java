package br.quixada.ufc.si.DAO;

import br.quixada.ufc.si.fbd.model.Professor;
import connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    
        private Connection con;
        
        
        public  ProfessorDAO (){
		this.con = Conexao.getConnection();
	}

    public void create(Professor prof) {
  
        String sql = "insert into professor values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            
            PreparedStatement insert_prof = con.prepareStatement(sql);
            insert_prof.setString(1, prof.getCpf());
            insert_prof.setString(2, prof.getSenha());
            insert_prof.setString(3, prof.getNome());
            insert_prof.setString(4, prof.getData_nasc());
            insert_prof.setString(5, prof.getTipo());
            insert_prof.setString(6, prof.getEstado());
            insert_prof.setString(7, prof.getCidade());
            insert_prof.setString(8, prof.getBairro());
            insert_prof.setString(9, prof.getComplemento());
            insert_prof.setString(10, prof.getRua());
            insert_prof.setString(11, prof.getNumero()); 
            insert_prof.execute();
            insert_prof.close();
        } catch (Exception e) {
            System.out.println("Erro ao incluir professor.Mensagem: " + e.getMessage());
        }
        
    }
    
    	public List<Professor> getProfessorList() {
		String sql = "select * from professor;";
                
		try {
			List<Professor> profList = new ArrayList<Professor>();
			PreparedStatement stmt = con.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				Professor prof = new Professor();
				prof.setCpf(rs.getString("cpf"));
                                prof.setSenha(rs.getString("senha"));
                                prof.setNome(rs.getString("nome"));
                                prof.setData_nasc(rs.getString("dt_nasc"));
                                prof.setTipo(rs.getString("tipo"));
                                prof.setEstado(rs.getString("estado"));
                                prof.setCidade(rs.getString("cidade"));
                                prof.setBairro(rs.getString("bairro"));
                                prof.setComplemento(rs.getString("complemento"));
                                prof.setRua(rs.getString("rua"));
                                prof.setNumero(rs.getString("numero"));
				profList.add(prof);
			}
                        
			rs.close();
                        stmt.close();
                        return profList;                        
		} catch (SQLException e) {
			throw new RuntimeException(e);
                }
        }
        
        public boolean update(Professor prof) {
		String sql = "update professor set nome = ? where cpf = ?;";
		
		try {
			//this.con = connection_Postgres.getConnection();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, prof.getNome());
			stmt.setString(2, prof.getCpf());
                        int quan = stmt.executeUpdate();
			stmt.close();
                        if(quan >0){
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
        
        public boolean delete(String cpf) {
		String sql = "delete from professor where cpf = ?";
		
		try {
		
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);
			
			int qtdRowsAffected = stmt.executeUpdate();
			stmt.close();
			if(qtdRowsAffected > 0) {
                            return true;
			}else{
                            return false;
                        }
			
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
        public List<Professor> read(String cpf){
		String sql = "select * from professor where cpf = ?";
		try {
                        List<Professor> profPes = new ArrayList<Professor>();
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, cpf);	
			ResultSet rs = stmt.executeQuery();
			while(rs.next()) {
				Professor prof = new Professor();
				prof.setCpf(rs.getString("cpf"));
                                prof.setSenha(rs.getString("senha"));
                                prof.setNome(rs.getString("nome"));
                                prof.setData_nasc(rs.getString("dt_nasc"));
                                prof.setTipo(rs.getString("tipo"));
                                prof.setEstado(rs.getString("estado"));
                                prof.setCidade(rs.getString("cidade"));
                                prof.setBairro(rs.getString("bairro"));
                                prof.setComplemento(rs.getString("complemento"));
                                prof.setRua(rs.getString("rua"));
                                prof.setNumero(rs.getString("numero"));
                                profPes.add(prof);
			}
                        rs.close();
			stmt.close();
                        if(profPes.isEmpty()){
                            System.out.println("vazio");
                        }else{
                            return profPes;
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
