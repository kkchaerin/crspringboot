package cr.helloboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Objects;

@RequestMapping("/hello")
public class HelloController {
    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    @ResponseBody //@ResponseBody는 @RestController 로 지정하면 자동으로 지정된다. 그래서 기존 restController 에서는 이 어노테이션이 없어도 동작했던 것.
    public String hello(String name){
        return helloService.sayHello(Objects.requireNonNull(name));
    }
}
