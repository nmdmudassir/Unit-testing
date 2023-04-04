#  Testing and it's Types
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


# Unit-testing
Unit testing is a process in which the smallest independent module is tested to check whether its working properly or not.
unit testing can be done manually but is often automated.

![image unittestimage](/Image/unittestimage.png)

## Difference Between Manual Testing and Automation Testing
|Manual Testing                           |  Automation Testing                          |
| :-----                                  |  :------
|Executing a test cases manually          |  Taking tool support and executing the test  |
|Time consuming                           |  Fast                                        |
|Huge investment in human resources       |  Less Investment of human resources.         |
|Non programmable                         |  programmable                                |

## Unit Testing Tools:

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

## Unit Testing advantage and Disadvantage
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

-Junit is a Unit testing framework for java programming.
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

## What is unit test case?

-part of code which ensures that another part of code is works as expected.

-characterizations of unit test cases are:

Known input

Expected result/output.

precondition

post condition

Notes:At least two test case for each requirement(positive and negative).


# Learn Junit 5

JUnit 5 is a opensource and next generation of JUnit for Java 8 and greater versions. In our JUnit 5 tutorials we have covered most of the examples for writing tests. JUnit 5 requires Java 8 or higher at runtime.

Unlike previous versions of JUnit, and JUnit 5 is composed of several different modules from three different sub-projects. In this Junit 5 tutorial we have focused on Junit Jupiter for writing tests and Junit platform for executing tests.

JUnit 5 = JUnit Platform + JUnit Jupiter + JUnit Vintage

Junit Platform : It is a Launcher for test frameworks on JVM, defines TestEngine API for discovering and executing tests, provides ConsoleLauncher for running Junit vintage and Junit Jupiter tests, and first class support for IDEs and build tools like Gradle, Maven etc.

Junit Jupiter : A new programming model for writing unit tests, an extension model for Junit 4 and provides standard assertions.

Junit Vintage : A TestEngine to run JUnit 3 & JUnit 4 tests and migration support to JUnit 5 (JUnit Jupiter).


## Difference Between Junit 4 and Junit 5

![image unittestimage](/Image/Junit4andjunit5.webp)

## Learn How to write unit test by using Junit 5

This tutorial explains unit testing with JUnit with the JUnit 5 framework (JUnit Jupiter). It explains the creation of JUnit 5 tests with the Maven and Gradle build system.
 It demonstrates the usage of the Eclipse IDE for developing software tests with JUnit 5 but this tutorial is also valid for tools like Visual Code or IntelliJ.

 ## Configuration for using Junit 5


To use JUnit 5 you have to make the libraries available for your test code. Jump to the section which is relevant to you, for example read the Maven part, if you are using Maven as build system.

Configure Maven to use JUnit 5 -:

== Configure Maven dependencies for JUnit 5

=== Steps required to configure Maven to use JUnit5

To use JUnit5 in an Maven project, you need to:

Configure to use Java 11 or higher, as this is required by JUnit5

Configure the maven-surefire-plugin and maven-failsafe-plugin to be at version 2.22.2 so that they can run JUnit5

Add dependencies to the JUnit5 API and engine for your test code

=== Configure Maven

Therefore you need to adjust your pom file, similar to the following:

![image unittestimage](/Image/junit-tutorial-maven-reload.png)

Once you have done this, you can start using JUnit5 in your Maven project for writing unit tests.

=== Update Maven settings (in case you are using the Eclipse IDE)

Right-click your pom file, select Maven  Update Project and select your project. This triggers an update of your project settings and dependencies.

## Where should the test be located?

Typical, unit tests are created in a separate source folder to keep the test code separate from the real code. The standard convention from the Maven and Gradle build tools is to use:

-> src/main/java - for Java classes

-> src/test/java - for test classes
## Executing a Test method code
create a new file in src/test/java then write the test cases of a method and excute it .
If test cases passed it will come in green progress bar and if it fails then it will come in  dark.
For Executing a test case-> right click on the method option will come "Junit test case"
click on these it will execute automated.

