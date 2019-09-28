package com.ms.clientdata.apiworkshop;

import com.ms.clientdata.apiworkshop.controller.TodoController;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;

public abstract class ContractBase {

    TodoController todoController = new TodoController();

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(this.todoController);
    }
}
