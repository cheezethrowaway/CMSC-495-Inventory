/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umuc.cmsc495.trackit.controllers;

import edu.umuc.cmsc495.trackit.models.DatastoreSingleton;
import edu.umuc.cmsc495.trackit.models.Login;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Christian
 */
@Controller
@RequestMapping("/login/reset")
public class LoginResetController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String loginReset(ModelMap map) {
        // Must return name of file (minus .jsp) under /views
        return "login-reset";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String loginReset(@RequestParam("email") String email, ModelMap map) {
        
        // Getting all Logins
        boolean foundEmail = false;
        List<Login> allLogins = DatastoreSingleton.getAllLogins();
        for(Login login : allLogins) {
            if (login.getEmail().equals(email)) {
                foundEmail = true;
                break;
            }
        }
        
        // If found, we'll let them know
        if (foundEmail) {
            map.addAttribute("msgClass", "text-success");
            map.addAttribute("msg", "Found your email, your password has been reset, please check your email!");
        } else {
            map.addAttribute("msgClass", "text-danger");
            map.addAttribute("msg", "Your email address was NOT found, try again!");
        }
        
        // Must return name of file (minus .jsp) under /views
        return "login-reset";
    }
    
}
