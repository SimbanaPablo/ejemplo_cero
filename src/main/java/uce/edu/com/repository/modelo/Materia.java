package uce.edu.com.repository.modelo;

import org.springframework.stereotype.Component;

@Component
public class Materia {
	private String  codigo;
	private String nombre;
	private String numero;
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	@Override
	public String toString() {
		return "Materia [codigo=" + codigo + ", nombre=" + nombre + ", numero=" + numero + "]";
	}
	

}
