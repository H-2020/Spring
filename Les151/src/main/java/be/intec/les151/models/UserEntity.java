package be.intec.les151.models;


import java.util.Objects;

public class UserEntity {

	private Integer id;
	private String username;
	private String password;
	private Boolean authenticated;


	public UserEntity( final String username, final String password ) {

		this.username = username;
		this.password = password;
	}


	public Integer getId() {

		return id;
	}


	public void setId( final Integer id ) {

		this.id = id;
	}


	public String getUsername() {

		return username;
	}


	public void setUsername( final String username ) {

		this.username = username;
	}


	public String getPassword() {

		return password;
	}


	public void setPassword( final String password ) {

		this.password = password;
	}


	public Boolean getAuthenticated() {

		return authenticated;
	}


	public void setAuthenticated( final Boolean authenticated ) {

		this.authenticated = authenticated;
	}


	@Override
	public boolean equals( final Object o ) {

		if ( this == o ) {
			return true;
		}
		if ( !( o instanceof UserEntity ) ) {
			return false;
		}
		final UserEntity that = ( UserEntity ) o;
		return getUsername().equals( that.getUsername() );
	}


	@Override
	public int hashCode() {

		return Objects.hash( getUsername() );
	}


	@Override
	public String toString() {

		return this.getUsername();
	}

}
