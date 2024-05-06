package org.guigui.githubactionscodelab;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/hello")
public class RESTController {

    private RESTService restService;

    public RESTController(RESTService restService) {
        this.restService = restService;
    }

    @GetMapping
    public String sayHello() {
        return restService.sayHello();
    }
}
