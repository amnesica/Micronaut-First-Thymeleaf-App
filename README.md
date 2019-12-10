# First Micronaut App 
### with Thymeleaf Template Engine and Maven

Hope this guide helps people to start building microservices with micronaut and template engines such as thymeleaf. 

#### How to create simple app with Micronaut CLI and Maven
1. Install Micronaut (see instructions on [Micronaut Website](https://micronaut.io/))
2. Create project with Micronaut CLI
(important: reload .bash_profile after install ``` $ source ~/.bash_profile ```)
3. Create Micronaut project with ``` $  mn create-app micronaut-first-thymeleaf-app --build maven``` (with Maven)
(then ```cd``` into project directory)
4. Create Micronaut Controller with ```$ mn create-controller ApplicationController```
5. Write Micronaut app
6. build and execute with ```$ ./mvnw compile exec:exec```
7. Open browser and go to http://localhost:8080/main/ or http://localhost:8080/main/simpleTest

#### How to set up Thymeleaf Template Engine
**Most important step**: Do not use ```micronaut-views``` in pom.xml as mentioned in guide for server side view rendering, 
use ```micronaut-views-thymeleaf``` instead. Otherwise build will fail.

pom.xml:
```xml
    <dependency>
      <groupId>io.micronaut</groupId>
      <artifactId>micronaut-views-thymeleaf</artifactId>
    </dependency>
```



Useful Links:
  * [Micronaut Website](https://micronaut.io/)
  * [How to create first app](https://guides.micronaut.io/creating-your-first-micronaut-app/guide/index.html)
  * [Guide for server side view rendering](https://micronaut-projects.github.io/micronaut-views/latest/guide/)
  * [Micronaut-Views on Github](https://github.com/micronaut-projects/micronaut-views)
