package ec.ups.edu.examen.notificaciones.dao;

import java.sql.SQLException;
import java.util.List;

import javax.ejb.Stateless;
import javax.faces.flow.ReturnNode;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.ups.edu.examen.notificaciones.modelo.Destinatario;
import ec.ups.edu.examen.notificaciones.modelo.Notificacion;

@Stateless
public class NotificacionDAO {

	
	@PersistenceContext
	private EntityManager em;
	
	public NotificacionDAO() {
		// TODO Auto-generated constructor stub
	}
	public boolean insert(Notificacion notificacion)throws SQLException{
		em.persist(notificacion);
		return true;
	}
	
	public boolean insertDestinatario(Destinatario destinatario)throws SQLException{
		em.persist(destinatario);
		return true;
	}
	
	@SuppressWarnings("uncheacked")
	public List<Destinatario> getList(){
		String jpdl = "SELECT d FROM Destinatario d";
		Query q = em.createQuery(jpdl, Notificacion.class);
		return(List<Destinatario>)q.getResultList();
	}
	
}
