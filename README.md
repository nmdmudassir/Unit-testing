# 1. Testing
It is a process of ensuring that the functionality of an application  meets the requirements.

Different Types of testing are -:

1. Unit testing:

Unit testing is a process in which the smallest independent module is tested to check whether its working properly or not.
unit testing can be done manually but is often automated.

2. Integration tests

Integration tests verify that different modules or services used by your application work well together. For example, it can be testing the interaction with the
database or making sure that microservices work together as expected. These types of tests are more expensive to run as they require multiple parts of the 
application to be up and running.

3. Functional Test

Functional tests focus on the business requirements of an application. They only verify the output of an action and do not check the intermediate states of the 
system when performing that action.
There is sometimes a confusion between integration tests and functional tests as they both require multiple components to interact with each other. The difference is 
that an integration test may simply verify that you can query the database while a functional test would expect to get a specific value from the database as defined 
by the product requirements.

4. End to ends Tests

End-to-end testing replicates a user behavior with the software in a complete application environment. It verifies that various user flows work as expected and can be
as simple as loading a web page or logging in or much more complex scenarios verifying email notifications, online payments, etc...
End-to-end tests are very useful, but they're expensive to perform and can be hard to maintain when they're automated. It is recommended to have a few key end-to-end 
tests and rely more on lower level types of testing (unit and integration tests) to be able to quickly identify breaking changes.

5. Acceptance Testing

Acceptance tests are formal tests that verify if a system satisfies business requirements. They require the entire application to be running while testing and focus 
on replicating user behaviors. But they can also go further and measure the performance of the system and reject changes if certain goals are not met.

6. Performance Testing

Performance tests evaluate how a system performs under a particular workload. These tests help to measure the reliability, speed, scalability, and responsiveness of 
an application. For instance, a performance test can observe response times when executing a high number of requests, or determine how a system behaves with a 
significant amount of data. It can determine if an application meets performance requirements, locate bottlenecks, measure stability during peak traffic, and more. 

7. Smoke Testing

Smoke tests are basic tests that check the basic functionality of an application. They are meant to be quick to execute, and their goal is to give you the assurance 
that the major features of your system are working as expected.
Smoke tests can be useful right after a new build is made to decide whether or not you can run more expensive tests, or right after a deployment to make sure that 
they application is running properly in the newly deployed environment.


# 2.Unit-testing
Unit testing is a process in which the smallest independent module is tested to check whether its working properly or not.
unit testing can be done manually but is often automated.

![image unittestimage](/Image/unittestimage.png)

# 2.1 Difference Between Manual Testing and Automation Testing
Manual Testing                           |                       Automation Testing
                           
Executing a test cases manually.         |                       Taking tool support and executing the test 
cases.
Time consuming                           |                       Fast
Huge investment in human resources       |                       Less Investment of human resources.
Non programmable                         |                       programmable 

# 2.2 Unit Testing Tools:

There are several automated unit test software available to assist with unit testing. We will provide a few examples below:

Junit: Junit is a free to use testing tool used for Java programming language.  It provides assertions to identify test method. This tool test data first and then 
inserted in the piece of code.

NUnit:  NUnit is widely used unit-testing framework use for all .net languages.  It is an open source tool which allows writing scripts manually. It supports
 data-driven tests which can run in parallel.

JMockit:  JMockit is open source Unit testing tool.  It is a code coverage tool with line and path metrics. It allows mocking API with recording and verification
syntax. This tool offers Line coverage, Path Coverage, and Data Coverage.

EMMA:  EMMA is an open-source toolkit for analyzing and reporting code written in Java language. Emma support coverage types like method, line, basic block. 
It is Java-based so it is without external library dependencies and can access the source code.

PHPUnit: PHPUnit is a unit testing tool for PHP programmer. It takes small portions of code which is called units and test each of them separately.  
The tool also allows developers to use pre-define assertion methods to assert that a system behave in a certain manner. 

Notes: truth is Unit testing increase the speed of development.

# 2.3 Unit Testing advantage and Disadvantage
Unit Testing Advantage:

Developers looking to learn what functionality is provided by a unit and how to use it can look at the unit tests to gain a basic understanding of the unit API.

Unit testing allows the programmer to refactor code at a later date, and make sure the module still works correctly (i.e. Regression testing). The procedure is to 
write test cases for all functions and methods so that whenever a change causes a fault, it can be quickly identified and fixed.

Due to the modular nature of the unit testing, we can test parts of the project without waiting for others to be completed.

Unit Testing Disadvantages:

Unit testing can’t be expected to catch every error in a program. It is not possible to evaluate all execution paths even in the most trivial programs.

Unit testing by its very nature focuses on a unit of code. Hence it can’t catch integration errors or broad system level errors.

It’s recommended unit testing be used in conjunction with other testing activities.

# Junit and it's Feature

-Unit testing framework for java programming.
Follows the test a little, code a little approach.
Increase productivity of a programmer and stability of code.

 Features of Junit:


-an open source framework.

-Annotation to identify test methods.

-Assertions for testing expected results.

-allow you to write codes faster ,which increase quality.

-simple to use.

-Runs automatically.check their own results and prvide immediate feedback no need to manually comb through a report of test results.

-can be organised into test suites.

-progress bar facility.

# What is unit test case?

-part of code which ensures that another part of code is works as expected.

-characterizations of unit test cases are:

Known input

Expected result/output.

precondition

post condition

Notes:At least two test case for each requirement(positive and negative).


# Junit Annotation 

when ever we are writing the test cases we are writing plenty of methods and each of the method is having one annotations and based of that annotations they are executing the method at runtime successfully.

-@Test

This annotation is a replacement of org.junit.TestCase which indicates that public void method to which it is 
attached can be executed as a test Case.

-@Before

This annotation is used if you want to execute some statement such as preconditions before each test case.

-@BeforeClass

This annotation is used if you want to execute some statements before all the test cases for e.g. test
 connection must be executed before all the test cases.

-@After

This annotation can be used if you want to execute some statements after each Test Case for e.g resetting 
variables, deleting temporary files ,variables, etc.

-@AfterClass

This annotation can be used if you want to execute some statements after all test cases for e.g. Releasing 
resources after executing all test cases.

-@Ignores

This annotation can be used if you want to ignore some statements during test execution
for e.g. disabling some test cases during test execution.

-@Test(timeout=500)

This annotation can be used if you want to set some timeout during test execution for
e.g. if you are working under some SLA (Service level agreement), and tests need to
be completed within some specified time.

-@Test(expected=IllegalArgumentException.class)

This annotation can be used if you want to handle some exception during test execution. For, e.g., if you want to check whether a particular method is throwing specified exception or not.
 