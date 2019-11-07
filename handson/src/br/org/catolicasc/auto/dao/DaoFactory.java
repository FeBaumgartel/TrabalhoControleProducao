package br.org.catolicasc.auto.dao;

import br.org.catolicasc.auto.bean.Automovel;
import br.org.catolicasc.auto.bean.Contato;
import br.org.catolicasc.auto.bean.DetalheMarca;
import br.org.catolicasc.auto.bean.Marca;
import br.org.catolicasc.auto.bean.Modelo;

public class DaoFactory {
	
	public static IDao<Contato> getContatoDao() {
		return new ContatoDao();
	}
	
	public static IDao<Automovel> getAutomovelDao() {
		return new AutomovelDao();
	}
	
	public static IDao<Marca> getMarcaDao() {
		return new MarcaDao();
	}
	
	public static IDao<DetalheMarca> getDetalheMarcaDao() {
		return new DetalheMarcaDao();
	}
	
	public static IDao<Modelo> getModeloDao() {
		return new ModeloDao();
	}

}
