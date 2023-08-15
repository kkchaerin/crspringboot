package cr.config;

import cr.config.autoconfig.DispatcherServletConfig;
import cr.config.autoconfig.TomcatWebServerConfig;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE) // class, interface, enum 에 적용할 수 있다.
@Configuration
@ComponentScan
@Import({DispatcherServletConfig.class, TomcatWebServerConfig.class})
public @interface MySpringBootApplication {
}
