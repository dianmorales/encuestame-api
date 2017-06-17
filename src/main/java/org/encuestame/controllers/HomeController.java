package org.encuestame.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dianmorales on 16.06.17.
 */
@RestController
public class HomeController {
    @RequestMapping("/")
    @ResponseBody String home() {
        return "Hello World Docker";
    }
}
