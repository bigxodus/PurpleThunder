package com.bigxodus.controllers.account;

import com.bigxodus.domains.account.Login;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Lawrence
 * @since: 2016. 5. 7.
 * @note:
 */
@RestController
@RequestMapping(value="/auth")
public class LoginController {

    @RequestMapping(value="/login", method= RequestMethod.POST)
    public String login(@RequestBody Login login){
        return "";
    }

}
