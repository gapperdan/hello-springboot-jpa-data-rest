# hello-springboot-jpa-data-rest
Tutorial for using Spring Boot, JPA Data With Rest
https://spring.io/guides/gs/accessing-data-rest/

## To run application:
```
./gradlew clean build bootRun
```

## To load some data in the embedded H2 db:
```
cd scripts
./create-test-data.sh
```

## Endpoints:
http://localhost:8080/persons
