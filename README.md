# JAVA CUCUMBER DEMO

## Java Versions

> See the branch selector to get more details

- Java 8
- Java 11
- Java 17
- Java 21

## Installation

###### Plugin

- Cucumber for Java (marketplace IntelliJ IDEA)

###### Dependency

<code>

        <!--Selenium-->
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-java</artifactId>
            <version>4.22.0</version>
            <scope>test</scope>
        </dependency>

        <!--Junit-Tests-->
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.13.2</version>
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

  Feature: User login test
    Perform user login on Practice Test Automation website

    @LoginTest
    Scenario: Success login
      Given user is on login page
      When user login with "student" and "Password123"
      Then login successfully
</pre>

###### Target tests - Website (Login)

https://practicetestautomation.com/practice-test-login/

###### Requirements

<pre>
sudo apt-get install chromium-chromedriver
whereis chromedriver
chromedriver: /usr/bin/chromedriver
</pre>