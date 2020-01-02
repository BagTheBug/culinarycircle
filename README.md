# culinarycircle
Begin with installing the dependencies below, and continue with the Getting Started procedure below.

### Dependencies
There are several prerequisite dependencies you should install on your machine prior to starting to work with Quantum:

* [Java 8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)

* An IDE to write your tests on - [Eclipse](http://www.eclipse.org/downloads/packages/eclipse-ide-java-developers/marsr) or [IntelliJ](https://www.jetbrains.com/idea/download/#)

* [Maven](https://maven.apache.org/)

Eclipse users should also install:

1. [Maven Plugin](http://marketplace.eclipse.org/content/m2e-connector-maven-dependency-plugin)

2. [TestNG Plugin](http://testng.org/doc/download.html)

3. [QAF Cucumber Plugin](https://marketplace.eclipse.org/content/qaf-bdd-editors). Or go to  install new software option in eclipse, and download from https://qmetry.github.io/qaf/editor/bdd/eclipse/

IntelliJ IDEA users should also install:

1. [Maven Plugin for IDEA](https://plugins.jetbrains.com/plugin/1166)

2. [Cucumber Plugin (Community version only)](https://plugins.jetbrains.com/plugin/7212)

TestNG Plugin is built-in in the IntelliJ IDEA, from version 7 onwards.
 
#### Optional Installations
* For source control management, you can install [git](https://git-scm.com/downloads).
* To be able to interact with a real device from Perfecto cloud directly from your IDE, and use Perfecto Reporting, install [Perfecto CQ Lab Plugin](https://www.perfectomobile.com/ni/resources/downloads/add-ins-plugins-and-extensions) for your IDE.

**********************
# Getting Started

<a target="_blank" href="https://youtu.be/FOHrWCuNPWI"><img src="https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/img/QuantumIntroThumbnail.png" alt="Quantum Framework Introduction and Getting Started"/></a>

This procedure leads you through the various Quantum framework's aspects:

* [Running one of the samples](README.md#running-sample-as-is) in the Quantum project as is.
* [Creating your first test](README.md#creating-your-first-test) using the Quantum-Starter-Kit
* [Parallel execution](README.md#parallel-execution) of all Quantum samples.
* [Diversifying test execution](README.md#diversifying-test-execution) by manipulating test suites.
* [Viewing test execution results](README.md#viewing-test-execution-results-in-perfecto-reporting)
* [Advanced Quantum features](README.md#advanced-quantum-features)

### Test writing guidelines

* Begin with @featuretagname, Feature: name of feature, @scenariotagname (can be the same as the feature's tag).
* Write your scenario using [Given/When/Then/And](https://github.com/cucumber/cucumber/wiki/Given-When-Then) BDD statements. Use the commands in the pull-down list for accurate steps syntax, and easy step insertion.
* Write your first scenario for the app's initial starting point, and later create scenarios for other cases; name them differently to enable easy identification in execution report, and name their tags differently if you want to run them separately.
* Name your app's objects as _functionality.purpose_, for example _button.route_, _edit.start_, etc.
* If you have a Perfecto plugin - use Perfecto's [Object Spy](https://community.perfectomobile.com/series/18628-object-spy) to obtain smart object locators for your app's objects; if you do not - use other tools, such as Firebug or Chrome's Developer Tools, for that purpose. Put each object locator at the end of the line using that object - it will be used later for creating the Object Repository.<br>When using Object Spy, remember to set your object type to _DOM_ or _Native_ depending on your app's type being Web or Native, respectively. 
* If you want to run your app's steps using the Object Spy, check the _Execute on Add_ checkbox.
* Add steps for taking screenshots to allow close examination of test results later on.
* Add steps for waiting a few seconds upon app's page loading.

### Object Repository creation guidelines
1. Copy-Paste your test to the _.loc_ file.
2. Remove lines unrelated to objects. 
3. From each object related line, create a line formatted as <br>`objectname = locatortype=objectlocator`<br>For example <br>`edit.start = xpath=//*[@label="Start location"]`

### Testng guidelines

1. Under the _config/_ folder, open the _testng_appium.xml_ or _testng_web.xml_ file, depending on your app type.
2. Copy the first test suite, and verify it's the only one with a **true** _enabled_ property, to prevent the other test suites from running in parallel.
3. Copy your feature/scenario tag to the _name_ property in the _include_ clause. Use a space-separated tags' list to include more scenarios and features.
4. Add a parameter specifying the type of device, or naming a specific one, to be used for your test execution, for example, <br>`<parameter name="driver.capabilities.model" value="iPhone.*"></parameter>`


## Parallel execution
To run all samples in parallel, configure the _TestNG.xml_ file, which is located under the _src/test/resources/config/_ folder.

1. For each of the test suites (enclosed within <test>...</test>), set the _enabled_ property value to **_true_**.
2. Run your test as before.

This results in running 2 additional samples, both searching terms in Perfecto Community; one uses hard coded search terms, and the other retrieves them from an external input file.

## Diversifying test execution
You can set each of the test suites to run on a different type of browser, and to include different scenarios.
Manipulate the contents of the various test suites in the _TestNG.xml_ file.

## Advanced Quantum features

Quantum has additional features to allow better customization to your specific application:
* Create your own [Object Repository](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/Object%20Repository) file to match your application objects. 
* Create a [[customized steps|Creating customized steps]] file to ease performing actions common in your application operation.
* Write tests using either [BDD](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/BDD-Implementation) or [Java](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/Java-Implementation).
* Configure the [TestNG.xml](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/Quantum%20TestNG%20File) to filter the tests to execute and the devices used in the test.

Configuration of the [application properties](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/The%20application.properties%20file) and the [TestNG.xml file](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/Quantum%20TestNG%20File), as well as creating object definitions in the [Object Repository](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/Object%20Repository) and [creating customized steps](https://github.com/Project-Quantum/Quantum-Starter-Kit/wiki/Creating%20customized%20steps), require knowledge of Java, TestNG, and XPath.

**********************
# Project Directory Structure
```
.
│   pom.xml                                                 # Maven pom file for build and dependencies  
│   README.md                                               # The current readme file  
│  
├───resources                                               # Default resources dir  
│       application.properties                              # Project properties  
│  
└───src												   		
    └───main  
        ├───java                                            # All code for project inside java directory  
        │   └───com  
        │       └───quantum                                 # com.quantum namespace  
        │           ├───java                                # Package namespace for pure java tests  
        │           │   └───pages                           # Package for Java test Page Object Models  
        │           │           homePage.java               # POM  
        |           |           contactUsPage.java          # POM
        │           │  
        │           └───steps                               # Steps 
        │           |       homePageStepsDefs.java          # Step definitions for HomePage feature file  
        │           |       contactUsStepDefs.java          # Step definitions for ContactUs feature file  
        |           |
        │           └───utils                               # Project Utilities 
        │           |       utils.java                      # Utils   
        |           |
        │           └───listener                            # Listeners
        │                   listeners.java                  # listeners  
        │  
        └───resources                                       # All project specific files here  
            │                
            |───scenarios                                   # Cucumber/Gherkin feature files directory  
            |        homePage.feature                       # Home Page feature file driven by testng.xml  
            |        contactUs.feature                      # ContactUs feature file driven by testng.xml file 
            │  
            ├───web                                         # Environement Variables  
            │       homePage.loc                            # Locators in Home Page
            │       contactUsPage.loc                       # Locators in Contact Us Page  
            │  
            │  
            ├───config                                      # TestNG xml test file directory  
            │       testng_web.xml                          # TestNG file that runs configured scenarios  
            │  
            ├───data                                        # Data used in data driven tests stored here  
                    testData.properties                     # test data file used   
             

