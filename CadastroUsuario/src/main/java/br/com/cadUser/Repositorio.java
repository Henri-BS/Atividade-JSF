package br.com.cadUser;

import java.io.Serializable;
import java.util.ArrayList;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class Repositorio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private ArrayList<Pessoa> lista = new ArrayList<Pessoa>();
	
	public void adicionar(Pessoa pessoa) {
		lista.add(pessoa);
	}

	public ArrayList<Pessoa> getLista() {
		return lista;
	}
}
