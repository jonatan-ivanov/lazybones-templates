# ${appName}
Small (one-file) nanoservice using spring-boot

# How to use
1. Install [spring-boot cli](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html#getting-started-installing-the-cli)
1. Run: `spring run *.groovy`
1. Build jar: `spring jar ${appName}.jar .`

# Docker
- Build: `spring jar ${appName}.jar . && docker-compose build`
- Build and run:`spring jar ${appName}.jar . && docker-compose up`

# Open in IntelliJ
1. Open
1. Open Module Settings
1. Project: setup the SDK
1. Modules: mark the root as `Sources` and the config as `Resources`
1. Facets: add Spring (don't forget to add the Application Context)
1. Global Libraries: add Groovy
1. `Alt+Enter` on `@Grab`: Grab the artifacts
