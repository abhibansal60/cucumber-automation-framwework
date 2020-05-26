#Slack API Automation

A BDD API Automation framework for slack.

#Tech Stack

1. JAVA
2. Cucumber BDD with Java 8 and Junit
3. Spring Dependency Injection
4. Gradle as build tool
5. Rest Assured
6. Cucumber Reporting


#Project Structure

**src/main**: can be used by to create API's

**src/test**: contains code to perform integration/regression tests

**src/test/resources:** contains everything which is not JAVA

**src/test/java:** contains everything which is JAVA

    TestRunner: Entry point for execution
    Channel: Stepdefinition for the Channel.feature file
    ServiceUtil: All the service call related functions resides here
    ServiceWorld: A World component used for sharing the objects eithin the scenarios/steps for an execution
    ServiceConfig: Spring Configuration class
    
#Execution Steps

1. Clone the repo
2. Set JAVA_HOME and GRADLE_HOME on your system(if not already done)
3. Go to src/test/resources/test.properties and update the value for the bearer.token [The one already there is disabled]
4. Open command prompt or terminal
5. Run the following command:
    `gradle test`
    
#CreateJira.feature Description
