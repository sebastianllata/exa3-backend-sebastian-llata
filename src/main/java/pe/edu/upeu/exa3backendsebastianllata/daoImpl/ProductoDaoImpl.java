package pe.edu.upeu.exa3backendsebastianllata.daoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

import pe.edu.upeu.exa3backendsebastianllata.dao.ProductoDao;
import pe.edu.upeu.exa3backendsebastianllata.entity.Producto;



@Component
public class ProductoDaoImpl implements ProductoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	Gson gson =new Gson();

	@Override
	public int create(Producto pr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Producto pr) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Producto> readHola(int id) {
		// TODO Auto-generated method stub
		return null;
		
		
	}

	@Override
	public List<Map<String, Object>> read(int id) {
		// TODO Auto-generated method stub
		return null;
		
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		String SQL ="select * from producto";
		return jdbcTemplate.queryForList(SQL);
	}

	@Override
	public List<GrantedAuthority> buscarProducto(int iduser) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void convertitMap(Map<String, Object> map) {
		// TODO Auto-generated method stub
		
	}

	

}
