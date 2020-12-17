package pe.edu.upeu.exa3backendsebastianllata.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.exa3backendsebastianllata.dao.ProductoDao;
import pe.edu.upeu.exa3backendsebastianllata.service.ProductoService;

@Service
public class ProductoServiceImpl implements ProductoService {
	@Autowired
	private ProductoDao pr;
	
	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return pr.readAll();
	}

}
