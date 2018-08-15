package com.harry.tests;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/harry")
public class FirstRest {

    @RequestMapping(value="/test1",method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public String testApi(@RequestParam(value="name", defaultValue="World") String name) {
        return "Test1 "+name;
    }
    
    @RequestMapping(value="/test2",method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE)
    public String testApi2(@RequestParam(value="name", defaultValue="World") String name) {
        return "Test2 "+name;
    }
    
}
