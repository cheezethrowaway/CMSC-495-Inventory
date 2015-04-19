/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.umuc.cmsc495.trackit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/**
 *
 * @author Matthew
 */
@Controller
@RequestMapping("/inventory/view")
public class ViewItemController {
    
    @RequestMapping(method = RequestMethod.GET)
    public String viewItem(ModelMap map) {
        // Must return name of file (minus .jsp) under /views
        return "view-item";
    }
    
}
