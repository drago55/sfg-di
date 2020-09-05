package com.horvat.sfgdi.controllers;

import com.horvat.sfgdi.services.ConstructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    @BeforeEach
    public void setUp(){
        propertyInjectedController = new PropertyInjectedController();
        propertyInjectedController.greetingService =new ConstructorGreetingService();

    }

    @Test
    public void testSayGreeting(){
        System.out.println(propertyInjectedController.getGreeting());
    }
}