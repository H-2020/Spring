package be.intec.les150.services;

import be.intec.les150.models.UserEntity;
import be.intec.les150.repositories.IUserRepository;
import be.intec.les150.repositories.UserRepository;

import java.util.Optional;

public class UserService implements IUserService{

private final IUserRepository newStylerepo;

    public UserService(final IUserRepository newStyleRepo) {
        this.newStylerepo=newStyleRepo;
    }

    @Override
    public Boolean login(String username, String password) {
       Optional<UserEntity> foundUser= newStylerepo.findByUsernameAndPassword(username, password);

       final Boolean loggedIn=foundUser.isPresent()&&foundUser.get().getAuthenticated();
        return null;
    }

    @Override
    public UserEntity register(UserEntity user) {
        return null;
    }

    @Override
    public Boolean logout(String username) {
        return null;
    }
}
