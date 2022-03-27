package io.github.xmchxup.backend.dto;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * @author huayang (sunhuayangak47@gmail.com)
 */
@Data
public class SignUpDTO {
    @NotBlank
    @Size(min = 4, max = 40)
    private String nickname;

    @NotBlank
    @Size(min = 3, max = 15)
    private String username;

    @NotBlank
    @Size(max = 40)
    @Email
    private String email;

    @NotBlank
    @Size(min = 6, max = 20)
    private String password;
}
