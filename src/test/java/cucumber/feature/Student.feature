# language: en

  Feature: Student Status

    Scenario Outline: CheckStudentStatus
      Given student class instanced
      When the average <average>
      And the frequency <frequency>
      Then the student status should be <status>

      Examples:
      | average | frequency   | status   |
      |       5 |        "70" | Reproved |
      |       6 |        "75" | Approved |
