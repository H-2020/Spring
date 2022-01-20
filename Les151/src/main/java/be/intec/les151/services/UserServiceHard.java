package be.intec.les151.services;


import be.intec.les151.models.UserEntity;
import be.intec.les151.repositories.UserRepositoryHard;

import java.util.Optional;

public class UserServiceHard {

	// NADELEN
	// -- Niet flexiebel
	// -- Moelijk om code-te veranden in een team.
	// -- Moelijk om te testen.
	// -- Het is GEEN hergebruikbaar
    // -- Super moelijk om in een team te werken.


	// HARD DEPENDENCY -> Hard-coded dependency, ik heb mijn repository code zelf geschrijven.

	// ZONDER USER REPOSITORY GAAT ONZE NOOIT WERKEN,
	// WE KUNNEN GEEN DATABASE VERBINDINGEN AANMAKEN ZONDER REPOSITORY
	private final UserRepositoryHard userRepositoryHard =  new UserRepositoryHard();


	public Boolean login(String username, String password){
		Optional<UserEntity> foundUser =  userRepositoryHard.findByUsernameAndPassword( username, password );
		return foundUser.isPresent();
	}

	public Boolean logout(String username){
		return true;
	}

	public Boolean register( UserEntity user ){
		return true;

	}

	public Boolean changePassword(Integer userId, String password, String repeatedPassword){
		return true;

	}

}
