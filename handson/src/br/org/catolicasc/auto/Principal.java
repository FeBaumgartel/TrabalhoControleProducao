package br.org.catolicasc.auto;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;

import br.org.catolicasc.auto.bean.Ordens;
import br.org.catolicasc.auto.bean.PostoProducao;
import br.org.catolicasc.auto.bean.Produto;
import br.org.catolicasc.auto.bean.RegistroProducao;
import br.org.catolicasc.auto.bean.Status;
import br.org.catolicasc.auto.dao.DaoFactory;
import br.org.catolicasc.auto.dao.IDao;
import br.org.catolicasc.auto.dao.JpaDaoFactory;
import br.org.catolicasc.auto.dao.RegistroProducaoDao;

public class Principal {

	public static void main(String[] args) throws SQLException {

		OrdensTest ot = new OrdensTest();
		PostoProducaoTest ppt = new PostoProducaoTest();
		ProdutoTest pt = new ProdutoTest();
		StatusTest st = new StatusTest();
		RegistroProducaoDao rpDao = JpaDaoFactory.getInstance().getRegistroProducaoDao();

		Status status = st.getStatusTest();
		Produto produto = pt.getProdutoTest(status);
		PostoProducao posto = ppt.getPostoProducaoTest(status);
		Ordens ordem = ot.getOrdensTest(status,produto);
		
		RegistroProducao registro = new RegistroProducao();
		registro.setPosto(posto);
		registro.setOrdem(ordem);
		registro.setStatus(status);
		registro.setProduto(produto);
		registro.setQuantidade(2.1);
		registro.setTimeStamp(new Date(System.currentTimeMillis()));
		rpDao.salva(registro);
	}

}

