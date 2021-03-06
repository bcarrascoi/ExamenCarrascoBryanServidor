package ec.ups.edu.examen.notificaciones.utils;

import java.sql.Connection;
import java.sql.SQLException;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class Resources {


	String dsName = "java:jboss/datasources/notificacionDS";

	@Produces
	private Connection createConnection() throws SQLException, NamingException {
		InitialContext ic = new InitialContext();
		DataSource ds = (DataSource) ic.lookup(dsName);
		return ds.getConnection();
	}

	private void closeConnection(@Disposes Connection conn) throws SQLException {
		conn.close();
	}
}
