package com.ppfurtado.userapi.resources.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class StandardError {

    private LocalDateTime timesStamp;
    private String error;
    private Integer status;
    private String path;
}
