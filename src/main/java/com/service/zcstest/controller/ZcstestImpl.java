package com.service.zcstest.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2018-01-09T09:07:40.409Z")

@RestSchema(schemaId = "zcstest")
@RequestMapping(path = "/zcstest", produces = MediaType.APPLICATION_JSON)
public class ZcstestImpl {

    @Autowired
    private ZcstestDelegate userZcstestDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userZcstestDelegate.helloworld(name);
    }

}
