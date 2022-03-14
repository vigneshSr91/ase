# Cloud Development ASE Prerequisite Test for Java

_Disclaimer: We are [counting page hits](https://github.wdf.sap.corp/cloud-native-dev/usage-tracker) using a cookie to distinguish returning & new visitors._
<img src="https://cloud-native-dev-usage-tracker.cfapps.sap.hana.ondemand.com/pagehit/cc-agile-software-engineering/prerequisite-test-java/1x1.png" alt="" height="1" width="1">

## 🎯 Why?

**A**gile **S**oftware **E**ngineering (Java) is a training for Development roles which have good knowledge in Java and its ecosystem.
This little test, that should not take much time for a skilled programmer, gives you a first feedback if you have the required knowledge and skills to attend the training.

## 🤔 What if I don't know what to do or can't solve it?

If you don't have all the skills yet don't worry, you can learn them.

Have a look at the [basics](https://pages.github.tools.sap/cloud-curriculum/materials/stack-basics/java/).


## 🧰 Technical Prerequisites

You will need a few things in order to work with the exercises.

- IDE e.g. [Spring Tool Suite](https://spring.io/tools)/[IntelliJ](https://www.jetbrains.com/idea/download/)
- [Java JDK 1.8 or higher](https://sap.github.io/SapMachine/#download)
- [Maven](https://maven.apache.org/)
- [Git client](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)

Install them if you do not have them yet.

## 💻 Exercise

### What do I need to do here?

For this prerequisite test you have to implement a `Developer` class and a `Hackathon` class with some very basic methods.

To do so please follow the detailed steps below.

### 1. Clone Repository & Import

:exclamation:**Please do NOT FORK, and DO NOT OPEN PULL REQUESTS on this repo** :exclamation:

1. Clone this repository to your local machine

1. Import the repository into your IDE as a maven project (it will likely show up as `skillcheck-ase`)

:warning: **Do not rename, move or modify the existing files in this project** :warning:

### 2. Implement the Developer class

1. Create a class called `Developer` in the package `com.sap.cc`

1. The class should have two private fields called `name` and `language`, both of type `String`.

1. Create a constructor for the `Developer` class which accepts values for `name` and `language`, and assign them to the private fields.

1. Create getter and setter methods for both fields:

1. Make the Developer class a subclass of the `CodeCreator` class

1. Since `CodeCreator` is an abstract class we now need to implement the method named `code` that we inherit.

1. `code()` should return a String that depends on the value of the `name` and `language` properties of the `Developer` instance;
 See Examples below:

    - For `language` : `go`, `name`: `Greg` return the String

      >`fmt.Println("Hello, Greg!")`

    - For `language`: `nodejs`, `name`: `Nicole` return the String

      >`console.log("Hello, Nicole!")`

    - For `language`: `python`, `name`: `Pete` return the String

      > `print("Hello, Pete!")`

    - For any other `language`, e.g. `abap`, `swift`, `rust` etc., the method should throw a `UnsupportedDevelopmentLanguageException` with the `language` as the parameter of the Exception.

**HINT**: Quotation Marks (`"`) are special characters in Java. If you want to use them within Strings you will need to escape them with a backslash (`\`). [You can find an example here.](https://codegym.cc/groups/posts/escaping-characters-java)


### 3. Implement the Hackathon class

1. Create a class called `Hackathon` in the package `com.sap.cc` which implements the `DeveloperEvent` interface

1. Because of the interface, we must implement the method `codeTogether` that
 has the parameter `codeCreators`, which is a List of `CodeCreator`s (the parent class of `Developer`).

1. `codeTogether` should  call the `code()` method of each of the `codeCreators` in the List and concatenate their output into a string using a `new line` (`\n`) as the separator. This String should be returned by the method.
e.g.:
    >fmt.Println("Hello, Greg!") <br>
    console.log("Hello, Nicole!") <br>
    print("Hello, Pete!")

1. If any call to `code()` throws a `UnsupportedDevelopmentLanguageException` this must be caught and the Exceptions message must be appended:
e.g:
    >fmt.Println("Hello, Greg!") <br>
    console.log("Hello, Nicole!") <br>
    Unsupported language: abap <br>
    print("Hello, Pete!") <br>

**NOTE:** For simplicities sake, the separator (`\n`) should even be appended for lists containing only one item.

### 4. Commit and Push to Personal Branch

1. Run the tests 🧪 to verify your implementation: `mvn clean verify`

1. Go to <https://fun-onboarding.internal.cfapps.sap.hana.ondemand.com/> (SAP NETWORK ONLY).

    - Enter your `C/D/I-Number`, and select *Programming Language*: `Java`.

    - Then press `Register` to **gain write permissions on this repository**.

1. Commit your changes and push them to a **remote branch** on **this repository** that matches your `C/D/I-Number` (e.g. d055151 or i234212)

    (Note: The branch will be automatically *deleted* after *each* build, otherwise you could see each others solutions :trollface:)

### 5. Check Results

After pushing to this repository as per the previous step, a build will be triggered that takes ~2 minutes to finish.

In case of errors you will be. notified via email. Don't worry: You have as many attempts as you need!

<details>
<summary>What exactly does the build do?</summary>

The build will:

- Run your tests
- Add and run smoke tests that we provide, to make sure the implementation is correct :wink:
- Delete your remote branch (the branch you pushed to this repo) no matter if the solution is correct or not

</details>

1. Check the [outcome of the build here](https://github.tools.sap/cloud-curriculum/ase-prerequisite-test-java/actions). There should be a pipeline run with your UserId (since it is the branch name) and your commit message.
1. If the pipeline is successful :white_check_mark: you passed, if it fails :x: there are still some issues you need to fix - in this case check the pipeline logs for the reason.
(after fixing repeat [4. Commit and Push to Personal Branch](#4-commit-and-push-to-personal-branch) and check again)

## 📣 Questions/Feedback

We value your feedback and your questions, and please use [the slack channel #sap-cc-prerequisite-test-support](https://sap-cloud-enablement.slack.com/archives/C02KFC2UAFN) to let us know!

:octocat: **Happy Coding** :octocat:
