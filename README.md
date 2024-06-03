##                                   Core JAVA

### Program :
    A program is a set of instructions, which are executed by a machine to reduce the burden
    of user or a human-being by performing the operations faster without any mistakes.

### Software :
    It is a set of programs, which can perform multiple tasks.

### Types of Software :
#### System Software :
    The softwares which are designed to interact or communicate with the hardware devices, and make 
    them work 
    Ex : OS, drivers, compilers etc.

#### Application Software :
    The software which are designed to store data, process data
    
### Types of Application Software :
##### Stand alone Software :
    The software which can execute in the context of a single machine.
    Ex : MS-Word, Media Player, etc..,

##### Web based Software :
    The software which can execute on any machine in the context of a browser.
    Ex : Gmail, Facebook, etc..,

### Java :
    Java is a multi-platform, object-oriented, and that can used as a platform in itself.
    It is fast, secure, highlevel, reliable Programming language.

### Java Features :
* Simple
* Object-Oriented
* Secured
* Distributed
* Platform independent
* Interpreted
* High Performance
* Portable
* Multithreaded
* Dynamic
* Robust

### Java Library :
    A Library is a collection of pre-defined programs of a language.

### Datatypes :
    The datatypes represents the type of data that we store into the memory.

### Types of Datatypes :
#### Primitive :
    These are predefined and designed to store single value.
    Ex : int, char, double, float, boolean, etc..,

#### Derived / Non-Primitive :
    These are predefined and designed to store multiple values.
    Ex : Array, collections, interfaces, Enums, etc ..,

#### User-defined :
    If a datatype is created by user or programmer.
    Ex : class

### Variable :
    A variable is a name of memory location where we can store data.

### Variable declaration :
    The process of specifying what type of data is stored into the memory.

### Initialization :
    The process of specifying a value to a variable for the first time.

### Assignment :
    The process of specifying a value to a variable from the second time onwards or
    after the initialization.

### Keyword :
    The words that have predefined meaning in java or the words whose meaning is reserved.

### Literal :
    The values that we store into variable.

### Identifier :
    Any name that is used for the purpose of identification.

### Comments :
    The Comments are used for explaining the code. The comments make the understandability
    of  a program faster.

### Operators :
    Any symbol that performs an operation.

### Operand :
    The values on which the operations are performed

### Control Statements :
*   The statement of a java program will be executed in sequencial order.
*   These will help the programmer to control the flow execution in a java program.

### Switch Statement :
    It can used for executing a group of statments based on a value.

### For Loop :
    This loop can be used for executing the statements multiple times. A for loop
    has to be used when we know the exact number of iterations.

### While Loop :
    A Loop can be used for executing the statments multiple times. A while loop has to be
    used when we do not know the exact number of iterations.

### Do-While Loop :
    This loop can be used for executing the statements multiple times. A do-while loop has
    to be used when we do not know the exact number of iterations.

### Nested Loop :
    If we specify a loop inside another loop. Any loop can be specified inside any other 
    other loop any number of times.

### Break :
    Break is transfer statement which can be used either inside switch statement or inside 
    a loop.

### Continue :
    It is a transfer statement which has to be used only in loops. The continue statements
    will skip the current iteration and ocntinuous the remaining iterations.

## Arrays
### Array :
*  An array is a derived datatype.
*  An array is a collection of similar type of data elements to storing multiple values.
*  An array helps to reduce the code size, improve the readability of the code.

#### Single Dimensional Array :
    It is a collection of multiple values represented in the form of single row or
    single column.

#### Multi dimensional Array :
    In java will represented in the form of array of arrays.

### Jagged Array :
    In multi dimensional array of the arrays have unequal size.

## Strings :
### String :
    String is a predefined class, which can be used for storing a group of characters.

### Immutable Object :
    Once the String object is created we cannot modify the content of the object.

### StringBuilder :
    The StringBuilder class is used for storing a group of characters.

### StringBuffer :
    It is a predefined class, used for storing group of characters. StringBuffer object
    can be created in one way by using new operator.

### String class
*   The StringBuffer is synchronized(thread safe) and it can be accessed by only
    one thread at a time.
*   The StringBuilder is not synchronized, and it can be accessed by multiple 
    threads at a time.

### Command Line Arguments :
    The values that we pass into the program during the execution time in the command prompt.

### Hard Coding :
    The process of providing a value to a variable within the program.

### Parsing :
    It is a process of converting the value from string type to primitive type.

### BufferReader :
    The Programmer to read the data from the keyboard using BufferReader class.

## OOPs :

### OOPs :
    The applications that are developed with the help of objects and classes.

### Object :
    It is a memory allocation for instance variables.

### Class :
    Class is a collection of variables and methods.

### Method :
    Method is a block of instructions that performs a task. Method takes input, 
    process the input and returns the output.

### Static Variable :
*    A variable inside the class, outside to method with static keyword.
*    It stores common information of objects.
*    It accesses using class name.

### Instance Variable :
*   A Variable inside the class, outside to method without static keyword.
*   It stores specific information of object.
*   It accesses using object reference.

### Method Parameters :
    Variables inside the method parenthesis. These are used to  take input
    of a method. It accesses directly.

### Local Variables :
    A variable inside the method. Local variables store, process the data of a 
    method temporarily. It accesses directly.

### Constructor :
*   A special method with same name of a class.
*   Return type is not allowed.
*   Constructor executes in object creation process.

### Parameterized Constructor :
    It is used to initialize instance variables in object creation process.

### this keyword :
    this is used to access instance variables and methods of same class.

### this() :
    It is used to access one constructor from another constructor of same class.

### super :
    super is used to access instance variables and methods of parent class from child class.

### super():
    Super() is used to access parent class constructor from the child class constructor.

### Encapsulation :
    The concept of protecting object information from outside access.

### POJO Rules : (Plain Old Java Object)
*   class is public.
*   variables must be private.
*   Every variable has public set and get methods.

### Inheritance :
    Defining a new object by reusing the functionality of existing object.

### Types of Inheritance :
*   Single level inheritance
*   Multi-level inheritance
*   Hierarchical inheritance
*   Multiple inheritance
*   Hybrid inheritance

### Abstraction :
    The concept of hiding implementations or unnecessary data.

### Abstract class :
    abstract class is a collection of concrete methods and abstract methods.

### concrete class :
    concrete class is collection of concrete methods.

### Interface :
    Interface is a collection of abstract methods.

### Concrete Method :
    concrete method is a method with body.

### Abstract Method :
    abstract method is a method without body.

### Polymorphism :
    Defining an object that shows different functionality in communication.

### Method-Overloading :
    Defining multiple methods with a name but with a different signature.

### Method-Overriding :
    Defining a method in child class with same name and same signature of parent class.

### Access Modifiers :
    Access Modifiers set the access permission of classes and class members.
*   public -  Access Everywhere
*   private  -   These members access from the same class.
*   protected  -   These members can access inside the package and from the child classes
                    of other packages.
*   default  -  These members can access within the package.


### final Modifier :
    We can apply final modifier to classes, methods and variables.
*   If class is final, cannot be extended.
*   If method is final, cannot be overridden.
*   If variable is final, cannot be modified.