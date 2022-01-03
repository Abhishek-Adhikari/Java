# Java Package
A java package is a group of similar types of classes, interfaces and sub-packages.

Package in java can be categorized in two form, built-in package and user-defined package.

There are many built-in packages such as java, lang, awt, javax, swing, net, io, util, sql etc.

## Advantage of Java Package

- Java package is used to categorize the classes and interfaces so that they can be easily maintained.
- Java package provides access protection.

- Java package removes naming collision.

# Exception Handling in Java
The Exception Handling in Java is one of the powerful mechanism to handle the runtime errors so that the normal flow of the application can be maintained.
``` The core advantage of exception handling is to maintain the normal flow of the application. ```

Exception Handling is a mechanism to handle runtime errors such as ClassNotFoundException, IOException, SQLException, RemoteException, etc.

## JAVA Exception Keywords
## try
The "try" keyword is used to specify a block where we should place an exception code. It means we can't use try block alone. The try block must be followed by either catch or finally.

## catch
The "catch" block is used to handle the exception. It must be preceded by try block which means we can't use catch block alone. It can be followed by finally block later.

## finally
The "finally" block is used to execute the necessary code of the program. It is executed whether an exception is handled or not.

## throw
The "throw" keyword is used to throw an exception.

## throws
The "throws" keyword is used to declare exceptions. It specifies that there may occur an exception in the method. It doesn't throw an exception. It is always used with method signature.

# Chained Exceptions
Chained Exception helps to identify a situation in which one exception causes another Exception in an application.

For instance, consider a method which throws an ArithmeticException because of an attempt to divide by zero but the actual cause of exception was an I/O error which caused the divisor to be zero.The method will throw the ArithmeticException to the caller. The caller would not know about the actual cause of an Exception. Chained Exception is used in such situations.

# What is File Handling in Java?

File handling in Java implies reading from and writing data to a file. The File class from the ``` java.io package ``` , allows us to work with different formats of files. In order to use the File class, you need to create an object of the class and specify the filename or directory name.