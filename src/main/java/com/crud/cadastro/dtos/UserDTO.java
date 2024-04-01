package com.crud.cadastro.dtos;

import jakarta.validation.constraints.NotBlank;

public record UserDTO(@NotBlank String name, @NotBlank String cpf,
                @NotBlank String email, @NotBlank String city, @NotBlank String phoneNumber) {

}
