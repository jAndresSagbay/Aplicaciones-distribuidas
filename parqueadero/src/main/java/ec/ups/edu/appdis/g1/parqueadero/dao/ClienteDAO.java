package ec.ups.edu.appdis.g1.parqueadero.dao;

import javax.ejb.Stateless;

import ec.ups.edu.appdis.g1.parqueadero.modelo.Cliente;

 @Stateless
public class ClienteDAO {
	
	public boolean insert(Cliente entity) {
		return true;		
	}
	
	public boolean update(Cliente entity) {
		return true;		
	}
	
	public Cliente read(int id) {
		return null;		
	}
	
	public boolean delete(int id) {
		return true;		
	}
}
