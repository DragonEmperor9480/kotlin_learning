fun main(){
    println("Kotlin Basics")

// Val and var in kotlin
// val cannot be reassigned meanwhile var can be reassigned

// Example 1:
val A="Hello"
//A="World!"
println(A)
// Main.kt:15:1: error: val cannot be reassigned
// A="World!"
// ^

//example 2:
var b="Hello"
b = "world"
println(b)

//val and var automatically detect the datatype
}
