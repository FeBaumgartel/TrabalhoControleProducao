package br.org.catolicasc.auto;

import br.org.catolicasc.auto.bean.Produto;
import br.org.catolicasc.auto.bean.Status;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;

public class ProdutoTest {

	public Produto getProdutoTest(Status status) {
		IDao<Produto> produtoDao = DaoFactory.getProdutoDao();
		Produto produto = new Produto();
		produto.setNome("Pepsi Twist");
		produto.setStatus(status);
		produtoDao.salva(produto);
		
		return(produto);
		
	}
}
