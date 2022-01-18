package be.intec.les150.services;

import be.intec.les150.models.UserEntity;

public interface IUserService {

    Boolean login(String username, String password);

    UserEntity register( UserEntity user);

    Boolean logout(String username);

}