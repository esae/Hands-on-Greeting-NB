/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.fhnw.esae.greeting.controller;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

import ch.fhnw.esae.greeting.domain.User;

/**
 *
 * @author andreas.martin
 */
@Named(value = "greetingController")
@RequestScoped
public class GreetingController {

    private User user = new User();

    public String askNameAction() {
        //return "askName.xhtml";
        return "askNameAction_called";
    }

    public String greetAction() {
        //return "greet.xhtml";
        return "greetAction_called";
    }

    public String askNameAndGreetAJAXAction() {
        return "askNameAndGreet";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
