### Garbage Collection 
Garbage collection is a mechanism to remove objects from memory when they are no longer needed.Garbage collection is carried out by the garbage collector:
 1. The garbage collector keeps track of how many    references an object has.
 2. It removes an object from memory when it has no longer any references.
 3. Thereafter,the memory occupied by the object can be allocated again.
 4. The garbage collector invokes the finalize method.

 The automatic garbage collection mechanism in Java aids in easy programming and debugging.It eliminates the bugs like dangling pointer bugs, double free bugs,memory leak bugs.Optimum memory utilization is enforced and there is less chance of memory corruption. Java runs garbage collector sporadically. But if you want to call the garbage collector at your desire then you should call the *system.gc()* method.

 *finalize()* **Method**
 A constructor helps to initialize an object just after it has been created. In contrast, the finalize method is invoked just before the object is destroyed.It is implemented when the normal way of removing the objects from the memory is insufficient and some special astions has to be carried out. It is implemented inside a class following the following syntax:
 *protected void finalize() {..}*