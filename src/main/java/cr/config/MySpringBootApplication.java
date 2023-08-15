package cr.config;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // class, interface, enum 에 적용할 수 있다.
@EnableMyAutoConfiguration
public @interface MySpringBootApplication {
}