## The sequential workflow of the lifecycle annotations for JUnit 5 

![image unittestimage](/Image/lifecycleofannotation.png)

-> The method annotated with @BeforeAll is executed once at the start of the class.

-> The method annotated with @BeforeEach executes before Testcase 1 begins.

-> The method Testcase1 annotated with @Test is the testcase in the class.

-> The method annotated with @AfterEach runs after Testcase 1 completes execution.

-> The method annotated with @BeforeEach executes before Testcase 2 begins.

-> The method Testcase2 annotated with @Test is the testcase in the class.

-> The method annotated with @AfterEach runs after Testcase 2 completes execution.

-> The method annotated with @AfterAll is executed once at the end of the class after both testcase 1 and 2    are executed.

## Junit 5 Annotation with Example

@Test

This annotation denotes that a method is a test method. Note this annotation does not take any attributes.

```java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5Test {
        
    @Test
    void helloJUnit5() {
        assertEquals(10, 5+5);
    }
}
```

@Parameterized Test

Parameterized tests make it possible to run a test multiple times with different arguments. They are declared just like regular @Test methods but use the @ParameterizedTest annotation instead.

In addition, you must declare at least one source that will provide the arguments for each invocation and then consume the arguments in the test method.

For example, the following example demonstrates a parameterized test that uses the @ValueSource annotation to specify a String array as the source of arguments.

Example:

```java
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

class JUnit5Test {

    @ParameterizedTest
    @ValueSource(strings = { "cali", "bali", "dani" })
    void endsWithI(String str) {
        assertTrue(str.endsWith("i"));
    }
}
```

@Repeated Test

JUnit 5 has the ability to repeat a test a specified number of times simply by annotating a method with @RepeatedTest and specifying the total number of repetitions desired.

Each invocation of a repeated test behaves like the execution of a regular @Test method.

This is particularly useful in UI testing with Selenium.

Example

```java
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JUnit5Test {
    
    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("RepeatingTest")
    void customDisplayName(RepetitionInfo repInfo, TestInfo testInfo) {
        int i = 3;
        System.out.println(testInfo.getDisplayName() + 
            "-->" + repInfo.getCurrentRepetition()
        );
        
        assertEquals(repInfo.getCurrentRepetition(), i);
    }
}
```
@DisplayName

Test classes and test methods can declare custom display names that will be displayed by test runners and test reports.

Example:

```java

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

@DisplayName("DisplayName Demo")
class JUnit5Test {
    @Test
    @DisplayName("Custom test name")
    void testWithDisplayName() {
    }

    @Test
    @DisplayName("Print test name")
    void printDisplayName(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
    }
}
```
@BeforeEach

The @BeforeEach annotation denotes that the annotated method should be executed before each test method, analogous to JUnit 4’s @Before.

Example:

```java
import org.junit.jupiter.api.*;

class JUnit5Test {
    @BeforeEach
    void init(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println(callingTest);
    }

    @Test
    void firstTest() {
        System.out.println(1);
    }

    @Test
    void secondTest() {
        System.out.println(2);
    }
}


Output:

firstTest
1
secondTest
2
```

@AfterEach

This annotation denotes that the annotated method should be executed after each test method, analogous to JUnit 4’s @After. For example, if the tests need to reset a property after each test, we can annotate a method with @AfterEach for that task.

Example:

```java
import org.junit.jupiter.api.*;

class JUnit5Test {

    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }

    @AfterEach
    void after(TestInfo testInfo) {
        String callingTest = testInfo.getTestMethod().get().getName();
        System.out.println(callingTest);
    }
}

output:

1
firstTest
2
secondTest
```

@BeforeAll

This annotation executes a method before all tests. This is analogous to JUnit 4’s @BeforeClass. The @BeforeAll annotation is typically used to initialize various things for the tests.

Example:

