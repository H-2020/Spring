package be.intec.les151.services;


import be.intec.les151.models.UserEntity;
import be.intec.les151.repositories.IUserRepositorySoft;

import java.util.Optional;

public class UserServiceSoft implements IUserServiceSoft {

	private final IUserRepositorySoft repository;

	public UserServiceSoft( final IUserRepositorySoft repository ) {
		this.repository = repository;
	}


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
