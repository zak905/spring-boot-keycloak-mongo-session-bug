This repository is demonstrating the `too many redirects` error when using Keycloak Spring adapters with versions higher than `4.0.0.Final` along with `spring-session-data-mongodb`.

How to test: 

 - launch the stack (mongo db + auth server) using `docker-compose up`.
 - launch the spring boot app using `mvn spring-boot:run` or from any IDE.
 - go to `http://localhost:8280` and login using username `tester`, and password `tester`
 - you will notice that you will get a too many redirect error on the browser because of an infinite number of `302` returned 
 - shutdown the spring-boot app and change the `keycloak.version` property to `4.0.0.Final`
 - relaunch the app again and go to  `http://localhost:8280`, you will notice that issue is gone. 
 
 This issue has been introduced in https://github.com/keycloak/keycloak/pull/5688/files
 

