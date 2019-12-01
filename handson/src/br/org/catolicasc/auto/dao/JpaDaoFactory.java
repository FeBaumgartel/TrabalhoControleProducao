package br.org.catolicasc.auto.dao;

public class JpaDaoFactory {

	public static JpaDaoFactory instance = new JpaDaoFactory();
	
	private JpaDaoFactory() {}
		
	public static JpaDaoFactory getInstance(){
		return instance;
	}
	
	public OrdensDao getOrdensDao() {
		return new OrdensDao();
	}
	
	public PostoProducaoDao getPostoProducaoDao() {
		return new PostoProducaoDao();
	}
	
	public ProdutoDao getProdutoDao() {
		return new ProdutoDao();
	}
	
	public StatusDao getStatusDao() {
		return new StatusDao();
	}
	
	public RegistroProducaoDao getRegistroProducaoDao() {
		return new RegistroProducaoDao();
	}
}
