# language: en

  Feature: Book search in the virtual library

    Scenario: Book Research by title
      Given My library is initialized
      When Making a research the book name "Java Spring Boot"
      Then The book is found successfully
      But Making a research the book name "Java 21"
      Then The book is not found
