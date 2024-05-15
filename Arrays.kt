

fun main(){
    val numb = arrayOf(1,2,3,4,5)
    println(numb.get(3))
    //in this above method the array size is fixed we can't add new elements
    //So to add new elements, we use the below methods

    val num= mutableListOf(1,2,3)
    num.add(4)
    println(num.get(3))
    
    //To print size of Array
    println(num.size)
    
    //To remove elements
    num.remove(0)
    println(num.size)
    
}
