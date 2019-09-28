package com.ms.clientdata.apiworkshop.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/todo")
@Api
public class TodoController {

    @GetMapping
    @ResponseBody
    public String getSimple() {
        return "Get TODO called ";
    }

    @PutMapping("/{ID}")
    @ResponseBody
    public String addByID(@PathVariable String ID) {
        return "Add TODO by ID: " + ID;
    }

    @GetMapping("/{ID}")
    @ResponseBody
    public String getByID(@PathVariable String ID) {
        return "Get TODO by ID: " + ID;
    }

    @DeleteMapping("/{ID}")
    @ResponseBody
    public String deleteByID(@PathVariable String ID) {
        return "Delete TODO by ID: " + ID;
    }

    @GetMapping("/list")
    @ResponseBody
    @ApiOperation("Operation supported is: GET")
    public String getList() {
        return "Get list from TODO.. ";
    }

    @PostMapping("/{ID}")
    @ResponseBody
    public String postByID(@PathVariable String ID) {
        return "Update TODO by ID: " + ID;
    }

}