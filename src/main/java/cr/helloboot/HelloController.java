package cr.helloboot;

import java.util.Objects;

public class HelloController {
    public String hello(String name){
        SimpleHelloService helloService = new SimpleHelloService();

        return helloService.sayHello(Objects.requireNonNull(name)); // null 인 경우를 방지할 수 있다.
    }
}
