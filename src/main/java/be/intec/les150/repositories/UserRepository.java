package be.intec.les150.repositories;

import be.intec.les150.models.UserEntity;

import java.util.List;
import java.util.Optional;

public class UserRepository implements IUserRepository{
    @Override
    public Integer save(UserEntity user) {
        return null;
    }

    @Override
    public Integer update(Integer id, UserEntity user) {
        return null;
    }

    @Override
    public Integer delete(Integer id) {
        return null;
    }

    @Override
    public List<UserEntity> findAll() {
        return null;
    }

    @Override
    public Optional<UserEntity> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<UserEntity> findByUsernameAndPassword(String username, String password) {
        return Optional.empty();
    }
}
