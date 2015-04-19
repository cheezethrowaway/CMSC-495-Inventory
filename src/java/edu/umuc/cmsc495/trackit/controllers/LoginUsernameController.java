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
@RequestMapping("/login/username")
public class LoginUsernameController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String loginUsername(ModelMap map) {
        // Must return name of file (minus .jsp) under /views
        return "login-username";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String loginUsername(@RequestParam("email") String email, ModelMap map) {
        
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
            map.addAttribute("msg", "Found your email, your username has been sent to your email!");
        } else {
            map.addAttribute("msgClass", "text-danger");
            map.addAttribute("msg", "Your email address was NOT found, try again!");
        }
        
        // Must return name of file (minus .jsp) under /views
        return "login-username";
    }
    
}
