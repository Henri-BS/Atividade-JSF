package br.com.cadUser;

import java.util.List;

import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
@RequestScoped
public class PessoasBean{

	@Inject
    private Repositorio repositorio;
	  
	private Pessoa pessoa = new Pessoa();
	
	public Pessoa getPessoa() {
		return pessoa;
	}

    public String cadastra(){
          System.out.println("Usuário " + pessoa.getNome() + " cadastrado!");
          repositorio.adicionar(pessoa);
          return "lista";
    }
    
    public List<Pessoa> lista() {
		return  repositorio.getLista();
    }
}

