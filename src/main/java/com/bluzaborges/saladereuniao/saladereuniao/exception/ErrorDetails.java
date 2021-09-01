package com.bluzaborges.saladereuniao.saladereuniao.exception;

import lombok.Getter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import java.util.Date;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorDetails {

    private Date timestamp;

    private String message;

    private String details;
}
