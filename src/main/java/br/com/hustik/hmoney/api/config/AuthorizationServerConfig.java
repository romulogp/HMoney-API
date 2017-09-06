package br.com.hustik.hmoney.api.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
@EnableAuthorizationServer
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        clients.inMemory() // é possível configurar para buscar info no banco de dados
                .withClient("angular")
                .secret("@ngul@r0")
                .scopes("read", "write")
        /*
         * É possível definir scopes diferentes para clientes diferentes
         * Portanto, para utilizar os Scopes definidos aqui, é necessário realizar o devivo tratamento para que tenham efeito e façam sentido
         */
                .authorizedGrantTypes("password")
                .accessTokenValiditySeconds(1800); // 30 minutos
    }

    @Override
    public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
        endpoints
                .tokenStore(tokenStore()) // É necessário armazenar o token em alguma lugar
                .authenticationManager(authenticationManager);
        // o angular buscará o token aqui e depois retornará esse string para que seja possível acessar a API
    }

    @Bean
    public TokenStore tokenStore() {
        return new InMemoryTokenStore();
    }

}
