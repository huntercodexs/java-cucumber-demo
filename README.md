# JAVA CUCUMBER DEMO

## Installation

###### Plugin

- Cucumber for Java (marketplace IntelliJ IDEA)

###### Dependency

<code>

        <!--Junit-Tests-->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter</artifactId>
            <version>5.8.2</version>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-junit-jupiter</artifactId>
            <version>4.5.1</version>
            <scope>test</scope>
        </dependency>
        
        <!--Java-Cucumber-->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.18.1</version>
            <scope>test</scope>
        </dependency>
        
        <!--Cucumber-Junit-->
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.18.1</version>
            <scope>test</scope>
        </dependency>

</code>

###### Feature file

<pre>
# language: en

  Feature: Book search in the virtual library

    Scenario: Book Research by title
      Given My library is initialized
      When I make research the book name "Java Spring Boot"
      Then The book is found successfully
</pre>