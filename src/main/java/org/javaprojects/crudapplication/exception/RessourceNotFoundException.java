package org.javaprojects.crudapplication.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
@Getter
public class RessourceNotFoundException extends RuntimeException{


    final String resourcename;
    final String filedname;
    final Object filedvalue;

    public RessourceNotFoundException(String resourceName, String filedName, Object filedValue)
    {
        super(String.format("%s not found with %s : '%s'", resourceName, filedName, filedValue ));
        this.resourcename = resourceName;
        this.filedname = filedName;
        this.filedvalue = filedValue;
    }
}
