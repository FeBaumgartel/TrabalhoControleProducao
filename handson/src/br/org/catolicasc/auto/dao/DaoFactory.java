package br.org.catolicasc.auto.dao;

import br.org.catolicasc.auto.bean.Ordens;
import br.org.catolicasc.auto.bean.PostoProducao;
import br.org.catolicasc.auto.bean.Produto;
import br.org.catolicasc.auto.bean.RegistroProducao;
import br.org.catolicasc.auto.bean.Status;

public class DaoFactory {
	
	public static IDao<Ordens> getOrdensDao() {
		return new OrdensDao();
	}
	
	public static IDao<PostoProducao> getPostoProducaoDao() {
		return new PostoProducaoDao();
	}
	
	public static IDao<Produto> getProdutoDao() {
		return new ProdutoDao();
	}
	
	public static IDao<RegistroProducao> getRegistroProducaoDao() {
		return new RegistroProducaoDao();
	}
	
	public static IDao<Status> getStatusDao() {
		return new StatusDao();
	}

}
