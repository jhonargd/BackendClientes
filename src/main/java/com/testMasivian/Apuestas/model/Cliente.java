package com.testMasivian.Apuestas.model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

public class Cliente implements Serializable {
	
	private String serial;
	private int nmCliente; 
	private String nombre;
	  private String apellido;
	  private String direccion;
	  private String telefono;
	  private String telefonoAlterno;
	  private String celular;
	  private String email;
	  private String cargo;
	  private String ciudad;
	  private String fechaNacimiento;
	  private String genero;
	  private String comunidad;
	  private String empresaLabora;
	  private String division;
	  private String pais;
	  private String hobbie;
	  private String fechaBaja;
	  private String fechaRegistro;
	  
	  
	public Cliente(String serial, int nmCliente, String nombre, String apellido, String direccion, String telefono,
			String telefonoAlterno, String celular, String email, String cargo, String ciudad, String fechaNacimiento,
			String genero, String comunidad, String empresaLabora, String division, String pais, String hobbie,
			String fechaBaja, String fechaRegistro) {
		super();
		this.serial = serial;
		this.nmCliente = nmCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.telefono = telefono;
		this.telefonoAlterno = telefonoAlterno;
		this.celular = celular;
		this.email = email;
		this.cargo = cargo;
		this.ciudad = ciudad;
		this.fechaNacimiento = fechaNacimiento;
		this.genero = genero;
		this.comunidad = comunidad;
		this.empresaLabora = empresaLabora;
		this.division = division;
		this.pais = pais;
		this.hobbie = hobbie;
		this.fechaBaja = fechaBaja;
		this.fechaRegistro = fechaRegistro;
	}


	public String getSerial() {
		return serial;
	}


	public void setSerial(String serial) {
		this.serial = serial;
	}


	public int getNmCliente() {
		return nmCliente;
	}


	public void setNmCliente(int nmCliente) {
		this.nmCliente = nmCliente;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public String getTelefonoAlterno() {
		return telefonoAlterno;
	}


	public void setTelefonoAlterno(String telefonoAlterno) {
		this.telefonoAlterno = telefonoAlterno;
	}


	public String getCelular() {
		return celular;
	}


	public void setCelular(String celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getFechaNacimiento() {
		return fechaNacimiento;
	}


	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public String getComunidad() {
		return comunidad;
	}


	public void setComunidad(String comunidad) {
		this.comunidad = comunidad;
	}


	public String getEmpresaLabora() {
		return empresaLabora;
	}


	public void setEmpresaLabora(String empresaLabora) {
		this.empresaLabora = empresaLabora;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getHobbie() {
		return hobbie;
	}


	public void setHobbie(String hobbie) {
		this.hobbie = hobbie;
	}


	public String getFechaBaja() {
		return fechaBaja;
	}


	public void setFechaBaja(String fechaBaja) {
		this.fechaBaja = fechaBaja;
	}


	public String getFechaRegistro() {
		return fechaRegistro;
	}


	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	
	  
	  


	  /**
	   * Initialize a new object from the standard input
	   */
	  /*public Cliente(BufferedReader br) throws IOException {

	    System.out.print("Introduce the name: ");
	    name = br.readLine();

	    System.out.print("Introduce the surname: ");
	    surname = br.readLine();

	    System.out.print("Introduce the address: ");
	    address = br.readLine();

	    System.out.print("Introduce the phone: ");
	    phone = br.readLine();

	    System.out.print("Introduce the mobile phone: ");
	    mobile = br.readLine();

	    System.out.print("Introduce the email address: ");
	    email = br.readLine();

	  }*/

	  

}
