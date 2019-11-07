package br.org.catolicasc.auto;

import br.org.catolicasc.auto.bean.Pessoa;
import br.org.catolicasc.auto.bean.PessoaFisica;
import br.org.catolicasc.auto.bean.PessoaJuridica;
import br.org.catolicasc.auto.dao.JpaDaoFactory;
import br.org.catolicasc.auto.dao.PessoaDao;

public class PessoaTest {

	public static void main(String[] args) {
		
		PessoaFisica p1 = new PessoaFisica();
		p1.setNome("João");
		p1.setCpf("0303204796088");
		
		PessoaJuridica p2 = new PessoaJuridica();
		p2.setNome("João");
		p2.setCnpj("0303204796088");
		
		PessoaDao dao = JpaDaoFactory.getInstance().getPessoaDao();
		dao.salva(p1);
		dao.salva(p2);
	}
}
