package springdockercontainer.springdockercontainer.HelloWorld

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping
class HelloController {
    @GetMapping("/")
    fun helloController(): String{
        return "Hello World"
    }
}