package AM8EMDIANTE.AM8EMDIANTE;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import AM8EMDIANTE.AM8EMDIANTE.interceptor.LoginInterceptor;



@Configuration
public class AppConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**").excludePathPatterns("/login", "/", "/fazerLogin", "/bootstrap/**", "/webjars/**");
	}
}
