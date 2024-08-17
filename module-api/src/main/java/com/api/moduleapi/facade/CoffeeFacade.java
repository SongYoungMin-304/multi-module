package com.api.moduleapi.facade;

import com.core.modulecore.coffee.coffeeMaker;
import com.core.modulecore.coffee.customer;
import com.core.modulecore.coffee.employee;
import org.springframework.stereotype.Service;

@Service
public class CoffeeFacade {
    customer customer = new customer();
    coffeeMaker coffeeMaker = new coffeeMaker();
    employee employee = new employee();

    public void orderCoffee() {

        // 커피를 주문한다.
        customer.orderCoffee();

        // 커피를 포스기에 입력한다.
        employee.inputCoffee();

        // 커피를 만든다.
        coffeeMaker.makeCoffee();

    }

}
