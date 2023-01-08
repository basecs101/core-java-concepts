# Core-Java-Concepts-And-Programs
## Exploring almost everything in core java
1. [Java Introduction](https://en.wikipedia.org/wiki/Java_(software_platform))
    - what, why and how @ Java Programming
2. Java Architecture
   - Java development Kit `JDK`
   - Java Runtime Environment `JRE`
   - Java Virtual Machine `JVM`
   - What is Java Source code(.java file) and ByteCode(.class file)
   - ClassLoader, Linker and JIT compiler
3. [What is classpath and how to set it.](https://medium.com/@basecs101/do-you-know-classpath-in-java-latest-2800574878c)
4. [Number System](https://www.baeldung.com/java-binary-numbers)
   - Binary, Decimal, Octal and Hexadecimal
   - Conversion from binary to decimal and vice-versa
5. Memory Types
   - Primary memory/Main Memory/ Random Access Memory
   - Secondary memory/Disk/ Read Only Memory
   - Cache and cache layering
   - Stack, Heaps and Method Areas
6. [Installation of JDK and Running HelloWorld.java program, and IntelliJ Idea Basics.](https://docs.oracle.com/en/java/javase/11/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA)
7. [DataTypes](https://medium.com/@basecs101/primitive-data-types-and-what-default-values-are-assigned-to-them-in-java-e6ee8ee16459)
   - Primitive(8 primitive types and their wrapper classes) 
   - and Non-Primitive(classes and arrays)
8. [Conditional Statement](https://www.w3schools.com/java/java_conditions.asp) - 
   - if , if-else and multiple if and if-else
   - nested if and if-else
9. [Control Statement - Switch case and its examples](https://www.w3schools.com/java/java_conditions_shorthand.asp)
   - Loops
     - [for](https://www.w3schools.com/java/java_for_loop.asp) and [for-each](https://www.w3schools.com/java/java_foreach_loop.asp)
     - [while](https://www.w3schools.com/java/java_while_loop.asp) 
     - and do-while
10. Java Comments and Java Documentations
    - Single line comment
    >          // hello single line comment
    - Multiline comment
    >         /*
    >         Hello from
    >         multi line comment
    >         */
    - Java Doc
    >        /**
    >         * This class {@code Shape} is an abstract class to demonstrate partial abstraction
    >         * and features of abstract class.
    >         *
    >         * @author Vikram Gupta
    >         */
11. [Classes and Objects](https://medium.com/@basecs101/know-the-difference-between-reference-object-instance-and-class-b5eaa51eb22b)
12. [Static and Instance methods](https://medium.com/@basecs101/know-the-differences-between-static-and-instance-methods-in-java-988be358c46a)
13. Java Packages
14. Access Modifiers/ Access Level/ Access Specifier
    1. Private
    2. Default
    3. Protected
    4. Public
15. [Primitive Data and their Type Casting](https://medium.com/@basecs101/primitive-data-types-and-what-default-values-are-assigned-to-them-in-java-e6ee8ee16459) 
    > int to float and int to byte and other primitives
16. [Everything about Constructor](https://medium.com/@basecs101/constructors-constructor-overloading-and-constructor-chaining-in-java-complete-guide-latest-c10cb8a244bd)
    1. Rules
    2. Types
    3. Overloading
    4. Chaining
17. [`this` and `super` keywords and their usages And `this()` and `super()` calls](https://medium.com/@basecs101/difference-between-this-and-super-keywords-and-this-and-super-calls-in-java-220053cf7d39)
18. Object Oriented Programming Paradigms
    1. [Inheritance](https://medium.com/@basecs101/what-is-inheritance-and-composition-in-java-check-the-differences-updated-37b8fe54cf80)
        - Definition
        - Rule
        - Types
        - [Upcasting and down-casting](https://medium.com/@basecs101/what-is-up-casting-and-down-casting-in-java-latest-ca114ef76a5f)
    2. [Composition](https://medium.com/@basecs101/what-is-inheritance-and-composition-in-java-check-the-differences-updated-37b8fe54cf80)
       - what is composition and how to implement it
       - How composition and inheritance are different
    3. [Encapsulation](https://medium.com/@basecs101/are-you-confused-with-encapsulation-clear-it-now-updated-30bd6ca66bfa)
        - what is encapsulation and why do we need it
        - [POJO and Beans and their differences](https://medium.com/@basecs101/what-do-pojo-and-bean-mean-in-java-how-are-they-different-latest-9555824e13a9)
    4. [Polymorphism](https://medium.com/@basecs101/what-is-method-overloading-and-method-overriding-in-java-latest-a7b74f83b7b6)
        - Overloading/static polymorphism/ compile time polymorphism
        - Overriding/ dynamic polymorphism/ runtime polymorphism
    5. [Abstraction](https://medium.com/@basecs101/why-you-must-know-abstraction-latest-6f11a85c50f0)
        - Interfaces --> full abstraction
        - Abstract class --> partial abstraction
        - Diamond problem and solution
19. [Immutable class and String, String Pool, Wrapper classes.](https://medium.com/javarevisited/do-you-know-immutable-class-in-java-why-string-is-immutable-dc18b0cec4b9)
    1. Make all fields private
    2. Create all argument constructor
    3. Remove All setters
    4. Use deep clone for objects in the constructor and getter methods
    5. Make class as final
    6. Optional rule - make all fields as final
20. [Everything you need to know about String Constant Pool](https://medium.com/javarevisited/what-does-string-pool-mean-in-java-996f0554e1dc)
21. [String, StringBuilder and StringBuffer](https://medium.com/@basecs101/string-stringbuilder-and-stringbuffer-a-complete-guide-5ddd083a2ad5)
22. [Anonymous class and inner classes](https://medium.com/@basecs101/do-you-know-nested-and-inner-classes-in-java-latest-b270e0988091)
23. [Enum and their usage](https://medium.com/@basecs101/confused-with-enum-here-is-an-article-to-clear-it-latest-e39d88fe7c66)
24. [Syntax Error, Exception, and Errors and Exception Handling Mechanism and their types](https://medium.com/@basecs101/exceptions-checked-and-unchecked-exceptions-and-handling-methods-in-java-a-complete-guide-latest-fc07b0bc381)
    - > `Throwable` - The Throwable class is the superclass of all errors and exceptions in the Java language. Only objects that are instances of this class (or one of its subclasses) are thrown by the Java Virtual Machine or can be thrown by the Java throw statement. Similarly, only this class or one of its subclasses can be the argument type in a catch clause. For the purposes of compile-time checking of exceptions, Throwable and any subclass of Throwable that is not also a subclass of either RuntimeException or Error are regarded as checked exceptions.
    Instances of two subclasses, Error and Exception, are conventionally used to indicate that exceptional situations have occurred. Typically, these instances are freshly created in the context of the exceptional situation so as to include relevant information (such as stack trace data)
    - > `Error` - An Error is a subclass of Throwable that indicates serious problems that a reasonable application should not try to catch. Most such errors are abnormal conditions. The ThreadDeath error, though a "normal" condition, is also a subclass of Error because most applications should not try to catch it.
    - > `Exception` - The class Exception and its subclasses are a form of Throwable that indicates conditions that a reasonable application might want to catch.
      The class Exception and any subclasses that are not also subclasses of RuntimeException are checked exceptions. Checked exceptions need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the method or constructor and propagate outside the method or constructor boundary.
25. [Java generics and how to use them.](https://medium.com/@basecs101/java-generics-why-are-they-used-interview-questions-8367e1266c8c)
26. [How Final, finally and finalize() different](https://medium.com/@basecs101/know-the-differences-between-final-finally-and-finalize-in-java-latest-668e65c5e9d5)
27. [Loose and Tight CCoupling and why always prefer loose coupling over tight coupling](https://medium.com/@basecs101/do-you-know-the-tight-and-loose-coupling-in-the-oop-latest-b03f8e600115)
28. Java 8 features
    1. [Functional Interface](https://medium.com/@basecs101/java-8-functional-interface-the-feature-that-you-must-know-latest-b2a539bb7917)
    2. [default and static methods](https://medium.com/@basecs101/java-8-new-features-that-you-must-know-latest-751297051795)
    3. [Lambda expression](https://medium.com/@basecs101/java-8-lambda-expression-the-feature-that-you-must-know-lastest-e0d9f8a8bc13)
    4. [Stream APIs](https://medium.com/@basecs101/java-8-frequently-used-stream-methods-latest-interview-questions-126a7d370cfd) and [refer this doc also](https://medium.com/@basecs101/java-8-features-interview-questions-stream-apis-interview-questions-updated-37f50f1ad5b5)
    5. Java Optional
29. [Is Java Pass by value or pass by reference](https://medium.com/@basecs101/is-java-pass-by-value-or-pass-by-reference-73a73b0c2234)

Program reference - https://www.programiz.com/java-programming/examples