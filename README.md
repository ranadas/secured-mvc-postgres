Spring Boot MVC Application

Lot of configurations are listed in  
src/main/resources/application.yml

e.g. port is 9000 (8080).  Looking for a Postgres url localhost:5432/rdas

For JPA magic, must have a @Configuration Class annotated with @EntityScan, @EnableJpaRepositories.

For Security, add spring-boot-starter-security and in application yaml security:
                                                                         basic:
                                                                           enabled: true

To override default spring security user ( user) and password ( the one randomly generated each time at startup)  
Add to application.yaml : security:
                            basic:
                              enabled: true
                            user:
                              name: secured
                              password: passp

for inMemory authentication: in WebSecurityConfigurerAdapter 
 @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("secureduser").password("passp").roles("USER").and()
                .withUser("securedadmin").password("passa").roles("USER", "ADMIN")
        ;
    }

                                                                               
    
http://stackoverflow.com/questions/27614301/spring-boot-multiple-datasource
http://xantorohara.blogspot.ie/2013/11/spring-boot-jdbc-with-multiple.html