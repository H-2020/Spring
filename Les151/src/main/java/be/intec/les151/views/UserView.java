package be.intec.les151.views;


import be.intec.les151.repositories.IUserRepositorySoft;
import be.intec.les151.repositories.StudentRepositorySoft;
import be.intec.les151.repositories.UserRepositoryHard;
import be.intec.les151.repositories.UserRepositorySoft;
import be.intec.les151.services.*;

public class UserView {

	public static void main( String[] args ) {

		// HARD-DEPENDENCY TEST
		// TIP: In view package, moeten we services gebruiken. NIET repositories.
		UserServiceHard hardService = new UserServiceHard();
		boolean loggedInHard = hardService.login( "chef", "P@ssw0rd" );


		// SOFT-DEPENDENCY TEST
		// 2de VOORDEEL - TEAMWERK
		IUserRepositorySoft softUserRepo = new UserRepositorySoft();
		IUserRepositorySoft softStudentRepo = new StudentRepositorySoft();
		IUserServiceSoft softService = new UserServiceSoft( softStudentRepo );
		boolean loggedInSoft = softService.login( "chef", "P@ssw0rd" );


		// DEPENDENCY INJECTION && IOC
		// Schrijf minder code, meer boilerplate (auto-genereerde code)
		//IUserServiceInject injectRepo = new UserServiceInject(  );
		// constructor vereist configuratie.

		System.out.println(loggedInHard);
		System.out.println(loggedInSoft);



	}

}
