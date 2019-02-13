# basegradle

- ./gradlew bootrun  -Dspring.profiles.active=smash  ==> you will get base

- ./gradlew build --scan

--
./gradlew clean build && java -jar build/libs/basegradle-1.0-SNAPSHOT.jar --spring.profiles.active=dev

-

-flyway
+./gradlew flywayMigrate -i
./gradlew flywayMigrate -i  flywayInfo
./gradlew flywayMigrate -i  flywayInfo -Dflyway.user=root -Dflyway.password='Cargill123!@#'
./gradlew flywayMigrate -i  flywayInfo -Dflyway.user=root -Dflyway.password='Cargill123!@#' -Dflyway.url='jdbc:mysql://127.0.0.1:3306'

./gradlew flywayMigrate -i  flywayInfo -Dflyway.user=root -Dflyway.password=MyNewPass -Dflyway.url='jdbc:mysql://127.0.0.1:3306'





https://www.baeldung.com/spring-boot-actuators#boot-2x-actuator
management.endpoints.web.exposure.include=*

-To explicitly enable a specific endpoint (for example /shutdown), we use:
management.endpoint.shutdown.enabled=true

-To expose all enabled endpoints except one (for example /loggers), we use:
management.endpoints.web.exposure.include=*
management.endpoints.web.exposure.exclude=loggers