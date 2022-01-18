package be.intec.les150.views;

import be.intec.les150.services.IUserService;

public class LoginView {

    private final IUserService service;

            public LoginView(final IUserService service){
                this.service=service;
            }
}
