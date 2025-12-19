package dev.faccordoba.apiusers.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ApiVersionConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    /**
     * como segmentar /v1/users.
     * path segment "/v1/"  (segmento de ruta o path variable)
     * requests con header "API-Version: 1.0.0"
     * requests con parametro ?version=1.0.0
     * media type "application/vnd.apiusers.v1+json"
     *
     * @param configurer el configurador de versiones de la API
     */

    @Override
    public void configureApiVersioning(ApiVersionConfigurer configurer) {
        configurer
                .addSupportedVersions("1.0.0","1.1.0","2.0.0")
                .setDefaultVersion("1.0.0")
                // .useMediaType() //TODO: indicamos que vamos a usar media type para versionar
                // .useRequestParameter("version") //TODO: indicamos que vamos a usar el
               // .useRequestHeader("X-API-Version") //TODO: indicamos que vamos a usar el header API-Version
                .usePathSegment(1) //TODO: indicamos que la version va a estar en la posicion 1 del segmento de ruta o path
                .setVersionParser(new ApiVersionParser()); //TODO: usamos nuestro parser personalizado


        WebMvcConfigurer.super.configureApiVersioning(configurer);
    }
}
