package be.intec.les151.repositories;


import be.intec.les151.models.UserEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepositorySoft implements IUserRepositorySoft {

	// VEREISTEN :
	// wachtwoord moet langer dan 8 chars bevatten.

	private static int userCounter = 0;
	private final List< UserEntity > database = new ArrayList<>();


	@Override
	public UserEntity save( UserEntity user ) {

		user.setId( userCounter++ );
		database.add( user );
		return user;
	}


	@Override
	public boolean updatePassword( Integer userId, String password ) {

		if(password.length() < 8){
			System.err.println("Password cannot have less than 8 chars");
		}

		for ( final UserEntity record : database ) {
			if ( record.getId().equals( userId ) ) {
				record.setPassword( password );
			}
		}

		return true;
	}


	@Override
	public boolean remove( UserEntity user ) {

		return database.remove( user );
	}


	@Override
	public List< UserEntity > findAll() {

		return database;
	}


	@Override
	public Optional< UserEntity > findByUsernameAndPassword( String username, String password ) {

		Optional< UserEntity > foundUser = Optional.empty();

		for ( final UserEntity record : database ) {
			if ( record.getUsername().equals( username ) && record.getPassword().equals( password ) ) {
				foundUser = Optional.ofNullable( record );
			}
		}

		return foundUser;
	}

}
