package ec.ups.edu.appdis.g1.parqueadero.negocio;

import java.sql.SQLException;

import javax.ejb.Remote;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Ticket;
import ec.ups.edu.appdis.g1.parqueadero.modelo.Vehiculo;
@Remote
public interface GestionTicketOnRemoto {
	public boolean registrarTicket(Ticket ticket) ;
	
	public Ticket salidaVehiculo(int idTicket);
	
	public double calcularTiempo(int idTicket) ;
	public Vehiculo buscarVehiculo(String placa);

	public Ticket buscarTicket(int idTicket) ;
	
	public boolean registrarCliente(Cliente cliente) throws Exception ;

}
