package ec.ups.edu.examen.notificaciones.negocio;

import java.util.List;

import javax.ejb.Remote;

import ec.ups.edu.examen.notificaciones.modelo.Destinatario;
import ec.ups.edu.examen.notificaciones.modelo.Notificacion;

@Remote
public interface GestionNotificacionONRemoto {

	public boolean registrarEnvio(Notificacion notificacion) throws Exception;
	public boolean registrarDestinatario(Destinatario destinatario) throws Exception;
	public List<Destinatario> getDestinatarios() throws Exception;
}
