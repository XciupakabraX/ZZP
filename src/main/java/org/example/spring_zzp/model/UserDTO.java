package org.example.spring_zzp.model;

import org.example.spring_zzp.validators.UsernameValidation;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {

    @UsernameValidation
    @Size(min = 5, max = 20)
    private String username;

    @Size(min = 5, max = 30)
    private String password;
}
