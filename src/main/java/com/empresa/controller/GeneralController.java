package com.empresa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.empresa.entity.Ciclo;
import com.empresa.entity.Disponibilidad;
import com.empresa.entity.Usuario;

import com.empresa.service.CicloService;
import com.empresa.service.DisponibilidadService;
import com.empresa.service.UsuarioService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/rest/list")
public class GeneralController {
	
	 @Autowired
	    private CicloService serviceCiclo; 
	    @Autowired
	    private UsuarioService serviceUsuario; 
	    
	    @GetMapping("/listCiclos")
	    @ResponseBody
	    public ResponseEntity<List<Ciclo>> listaCiclos(){
	        List<Ciclo> lista = serviceCiclo.listaCiclo();
	        return ResponseEntity.ok(lista);
	    }

	    @GetMapping("/listUsuario")
	    @ResponseBody
	    public ResponseEntity<List<Usuario>> listaUsuarios(){
	        List<Usuario> lista = serviceUsuario.listaUsuario();
	        return ResponseEntity.ok(lista);
	    }

}
