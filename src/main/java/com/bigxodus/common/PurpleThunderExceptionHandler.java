package com.bigxodus.common;

import com.bigxodus.Exception.BadRequestException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @author: Lawrence
 * @since: 2016. 5. 7.
 * @note:
 */
@ControllerAdvice
public class PurpleThunderExceptionHandler {

    @ExceptionHandler(BadRequestException.class)
    public void badRequestException(Exception e) {
        System.out.println("exception");
    }
}
