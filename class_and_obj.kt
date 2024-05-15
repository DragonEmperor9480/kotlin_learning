fun main()
{
    //Creating an object
    val my_vehicle = vehicle()
    my_vehicle.StartEng()
    my_vehicle.stopEng()

    //Accessing class information using object
    println(my_vehicle.color)
}

//class
class vehicle{
    val color: String = "White"
    val EngieneSize: Int = 4000
    val fueltype = "Petrol"

    fun StartEng()
    {
        println("Engiene is Staarted")
    }

    fun stopEng()
    {
        println("Engiene is Stopped")
    }
}