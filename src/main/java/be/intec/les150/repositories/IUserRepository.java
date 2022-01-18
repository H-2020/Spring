package be.intec.les150.repositories;

import be.intec.les150.models.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserRepository {

    Integer save( UserEntity user );

    Integer update(Integer id, UserEntity user);

    Integer delete(Integer id);

    List<UserEntity> findAll();

    Optional<UserEntity> findById( Integer id);

    Optional<UserEntity> findByUsernameAndPassword(String username, String password);

}

