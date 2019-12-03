package br.org.catolicasc.auto;

import br.org.catolicasc.auto.bean.PostoProducao;
import br.org.catolicasc.auto.bean.Status;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;

public class PostoProducaoTest {

	public PostoProducao getPostoProducaoTest(Status status) {

		IDao<PostoProducao> postoProducaoDao = DaoFactory.getPostoProducaoDao();
		PostoProducao postoProducao = new PostoProducao();
		postoProducao.setNome("Maq1");
		postoProducao.setStatus(status);
		postoProducaoDao.salva(postoProducao);
		
		return(postoProducao);
	}
}
