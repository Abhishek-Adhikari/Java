25 Jan 2022 - 27 Jan 2022

![Screenshot](https://raw.githubusercontent.com/Abhishek-Adhikari/java/tree/master/assignments/assignment-10(JDBC)/CRUD/images/EclipseSS.png)

## Understand the main JDBC interfaces and classes

Let’s take an overview look at the JDBC’s main interfaces and classes with which we usually work. They are all available under the java.sql package:

- DriverManager: this class is used to register driver for a specific database type (e.g. MySQL in this tutorial) and to establish a database connection with the server via its getConnection() method.
- Connection: this interface represents an established database connection (session) from which we can create statements to execute queries and retrieve results, get metadata about the database, close connection, etc.
- Statement and PreparedStatement: these interfaces are used to execute static SQL query and parameterized SQL query, respectively. Statement is the super interface of the PreparedStatement interface. Their commonly used methods are:
  1. boolean execute(String sql): executes a general SQL statement. It returns true if the query returns a ResultSet, false if the query returns an update count or returns nothing. This method can be used with a Statement only.

  2. int executeUpdate(String sql): executes an INSERT, UPDATE or DELETE statement and returns an update account indicating number of rows affected (e.g. 1 row inserted, or 2 rows updated, or 0 rows affected).

  3. ResultSet executeQuery(String sql): executes a SELECT statement and returns a ResultSet object which contains results returned by the query.

A prepared statement is one that contains placeholders (in form question marks ?) for dynamic values will be set at runtime. For example:

``` SELECT * from Users WHERE user_id=? ```

Here the value of user_id is parameterized by a question mark and will be set by one of the setXXX() methods from the PreparedStatement interface, e.g. setInt(int index, int value).

- ResultSet: contains table data returned by a SELECT query. Use this object to iterate over rows in the result set using next() method, and get value of a column in the current row using getXXX() methods (e.g. getString(), getInt(), getFloat() and so on). The column value can be retrieved either by index number (1-based) or by column name.

- SQLException: this checked exception is declared to be thrown by all the above methods, so we have to catch this exception explicitly when calling the above classes’ methods.    