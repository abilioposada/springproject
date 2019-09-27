package sv.com.empresa.springproject.configuracion;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@ComponentScan("sv.com.empresa.springproject")
public class ConfiguradorMVC implements WebMvcConfigurer { }