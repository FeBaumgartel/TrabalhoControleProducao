package br.org.catolicasc.auto.dao;

public class JpaDaoFactory {

	public static JpaDaoFactory instance = new JpaDaoFactory();
	
	private JpaDaoFactory() {}
		
	public static JpaDaoFactory getInstance(){
		return instance;
	}
	
	public ContatoDao getContatoDao() {
		return new ContatoDao();
	}
	
	public PessoaDao getPessoaDao() {
		return new PessoaDao();
	}
}
