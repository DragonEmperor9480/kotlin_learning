fun main()
{
    for(i in 1..10)
    {
        println(i)
    }

    for(i in 1..30 step(3))
    {
        println(i)
    }

    //using for loop 
    val ab =arrayOf("A","B","C","D","E")
    for(i in ab.indices)
    {
        println(ab.get(i))
    }

    for (i in ab)
    {
        println(i)
    }

    //to print index values

    for(i in ab.indices)
    {
        println(i)
    }
}