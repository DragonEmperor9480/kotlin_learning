// Arrays:
// Arrays are fixed in size. Once an array is created, its size cannot be changed.
// Arrays are mutable. This means that the elements of an array can be changed.
// Arrays are stored in a contiguous block of memory. This means that all of the elements of an array are stored next to each other in memory.

// Lists:
// Lists are dynamic in size. This means that the size of a list can be changed as needed.
// Lists are immutable. This means that the elements of a list cannot be changed.
// Lists are stored in a non-contiguous block of memory. This means that the elements of a list can be scattered throughout memory.
fun main(){
val num = listOf("1","2","3","4")
println(num.get(1))
println(num.size)

val numb = mutableListOf(1,2,3,4,5)
println(numb.size)
//adding an element
numb.add(6)
print(numb.size)
//removing an element
numb.remove(5)
}