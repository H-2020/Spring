package be.intec.les151.services;


import be.intec.les151.models.UserEntity;

import java.util.Optional;

// SOFT DEPENDENCY

public interface IUserServiceSoft {

	Boolean login( String username, String password );

	Boolean logout( String username );

	Boolean register( UserEntity user );

	Boolean changePassword( Integer userId, String password, String repeatedPassword );

}
