## Assigned Date: Dec 28 / 2021 Deadline : Jan  3 / 2022
## Submitted in: Jan 2 / 2022 

# STREAM

 A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
The features of Java stream are :
- A stream is not a data structure instead it takes input from the Collections, Arrays or I/O channels.
- Streams don’t change the original data structure, they only provide the result as per the pipelined methods.

- Each intermediate operation is lazily executed and returns a stream as a result, hence various intermediate operations can be pipelined. Terminal operations mark the end of the stream and return the result.


## Types of STREAM

- Input stream

 It is an object from which we can read a sequence of bytes.

- Output stream

 It is an object from which we can write a sequence of bytes.


# ZIP file STREAM

 Zip files are the archives that store one or more files in compressed form. The java.util.zip contains the classes for working with zip files. Each zip file has a header which includes information like the name of the file and the compression method used like GZIP and ZIP. ZipInputStream() is used to read a Zip file by layering the zipInputSream constructor on to a FileInputStream().We then need to look at the individual entries in the archive. The getNextEntry() method returns an object of type zipEntry that describes the entry. The read methods of the ZipInputStream are modified to return -1 at the end of the current entry.

# OBJECT stream

 Just as data streams support I/O of primitive data types, object streams support I/O of objects. Most, but not all, standard classes support serialization of their objects. Those that do implement the marker interface Serializable.

The object stream classes are ObjectInputStream and ObjectOutputStream. These classes implement ObjectInput and ObjectOutput, which are subinterfaces of DataInput and DataOutput. That means that all the primitive data I/O methods covered in Data Streams are also implemented in object streams. So an object stream can contain a mixture of primitive and object values. The ObjectStreams example illustrates this. ObjectStreams creates the same application as DataStreams, with a couple of changes. First, prices are now BigDecimalobjects, to better represent fractional values. Second, a Calendar object is written to the data file, indicating an invoice date.

If readObject() doesn't return the object type expected, attempting to cast it to the correct type may throw a ClassNotFoundException. In this simple example, that can't happen, so we don't try to catch the exception. Instead, we notify the compiler that we're aware of the issue by adding ClassNotFoundException to the main method's throws clause.
