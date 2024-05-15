// Kotlin's type system is aimed to eliminate the jeopardy of null reference from the code because it is a billion-dollar mistake. NullPointerExceptions are thrown by the program at runtime and sometimes cause application failure or system crashes. 
// If anybody has been programming in Java or other languages that have the concept of null reference then he must have experienced about NullPointerException in the code. Kotlin compiler also throws NullPointerException if it found any null reference without executing any other statements.
// The possible causes of NullPointerExceptions are the following: 
 

// Explicit call to throw NullPointerException()
// Use of the !! operator
// Some data inconsistency with regard to initialization e.g. an uninitialized this is passed as an argument.
// Java interoperations such as attempts to access a member on a null reference, generics type with incorrect nullability.

fun main()
{
    val name : String ="Amrut"
    
    println(name)

    // Now if we didnt used the declared variable it will give error 
    // we cant assign null value
    // var Name: String = "Demon"
    // var = null
    // Output:
    // NullSafety.kt:17:9: warning: variable 'Name' is never used
    // val Name: String = "Demon"
    //     ^

    //Now using Null safety
    var Fname: String? = "Ayaka"
    Fname = null
    println(Fname)

    //Safe Call operator(?.) -
    //It allows us to combine a null-check and a method call in a single expression.
    var a: String?= "Hello"
    var b: String?="Hello"
    println("The length of $b is "+a?.length)



}
