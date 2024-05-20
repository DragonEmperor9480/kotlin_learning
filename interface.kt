interface smartphone {
    fun on()
    fun off()
}
 
class samsung : smartphone {
  
    override fun on()
    {
        println("Booted!")
    }
 
    override fun off()
    {
        println("Powering Off")
    }
}
 
fun main()
{
    val obj = samsung()
    obj.on()
    obj.off()
}