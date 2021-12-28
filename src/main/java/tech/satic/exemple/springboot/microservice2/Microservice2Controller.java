// Package
package tech.satic.exemple.springboot.microservice2;

// Librairie
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1")
public class Microservice2Controller {

    @Value("${tech.satic.demo.centralize.premiermicroservice.msg}")
    private String msg;

    @GetMapping(path = "/info")
    public String info() {
        return msg;
    }

}
