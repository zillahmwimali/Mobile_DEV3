import java.lang.reflect.Array
import java.util.*


fun main() {
county()
    places()
    shoeSize()
    println(Arrays.toString(myName("Zillah","Mwimali","Odongo")))
}
fun county(){
    var countyName=arrayOf("Nairobi","Kakamega","Kiambu","Kisumu")
    println(Arrays.toString(countyName))
}
fun places(){
    var cities=arrayOf("harare","mumbai","dodoma","jakarta")
    cities.forEach { x ->
        println(x.capitalize())
    }

}
fun shoeSize(){
    var numbers=arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    var addition=numbers[1].plus(numbers[4])
    println(addition)
    println(numbers.indexOf(158))
    println(Arrays.toString(numbers.sortedArray()))
}
fun myName(name1:String,name2:String,name3:String):kotlin.Array<String>{
    var officialName=arrayOf(name1,name2,name3)
        return officialName
}
