package ec.ups.edu.examen.notificaciones.negocio;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.ups.edu.examen.notificaciones.dao.NotificacionDAO;
import ec.ups.edu.examen.notificaciones.modelo.Destinatario;
import ec.ups.edu.examen.notificaciones.modelo.Notificacion;

@Stateless
public class GestionNotificacionON implements GestionNotificacionONRemoto {

	@Inject
	private NotificacionDAO daoNotificacion;

	public boolean registrarEnvio(Notificacion notificacion) {

		try {
			daoNotificacion.insert(notificacion);
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return true;
	}

	public boolean registrarDestinatario(Destinatario destinatario) {

		try {
			daoNotificacion.insertDestinatario(destinatario);
		} catch (SQLException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		return true;
	}

	public List<Destinatario> getDestinatarios(){
		
		try {
		List<Destinatario> destinatarios = daoNotificacion.getList();
		System.out.println("Notificaciones"+destinatarios.size());
		return destinatarios;
	}catch(Exception e) {
		e.printStackTrace();
		return new ArrayList<Destinatario>();
	}
	}
}
