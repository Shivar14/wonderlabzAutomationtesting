# wonderlabzAutomationtesting

Project is a maven project. testing is donw with Java and selenium

Website used to test - (https://rahulshettyacademy.com/AutomationPractice/)
Steps to run code locally - 

Firstly, create new maven project in your chosen IDE. Select an archetype, chose the one with, Group ID = org.apache.maven.archetypes and Artifact ID = maven-archetype-quickstart. (Try to search 'archetype-quickstart' to be easier to fin the correct archetype)

Secondly - We need to add dependencies to the POM.xml file. We need to add three different dependcies. Selenium java, testng and webdriver manager. You can get these from maven repository (https://mvnrepository.com/). I will add the dependencies below, to add them, but it is good to know that they are avaible at maven repository. 

<!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependency>
    <groupId>org.seleniumhq.selenium</groupId>
    <artifactId>selenium-java</artifactId>
    <version>4.8.1</version>
</dependency>

<!-- https://mvnrepository.com/artifact/org.testng/testng -->
<dependency>
    <groupId>org.testng</groupId>
    <artifactId>testng</artifactId>
    <version>7.7.1</version>
    <scope>test</scope>
</dependency>

<!-- https://mvnrepository.com/artifact/io.github.bonigarcia/webdrivermanager -->
<dependency>
    <groupId>io.github.bonigarcia</groupId>
    <artifactId>webdrivermanager</artifactId>
    <version>5.3.2</version>
</dependency>

Once these are added, you can then clone the github repo, and proceed to running the tests. 
The repo to clone is - (gh repo clone Shivar14/wonderlabzAutomationtesting)
The http link is - (https://github.com/Shivar14/wonderlabzAutomationtesting.git)
