package com.empresa.service;

import java.util.List;
import com.empresa.entity.Ciclo;
import com.empresa.repository.CicloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CicloServiceImpl implements CicloService{

	 @Autowired
		private CicloRepository repository;

		@Override
		public List<Ciclo> listaCiclo(){
			return repository.findAll();
		}
}
