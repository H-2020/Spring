package be.intec.les151.repositories;


import be.intec.les151.models.UserEntity;

import java.util.List;
import java.util.Optional;

// SOFT DEPENDENCY -> WE GEBRUIKEN INTERFACES OM KLAS-RELATIES TE BOUWEN

public interface IUserRepositorySoft {

	UserEntity save( UserEntity user );

	boolean updatePassword( Integer userId, String password );

	boolean remove( UserEntity user );

	List<UserEntity> findAll();

	Optional<UserEntity> findByUsernameAndPassword( String username, String password );

}
