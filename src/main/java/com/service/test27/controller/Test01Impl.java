package com.service.test27.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2017-11-27T02:17:23.363Z")

@RestSchema(schemaId = "test01")
@RequestMapping(path = "/test27", produces = MediaType.APPLICATION_JSON)
public class Test01Impl {

    @Autowired
    private Test01Delegate userTest01Delegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userTest01Delegate.helloworld(name);
    }

}
