/**
 * 
 */
package com.docker.example.login;

/**
 * @author rafael.e.vargas
 *
 */
public class Login {
	String usuario;
	String clave;
	String nick;
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getClave() {
		return clave;
	}
	public void setClave(String clave) {
		this.clave = clave;
	}
	public String getNick() {
		return nick;
	}
	public void setNick(String nick) {
		this.nick = nick;
	}
	public Login(String usuario, String clave) {
		super();
		this.usuario = usuario;
		this.clave = clave;
		this.nick = usuario + clave;
	}
}
