package com.bigxodus.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * @author: Lawrence
 * @since: 2016. 5. 7.
 * @note:
 */
@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class NotFoundException extends PurpleThunderException{
}
