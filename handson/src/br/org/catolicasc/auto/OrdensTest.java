package br.org.catolicasc.auto;

import br.org.catolicasc.auto.bean.Ordens;
import br.org.catolicasc.auto.bean.PostoProducao;
import br.org.catolicasc.auto.bean.Produto;
import br.org.catolicasc.auto.bean.Status;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;
import br.org.catolicasc.auto.dao.JpaDaoFactory;
import br.org.catolicasc.auto.dao.OrdensDao;

public class OrdensTest {

	public Ordens getOrdensTest(Status status,Produto produto) {
		
		IDao<Ordens> ordensDao = DaoFactory.getOrdensDao();
		Ordens ordem = new Ordens();
		ordem.setProduto(produto);
		ordem.setStatus(status);
		ordem.setQuantidade(2);
		ordensDao.salva(ordem);
		
		return(ordem);
	}
}
