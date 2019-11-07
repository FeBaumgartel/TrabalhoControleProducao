package br.org.catolicasc.auto;

import java.sql.SQLException;
import java.util.Calendar;

import br.org.catolicasc.auto.bean.Contato;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;

public class Principal {

	public static void main(String[] args) throws SQLException {

		IDao<Contato> contatoDao = DaoFactory.getContatoDao();
		
		 Contato contato = new Contato(); 
		 contato.setNome("João");
		 contato.setEmail("joao@gmail.com"); 
		 contato.setEndereco("Rua do João 901");
		 contato.setDataNascimento(Calendar.getInstance());
		 contatoDao.salva(contato);
		 

		for (Contato c : contatoDao.listaTodos()) {
			System.out.println(contato.getNome() + "::"+c.getEmail());
		}
	}

}

