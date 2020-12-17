package pe.edu.upeu.exa3backendsebastianllata.dao;
import java.util.Map;

import pe.edu.upeu.exa3backendsebastianllata.entity.Usuario;


public interface UsuarioDao {
	
	Usuario validarUsuario(String nomuser);
	Map<String, Object> datosUsuario(String username);
}
