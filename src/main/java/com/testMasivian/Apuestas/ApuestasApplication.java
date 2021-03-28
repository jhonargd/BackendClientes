package com.testMasivian.Apuestas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testMasivian.Apuestas.model.Cliente;

import tree.BSTree;
@SpringBootApplication
public class ApuestasApplication {
	public static void main(String[] args) {
		SpringApplication.run(ApuestasApplication.class, args);
		
		ApuestasApplication dir = new ApuestasApplication();
		
	}
	
	private BSTree directory;

	  public ApuestasApplication() {
	    directory = new BSTree();
	  }

	  /**
	   * Introduce the data passed as a parameter
	   * 
	   * @param data
	   *          of the new entry
	   */
	  public void insert(Cliente data) {

	    // Search key
	    String key = data.getSerial();
	    System.out.println("** Inserting: " + key);
	    directory.insert(key, data);

	  }


	  /**
	   * Gets the data of a certain entry given a full name (surname and name) *
	   * 
	   * @param fullName
	   *          (Surname, Name)
	   * @return searched entry
	   */
	  public Cliente search(String serial) {
	    return (Cliente) directory.search(serial);
	  }

	  /**
	   * Prints the agenda content in alphabetic order to the standard output
	   */
	  public void printInOrder() {
	    directory.printInOrder();
	  }
	
}
