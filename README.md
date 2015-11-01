Spring Boot MVC Application

Lot of configurations are listed in  
src/main/resources/application.yml

e.g. port is 9000 (8080).  Looking for a Postgres url localhost:5432/rdas

For JPA magic, must have a @Configuration Class annotated with @EntityScan, @EnableJpaRepositories.
