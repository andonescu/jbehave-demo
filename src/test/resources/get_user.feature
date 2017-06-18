Scenario: Github data of a user can be accessed.


Given the github users api
When accessing andonescu profile
Then the name of the user is `Ionut Andonescu`