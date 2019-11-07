package br.org.catolicasc.auto;

import br.org.catolicasc.auto.bean.DetalheMarca;
import br.org.catolicasc.auto.bean.Marca;
import br.org.catolicasc.auto.bean.Modelo;
import br.org.catolicasc.auto.dao.DaoFactory;

public class ModeloTest {

	public static void main(String[] args) {
		Marca marca = new Marca();
		marca.setNome("VW");
		
		DetalheMarca detalheMarca = new DetalheMarca();
		detalheMarca.setAnoFundacao(1850L);
		detalheMarca.setFundador("Ferdinand Porshe");
		detalheMarca.setMarca(marca);
		marca.setDetalheMarca(detalheMarca);
		DaoFactory.getMarcaDao().salva(marca);
		
		
		Modelo modelo = new Modelo();
		modelo.setNome("Fusca");
		modelo.setMarca(marca);
		Modelo modelo2 = new Modelo();
		modelo2.setNome("Passat");
		modelo2.setMarca(marca);
		DaoFactory.getModeloDao().salva(modelo);
		DaoFactory.getModeloDao().salva(modelo2);
		marca.addModelo(modelo);
		marca.addModelo(modelo2);
		
		marca = DaoFactory.getMarcaDao().buscaPorld(marca.getId());
		for (Modelo mod : marca.getModelos()) {
			System.out.println(mod.getId());	
		}
		
	}
}
