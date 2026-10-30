package com.codewithnoelromero.springpactice.dtos;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.sql.CallableStatement;
import java.util.Date;

@AllArgsConstructor
@Getter
public class UserDTO {
    private Long id;
    private String name;
    private String email;



}
