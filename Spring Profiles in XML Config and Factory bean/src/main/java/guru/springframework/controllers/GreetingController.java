package guru.springframework.controllers;

import guru.springframework.services.HelloWorldService;

/**
 * Created by jt on 10/26/15.
 */
public class GreetingController {

    private HelloWorldService helloWorldService;

    private HelloWorldService helloWorldServiceGerman;

    private HelloWorldService helloWorldServiceFrench;

    public void setHelloWorldService(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    public void setHelloWorldServiceGerman(HelloWorldService helloWorldServiceGerman) {
        this.helloWorldServiceGerman = helloWorldServiceGerman;
    }

    public void setHelloWorldServiceFrench(HelloWorldService helloWorldServiceFrench) {
        this.helloWorldServiceFrench = helloWorldServiceFrench;
    }

    public String sayHello(){

        String greeting = helloWorldService.getGreeting();

        System.out.println("Profile set: " + greeting);
        System.out.println("German: " + helloWorldServiceGerman.getGreeting());
        System.out.println("French: " +helloWorldServiceFrench.getGreeting());

        return greeting;
    }

}
