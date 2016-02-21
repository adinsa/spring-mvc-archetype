# spring-mvc-archetype
Maven archetype for Spring 4 MVC project

## Installation
```
git clone https://github.com/adinsa/spring-mvc-archetype.git
cd spring-mvc-archetype/
mvn install archetype:update-local-catalog
```

## Usage
```
mvn archetype:generate \
    -DarchetypeGroupId=com.github.adinsa \
    -DarchetypeArtifactId=spring-mvc-archetype \
    -DarchetypeVersion=0.0.1-SNAPSHOT \
    -DgroupId=org.github.adinsa \
    -DartifactId=spring-mvc \
    -Dversion=0.0.1-SNAPSHOT
cd spring-mvc/
mvn tomcat7:run
```
<http://localhost:8080/spring-mvc/hello>
