package br.org.catolicasc.auto;

import java.sql.SQLException;
import java.util.Calendar;

import br.org.catolicasc.auto.bean.Status;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;

public class StatusTest {

	public Status getStatusTest() {

		IDao<Status> statusDao = DaoFactory.getStatusDao();
		Status status = new Status();
		status.setNome("Ativo");
		statusDao.salva(status);
		
		return(status);
	}
}

