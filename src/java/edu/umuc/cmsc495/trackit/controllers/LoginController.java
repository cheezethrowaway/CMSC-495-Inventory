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
 * Represents the login view
 * @author Christian
 */
@Controller
@RequestMapping({"/", "/login"})
public class LoginController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String login(ModelMap map) {
        // Must return name of file (minus .jsp) under /views
        return "login";
    }
    
    @RequestMapping(method = RequestMethod.POST)
    public String login(@RequestParam("username") String username, 
            @RequestParam("password") String password, ModelMap map) {
        
        // Getting all Logins
        boolean authenticated = false;
        List<Login> allLogins = DatastoreSingleton.getAllLogins();
        for(Login login : allLogins) {
            if (login.getUsername().equals(username) && 
                login.getPassword().equals(password)) {
                authenticated = true;
                break;
            }
        }
        
        if (authenticated) {
            map.addAttribute("from", "login");
            map.addAttribute("msg", "Thanks for signing in!");
            return "redirect:home";
        } else {
            map.addAttribute("msg", "Incorrect username or password, please try again!");
            return "login";
        }
        
    }
    
}
