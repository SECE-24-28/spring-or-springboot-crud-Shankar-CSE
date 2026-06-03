package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.antlr.v4.runtime.misc.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @NotBlank(message = "Roll number filed is empty, kindly Enter")
    private int rno;
    @NotBlank(message = "Name filed is empty, kindly Enter")
    private String name;
    @NotBlank(message = "Gender filed is empty, kindly Enter")
    private String gender;
    @NotBlank(message = "Tech filed is empty, kindly Enter")
    private String tech;
    @NotBlank(message = "Email filed is empty, kindly Enter")
    private String email;
    @NotBlank(message = "Password filed is empty, kindly Enter")
    private String password;

}
