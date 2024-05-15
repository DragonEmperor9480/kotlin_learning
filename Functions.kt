fun main()
{
add()
sub(5, 10)
println(mul(5, 2))
println(div(10,10))
}

fun add(){
    val a = 10
    val b = 20
    println(a+b)
}

//Dynacmically using function
fun sub(a: Int,b: Int)
{
    println(a - b)
}

//For returning the value
fun mul (a: Int, b: Int): Int
{
    return(a*b)
}

//another way
fun div(a: Int, b: Int) = a/b