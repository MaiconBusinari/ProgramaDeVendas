package DAO;

import java.util.List;

public interface InterfaceDAO<T> {

	T salvar(T entidade);
	T atualizar(T entidade);
	T buscarPorId(Integer id);
	List<T> listar();
	void apagar(Integer id);
	
}
