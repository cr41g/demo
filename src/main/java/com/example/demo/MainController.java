package com.example.demo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author craig.worsell
 */
@RestController
public class MainController {

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public DataObject doPost(@RequestBody DataObject data) {
        System.out.println(data);
        return data;
    }
}
