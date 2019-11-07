package br.org.catolicasc.auto;

import java.sql.SQLException;
import java.util.Calendar;

import br.org.catolicasc.auto.bean.Automovel;
import br.org.catolicasc.auto.bean.Contato;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;

public class AutomovelTest {

	public static void main(String[] args) throws SQLException {

		IDao<Automovel> automovelDao = DaoFactory.getAutomovelDao();
		Automovel auto = new Automovel();
		auto.setDescricao("Monza");
		automovelDao.salva(auto);
		
		auto = automovelDao.buscaPorld(auto.getId());
		System.out.println(auto.getDataCadastro());
		
	}

}

