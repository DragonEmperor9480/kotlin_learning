// Arithmetic Operators 
// Arithmetic operators are used to perform mathematical operations such as addition, subtraction, multiplication, division, modulus, etc., on the given operands.

//Assignment Operators
//example
// =  Assign value of right side of expression to left side operand	x = y + z 	x = y + z
//+= Add and Assign: Add right side operand with left side operand and then assign to left operand	a += b   	a = a + b
fun main()
{
    val a =10
    val b = 20
    
    //Addition
    println(a+b)
    println("The addition of two numbers is "+(a+b))

    //Subtraction
    println("The subtraction of two numbers is "+(a-b))

    //etc etc 
    
    var c = 10
    var d = 10
    c += c
    println(c)
    d -+d
    println(d)

//comparision opertaors
println(a>b)
println((a>b) || (b>a)) //OR operator: ||
println(!(a>b)) //Not operator: !
println((a>b) && (b>a)) // And operator: &&
}