package br.edu.atitus.api_example.services;

import br.edu.atitus.api_example.entitiles.UserEntity;

public class UserService {
	
	public UserEntity save(UserEntity user) throws Exception {
		if (user == null)
			throw new Exception("Objeto nulo");
		if (user.getName() == null || user.getName().isEmpty())
			throw new Exception("nome invalido");
		user.setName(user.getName().trim());
		
		if (user.getEmail() == null || user.getEmail().isEmpty())
			throw new Exception("E-mail invalido");
		user.setEmail(user.getEmail().trim());

		
		if (user.getPassword() == null 
				|| user.getPassword().isEmpty()
				|| user.getPassword().length() < 8)
			throw new Exception("Password invalido");
			
		//TODO criar hash da senha
			
		//TODO validar permissao cadastro Admin
			
		//TODO enviar para a camada repository
		
		
	
	
		
		//TODO enviar para a camada repository
		return user;
	}

}
