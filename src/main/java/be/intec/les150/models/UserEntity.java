package be.intec.les150.models;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class UserEntity {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    Integer id;

    @NotEmpty
    @NotNull
    String firstName;

    @NotEmpty
    @NotNull
    String lastName;

    @NotEmpty
    @NotNull
    String username;

    @Email
    @NotNull
    String email;

    @Min( 8 )
    @NotNull
    String password;

    Boolean authenticated;

    LocalDateTime registry;

}