package pe.edu.upeu.exa3backendsebastianllata.dao;

import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;

import pe.edu.upeu.exa3backendsebastianllata.entity.Producto;


public interface ProductoDao {

	int create(Producto pr);
	int update(Producto pr);
	int update(int id);
	int delete(int id);
	List<Producto> readHola(int id);
	List<Map<String, Object>> read(int id);
	List<Map<String, Object>> readAll();
	List<GrantedAuthority> buscarProducto(int iduser);
	void convertitMap(Map<String, Object> map);
}
