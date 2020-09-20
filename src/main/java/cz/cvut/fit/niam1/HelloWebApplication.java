package cz.cvut.fit.niam1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;


@RestController
@EnableAutoConfiguration
public class HelloWebApplication {

    @GetMapping("/hello/{name}")
    String helloName(@PathVariable String name) {
        return "Hello " + name;
    }

    @PostMapping(value = "/hello", consumes = "text/plain")
    String helloMessage(@RequestBody String message) {
        return message;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWebApplication.class, args);
    }

}