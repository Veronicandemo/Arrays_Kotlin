fun main() {
    takeStrings("My", "Name", "is", "Ndemo")
    grammalCase()
    sumOfElements()
    println(containsThreeNames("Novak", "Kelvin","Ndemo"))

}
//takes in 4 strings and creates an array out of them
fun takeStrings(string1: String, string2: String, string3: String, string4: String){
    println(arrayOf(string1,string2,string3,string4).contentToString())
}
//Prints the names of the cities in the correct grammatical case
fun grammalCase(){
    var cities = arrayOf("harare","mumbai","dodoma","jakarta")
  for(city in cities){
      println(city.substring(0,1).uppercase() + city.substring(1))
  }
}

fun sumOfElements(){
    var numbers = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    //sum of second and fifth element
    println(numbers[1] + numbers[4])
    //prints index of 158
    println(numbers.indexOf(158))
    //prints elements in ascending order
    println(numbers.sortedArray().contentToString())
}
//takes 3 names and returns a string array containing 3 names
fun containsThreeNames(name1: String,name2: String, name3: String): String{
    return ("$name1 $name2 $name3")

}
