package com.api.moduleapi.controller;

import com.api.moduleapi.facade.CoffeeFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CoffeeController {

    private final CoffeeFacade coffeeFacade;

    @GetMapping("/coffee")
    public String getCoffee() {
        return "Coffee";
    }

}
