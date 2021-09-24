package com.empresa.service;
import java.util.List;
import com.empresa.entity.Usuario;
import com.empresa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class UsuarioServiceImpl implements UsuarioService{

	 @Autowired
		private UsuarioRepository repository;

		@Override
		public List<Usuario> listaUsuario(){
			return repository.findAll();
		}
}
