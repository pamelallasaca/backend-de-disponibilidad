package com.empresa.repository;

import com.empresa.entity.Usuario;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository  extends JpaRepository<Usuario,Integer>{

	

}
