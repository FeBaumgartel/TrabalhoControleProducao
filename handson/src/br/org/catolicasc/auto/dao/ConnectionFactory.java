package br.org.catolicasc.auto.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ConnectionFactory {
	
	private static EntityManagerFactory emf;

	public Connection getConnection() {
		try {
			return DriverManager.getConnection("jdbc:mysql://localhost:3307/catolica", "root", "");
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}

	}
	
	public static EntityManager getEntityManager() {
		if(emf == null) {
			emf = Persistence.createEntityManagerFactory("default");
		}
		return emf.createEntityManager();
		
	}

}