```java
import org.junit.jupiter.api.*;

class JUnit5Test {

    @BeforeAll
    static void init() {
        System.out.println("Only run once before all tests");
    }

    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }
}

output:

Only run once before all tests
1
2
```

@AfterAll

The @AfterAll annotation is used to execute the annotated method, only after all tests have been executed. This is analogous to JUnit 4’s @AfterClass. We use this annotation to tear down or terminate all processes at the end of all tests.

Example:

```java
import org.junit.jupiter.api.*;

class JUnit5Test {

    @Test
    void firstTest() {
        System.out.println(1);
    }
    @Test
    void secondTest() {
        System.out.println(2);
    }

    @AfterAll
    static void after() {
        System.out.println("Only run once after all tests");
    }
}

output:

1
2
Only run once after all tests
```

@Tag

We can use this annotation to declare tags for filtering tests, either at the class or method level.

The @Tag annotation is useful when we want to create a test pack with selected tests.

Example:

```java
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("smoke")
class JUnit5Test {

    @Test
    @Tag("login")
    void validLoginTest() {
    }

    @Test
    @Tag("search")
    void searchTest() {
    }
}
```

@Disabled

The @Disabled annotation is used to disable or skip tests at class or method level. This is analogous to JUnit 4’s @Ignore.

When declared at class level, all @test methods are skipped. When we use @Disabled at the method level, only the annotated method is disabled.

Example:

```java
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class DisabledTestsDemo {

    @Disabled
    @Test
    void testWillBeSkipped() {
    }

    @Test
    void testWillBeExecuted() {
    }
}
```

# Junit 5-UsingAssertion

All the assertions are in the Assert class.

public class Assert extends java.lang.Object


JUnit 5 assertions make it easier to verify that the expected test results match the actual results. If any assertion of a test will fail, the test will fail. Similarly, if all assertions of a test pass, the test will pass.

The JUnit 5 assertions are static methods in the org.junit.jupiter.api.Assertions class. 

Some of the important methods of Assert class are as follows −:

1.  void assertEquals(boolean expected, boolean actual)

    Checks that two primitives/objects are equal.

2.  void assertTrue(boolean condition)

    Checks that a condition is true.

3.  void assertFalse(boolean condition)

    Checks that a condition is false.   

4.  void assertNotNull(Object object)

    Checks that an object isn't null.     

5.  void assertNull(Object object)

    Checks that an object is null.

6.  void assertSame(object1, object2)

    The assertSame() method tests if two object references point to the same object.  

7.  void assertNotSame(object1, object2)

    The assertNotSame() method tests if two object references do not point to the same object.  

8.  void assertArrayEquals(expectedArray, resultArray);

    The assertArrayEquals() method will test whether two arrays are equal to each other.


Example:

```java

import org.junit.Test;

import static org.junit.Assert.*;

public class TestAssertions {

 @Test

public void testAssertions() {

 //test data

String str1 = new String ("abc");

String str2 = new String ("abc");

String str3 = null;

String str4 = "abc";

String str5 = "abc"
		
int val1 = 5;

int val2 = 6;

String[] expectedArray = {"one", "two", "three"};

String[] resultArray =  {"one", "two", "three"};

 //Check that two objects are equal

 assertEquals(str1, str2);

//Check that a condition is true

 assertTrue (val1 < val2);

//Check that a condition is false

 assertFalse(val1 > val2);

 //Check that an object isn't null

 assertNotNull(str1);

//Check that an object is null

 assertNull(str3);

 //Check if two object references point to the same object

 assertSame(str4,str5);

//Check if two object references not point to the same object

assertNotSame(str1,str3);

 //Check whether two arrays are equal to each other.

 assertArrayEquals(expectedArray, resultArray);

 }

}

```
# Junit Tests For Spring Data JPA(Test CRUD Operations)

1. Required Dependencies

