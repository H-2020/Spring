package be.intec.les151.services;


import be.intec.les151.models.UserEntity;
import be.intec.les151.repositories.IUserRepositoryInject;
import be.intec.les151.repositories.IUserRepositorySoft;
import be.intec.les151.utils.IPrinterUtil;

import java.util.Optional;

public class UserServiceInject implements IUserServiceInject {

	private IUserRepositoryInject repository;
	private IPrinterUtil printer;

	// CONSTRUCTOR INJECTION
	public UserServiceInject( final IUserRepositoryInject repository, final IPrinterUtil printer ) {
		this.repository = repository;
		this.printer = printer;
	}

	// METHOD INJECTION
	public void setRepository( final IUserRepositoryInject repository ) {

		this.repository = repository;
	}


	// METHOD INJECTION
	public void setPrinter( final IPrinterUtil printer ) {

		this.printer = printer;
	}

	// ANNOTATION-BASED INJECTION


	@Override
	public Boolean login( String username, String password){
		Optional<UserEntity> foundUser =  repository.findByUsernameAndPassword( username, password );
		return foundUser.isPresent();
	}

	@Override
	public Boolean logout(String username){
		return true;
	}

	@Override
	public Boolean register( UserEntity user ){
		return true;

	}

	@Override
	public Boolean changePassword(Integer userId, String password, String repeatedPassword){
		return true;

	}

}
