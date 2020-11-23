package Objeto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Table(name = "Vendas")
@TableGenerator(
		name = "Id_Vendas",
		table = "sqlite_sequence",
		pkColumnName= "name",
		valueColumnName = "seq",
		pkColumnValue= "Vendas",
		initialValue = 1,
		allocationSize = 1
		
)

public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator="Id_Vendas")
	private int id;
	private String Cpf;
	private String Data;
	private double PrecoTotal;
	private int QtdePagas;
	private int Parcelamento;
	private String FormaPagamento;
	
	public Venda() {
		
	}
	
	
	
	public Venda(String cpf, String data, double precoTotal, int qtdePagas, int parcelamento, String formaPagamento) {
		super();
		Cpf = cpf;
		Data = data;
		PrecoTotal = precoTotal;
		QtdePagas = qtdePagas;
		Parcelamento = parcelamento;
		FormaPagamento = formaPagamento;
	}



	public Venda(int id, String cpf, String data, double precoTotal, int qtdePagas, int parcelamento,
			String formaPagamento) {
		super();
		this.id = id;
		Cpf = cpf;
		Data = data;
		PrecoTotal = precoTotal;
		QtdePagas = qtdePagas;
		Parcelamento = parcelamento;
		FormaPagamento = formaPagamento;
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
	public String getData() {
		return Data;
	}
	public void setData(String data) {
		Data = data;
	}
	public double getPrecoTotal() {
		return PrecoTotal;
	}
	public void setPrecoTotal(double precoTotal) {
		PrecoTotal = precoTotal;
	}
	public int getQtdePagas() {
		return QtdePagas;
	}
	public void setQtdePagas(int qtdePagas) {
		QtdePagas = qtdePagas;
	}
	public int getParcelamento() {
		return Parcelamento;
	}
	public void setParcelamento(int parcelamento) {
		Parcelamento = parcelamento;
	}
	public String getFormaPagamento() {
		return FormaPagamento;
	}
	public void setFormaPagamento(String formaPAgamento) {
		FormaPagamento = formaPAgamento;
	}
	
	
	
	
}
