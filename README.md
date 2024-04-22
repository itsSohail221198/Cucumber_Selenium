# Cucumber Selenium Project with Page Object Model (POM)

This project is a demonstration of how to use Cucumber with Selenium WebDriver in Java, following the Page Object Model design pattern.

## Prerequisites

- Java JDK (version 8 or above)
- Maven
- WebDriver (e.g., ChromeDriver for Chrome)
- IDE (e.g., IntelliJ IDEA, Eclipse)

## Getting Started

1. Clone the repository:

   ```bash
   git clone https://github.com/yourusername/your-repository.git

2. Import the project into your IDE.
 
3. Install dependencies using Maven:
   
      ```bash
   mvn clean install

## Project Structure

- src/test/java: Contains test runners, step definitions, and PageObjects.
- feature: Contains feature files.
- pom.xml: Contains project's properties, plugins dependencies.

## Running Tests

To run the tests, right-click on the TestRunner class and Run as Junit Test

## Reporting

- After running the tests, the Cucumber report will be generated in the target/cucumber-reports directory. 
- Open the index.html file in a browser to view the report.

## Runner Class

The `@CucumberOptions` annotation in Cucumber is used to configure various test execution options for your Cucumber tests. It allows you to specify features, glue code (step definitions), tags, and plugins.

 **Usage**

1. **Import Required Packages:**

   ```java
   import io.cucumber.junit.Cucumber;
   import io.cucumber.junit.CucumberOptions;
   import org.junit.runner.RunWith;

2. **Add @RunWith(Cucumber.class) and @CucumberOptions to Your Runner Class:**

   ```java
   @RunWith(Cucumber.class)
   @CucumberOptions(
      features = "src/test/resources/features",
      glue = "com.example.steps",
      tags = "@smoke",
      plugin = {"pretty", "html:target/cucumber-reports"}
    )
    public class TestRunner {
    // This class will not have any code, it's just a placeholder for Cucumber to execute the tests.
    }

- features: Specifies the directory where your feature files are located.
- glue: Specifies the package where your step definitions are located.
- tags: Specifies the tags that should be included or excluded from the test run.
- plugin: Specifies the plugins that should be used to generate reports. In this case, we are using the pretty plugin for console output and the html plugin for HTML report generation.
