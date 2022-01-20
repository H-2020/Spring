package be.intec.les151.services;


import be.intec.les151.models.UserEntity;
import be.intec.les151.repositories.IUserRepositoryInject;
import be.intec.les151.utils.IPrinterUtil;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

import java.util.Optional;

// ANNOTATION-BASED INJECTION

@RequiredArgsConstructor
//@ToString
//@EqualsAndHashCode
public class UserServiceInjectWithLombok implements IUserServiceInject {


    //cdi-context dependency injection

    //CONTEXT IS EEN VERZAMELING VAN DE REGELS
    //RequiredArgsConstructor vereist om fields final of @NonNull te merken
    private final IUserRepositoryInject repository;
    private final IPrinterUtil printer;


    @Override
    public Boolean login(String username, String password) {
        Optional<UserEntity> foundUser = repository.findByUsernameAndPassword(username, password);
        return foundUser.isPresent();
    }

    @Override
    public Boolean logout(String username) {
        return true;
    }

    @Override
    public Boolean register(UserEntity user) {
        return true;

    }

    @Override
    public Boolean changePassword(Integer userId, String password, String repeatedPassword) {
        return true;

    }

}
