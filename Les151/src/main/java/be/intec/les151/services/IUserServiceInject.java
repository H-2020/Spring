package be.intec.les151.services;


import be.intec.les151.models.UserEntity;

// SOFT DEPENDENCY

public interface IUserServiceInject {

	Boolean login( String username, String password );

	Boolean logout( String username );

	Boolean register( UserEntity user );

	Boolean changePassword( Integer userId, String password, String repeatedPassword );

}