If you create a Spring Boot project using Spring Tool Suite IDE or directly from Spring Initializr, the dependency spring boot starter test is included by default. And we need to add dependencies for the in-memory database (H2) and real database (MySQL).
So make sure to declare the following dependencies in the Maven’s project file:

```markdown

<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-test</artifactId>
    <scope>test</scope>
    <exclusions>
        <exclusion>
            <groupId>org.junit.vintage</groupId>
            <artifactId>junit-vintage-engine</artifactId>
        </exclusion>
    </exclusions>
</dependency>
 
<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
 
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
</dependency>

```
Note that we exclude JUnit Vintage which supports running JUnit 4’s tests. Since we will write tests using JUnit 5, JUnit Vintage is no needed.

2. Code Entity Class

Create an entity class named Product with the following code:

```java
package net.codejava;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "products")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(length = 64)
    private String name;
	private float price;
	public Product(String name, float price) {
		this.name = name;
		this.price = price;
	}
	public Product() {
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
```

As you can see, this is a simple entity class with only 3 fields: id, name and price. The getters and setters are not shown for brevity. We will use Hibernate forward engineering to create the corresponding table in the database when running tests.

3. Code Repository Interface

Because we use Spring Data JPA with Hibernate, so code the ProductRepository interface as follows:

```java
package net.codejava;
 
import org.springframework.data.repository.CrudRepository;
 
public interface ProductRepository extends CrudRepository<Product, Integer> {
     
    public Product findByName(String name);
}

```

Besides the default CRUD methods extended from CrudRepository, we declare a custom method findByName() – and by convention, this method will return a Product object by its name.

4. Configure database connection properties

Next, open the Spring Boot configuration file (application.properties) and specify the properties for database connection as follows:

```markdown
spring.jpa.hibernate.ddl-auto=create
spring.datasource.url=jdbc:mysql://localhost:3306/test
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format-sql=true
```

Make sure that you created the database schema named test in MySQL server. Note that we specify create value for the spring.jpa.hibernate.ddl-auto property, so Hibernate will create the database table upon startup. And it will drop the table if exists.

5. Code Tests for CRUD operations

Create the ProductRepositoryTests class under src/test/java directory with initial code as follows:

```java

package net.codejava;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
public class ProductTest {

	@Autowired
	private ProductRepository repo;

	@Test
	@Rollback(false)
	public void testCreateProduct() {
		Product product = new Product("iPhone 10", 789);
		Product savedProduct = repo.save(product);
		assertNotNull(savedProduct);
	}

	
	
	@Test
	public void findProductByNameExist() {
		String name = "iPhone 10";
		Product product = repo.findProductByName(name);
		assertThat(product.getName()).isEqualTo(name);
	}

	@Test
	public void findProductByNameNotExist() {
		String name = "iPhone 11";
		Product product = repo.findProductByName(name);
		assertNull(product);
	}

	@Test
	@Rollback(false)
//	@DisplayName("Name is present or not")
    public void testUpdateProduct() {
		Product product = repo.findProductByName("iPhone 10");
		product.setPrice(1000);

		repo.save(product);

		Product updatedProduct = repo.findProductByName("iPhone 10");

		assertThat(updatedProduct.getPrice()).isEqualTo(1000);
	}

	@Test
	@Rollback(false)
	public void testDeleteProduct() {
	    Product product = repo.findProductByName("iPhone 10");
	     
	    repo.deleteById(product.getId());
	     
	    Product deletedProduct = repo.findProductByName("iPhone 10");
	     
	    assertThat(deletedProduct).isNull();       
	     
	}
}
```

Notes:

I use @Rollback(false) to disable roll back to the data will be committed to the database and available for the next test methods which will run separately. And I use assertThat() method from AssertJ library for more readability than using JUnit’s assertion methods. So you need to add the following imports:

```java

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;
```
@DataJpaTest -:

This annotation will disable full auto-configuration and instead apply only configuration relevant to JPA tests. By default, it will use an embedded, in-memory H2 database instead of the one declared in the configuration file, for faster test running time as compared to disk file database.


