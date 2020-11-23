package Objeto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Clientes")
@TableGenerator(
		name = "Id_Cliente",
		table = "sqlite_sequence",
		pkColumnName= "name",
		valueColumnName = "seq",
		pkColumnValue= "Clientes",
		initialValue = 1,
		allocationSize = 1
		
)

public class Cliente {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="Id_Cliente")
	private int id;
	private String Cpf;
	private String Nome;
	private String Telefone;
	
	
	public Cliente() {
	}
	
	 public Cliente(String Cpf, String Nome,String Telefone) {
			super();
			this.Cpf = Cpf;
			this.Nome = Nome;
			this.Telefone = Telefone;
	}

	 public Cliente(int id, String Cpf, String Nome,String Telefone) {
			super();
			this.id = id;
			this.Cpf = Cpf;
			this.Nome = Nome;
			this.Telefone = Telefone;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	
	
	
}
