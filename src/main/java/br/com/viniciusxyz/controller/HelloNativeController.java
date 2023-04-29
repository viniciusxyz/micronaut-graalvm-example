package br.com.viniciusxyz.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloNativeController {

    @Get("/hello")
    public String helloNative(){
        return "Hello Native";
    }

}
