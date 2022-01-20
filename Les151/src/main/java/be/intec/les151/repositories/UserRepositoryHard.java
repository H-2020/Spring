package be.intec.les151.repositories;


import be.intec.les151.models.UserEntity;

import java.util.*;

public class UserRepositoryHard {

	private static int userCounter = 0;
	private final List<UserEntity> database = new ArrayList<>();

	public UserEntity save( UserEntity user ) {
		user.setId( userCounter++ );
		database.add( user );
		return user;
	}

	public boolean updatePassword(Integer userId, String password){

		for ( final UserEntity record : database ) {
			if( record.getId().equals( userId ) ){
				record.setPassword( password );
			}
		}

		return true;
	}

	public boolean remove( UserEntity user ) {
		return database.remove( user );
	}

	public List<UserEntity> findAll(){
		return database;
	}

	public Optional<UserEntity> findByUsernameAndPassword( String username, String password ) {
		Optional<UserEntity> foundUser = Optional.empty();

		for ( final UserEntity record : database ) {
			if( record.getUsername().equals( username ) && record.getPassword().equals( password ) ){
				foundUser = Optional.ofNullable( record );
			}
		}

		return foundUser;
	}

}
