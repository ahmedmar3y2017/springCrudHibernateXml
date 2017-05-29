package com.controller;

import Entities.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.userService;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * Created by ahmed on 5/29/2017.
 */

@Controller
public class controller {

    // --------------------- hibernate AutoWired --------------------------------
    @Autowired(required = true)
    @Qualifier("userService")
    userService userService;

    public service.userService getUserService() {
        return userService;
    }

    public void setUserService(service.userService userService) {
        this.userService = userService;
    }

    // -----------------------------------------------------------------------------------------
    // ----------------- message for all pages -----------------------------
    @ModelAttribute
    public void AllModel(Model model) {
        model.addAttribute("message", "First Spring Crud  Application  ..... : ");

    }

    // --------------------------------------------------- init binder -----------------
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder) {


        // ----------- date formate -------------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        webDataBinder.registerCustomEditor(java.util.Date.class, "birthdate", new CustomDateEditor(
                simpleDateFormat, false));

    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ModelAndView GetView() {

        ModelAndView modelAndView = new ModelAndView("hello");
        return modelAndView;


    }

    // -------------------------  link Mapping ------------------------------
    @RequestMapping(value = "/addEmployee", method = RequestMethod.GET)
    public ModelAndView AddEmployee() {
        ModelAndView modelAndView = new ModelAndView("addemployee");
        return modelAndView;

    }

    @RequestMapping(value = "/viewEmployees", method = RequestMethod.GET)
    public ModelAndView ViewEmployees() {

        List<user> list = userService.GetAllUser();

        ModelAndView modelAndView = new ModelAndView("viewemployees");
        modelAndView.addObject("users", list);
        return modelAndView;

    }

    //--------------------------------------------------------------------------------
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveUser(@Valid @ModelAttribute("user") user use, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            ModelAndView modelAndView = new ModelAndView("addemployee");
            return modelAndView;

        }

        userService.saveUser(use);


        ModelAndView modelAndView = new ModelAndView("redirect:/viewEmployees");
        return modelAndView;

    }

    @RequestMapping(value = "/updateUser/{id}", method = RequestMethod.GET)
    public ModelAndView UpdateUser(@PathVariable("id") int id) {

        user user = userService.getUserById(id);
//        System.out.println(id + "  Update  ***********************************");
        ModelAndView modelAndView = new ModelAndView("edituser");
        modelAndView.addObject("user", user);
        return modelAndView;


    }

    @RequestMapping(value = "/editUser", method = RequestMethod.POST)
    public ModelAndView EditUser(@Valid @ModelAttribute("user") user user, BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {

            ModelAndView modelAndView = new ModelAndView("edituser");
            return modelAndView;

        }
        System.out.println(user.getId()+" \t \t *****************************");
        userService.updateUser(user);

        ModelAndView modelAndView = new ModelAndView("redirect:/viewEmployees");
        return modelAndView;


    }

    @RequestMapping(value = "/deleteUser/{id}", method = RequestMethod.GET)
    public ModelAndView DeleteUser(@PathVariable("id") int id) {
        int iid = userService.deleteUser(id);
//        System.out.println(iid + "   /t ***************************************************");
        ModelAndView modelAndView = new ModelAndView("redirect:/viewEmployees");
        return modelAndView;


    }


}
