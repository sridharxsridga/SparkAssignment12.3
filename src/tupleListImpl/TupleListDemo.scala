/*
 * Create a list of tuples, where the 1st element of the tuple is an int and the second element is a string.
   Example - ((1, ‘alpha’), (2, ‘beta’), (3, ‘gamma’), (4, ‘zeta’), (5, ‘omega’))
  - For the above list, print the numbers where the corresponding string length is 4
  - Find the average of all numbers, where the corresponding string contains alphabet ‘m’ or alphabet ‘z’
 *
 */

package tupleListImpl

object TupleListDemo {

  def main(args: Array[String]): Unit = {

    //Create a vaiable of type list of two dimension which first wil hold an int value and second will hold string value
    var signList: List[(Int, String)] = List()
    //Adding values to list when we use -> on two parameter it result in creating a tuple
    signList = signList :+ ((1 -> "alpha"))
    signList = signList :+ ((2 -> "beta"))
    signList = signList :+ ((3 -> "gamma"))
    signList = signList :+ ((4 -> "zeta"))
    signList = signList :+ ((5 -> "omega"))
    
    println("list of tuples :" + signList)
    
    println("Numbers and values where string length is 4")
    //Loop the list and use case class for pattern matching and check if length of string is 4 then print the numbers
    signList.foreach { case (numbers, values) => if (values.length == 4) println(numbers + "," + values) }
    
    
    var totalNum: Float = 0
    
    var avgNum: Float = 0
    
    println("Numbers, where the corresponding string contains alphabet 'm' or 'e' :")
    //Loop through list and and use case clas for pattern matching and check if value contain 'm' or 'e' 
    signList.foreach {
      case (numbers, values) => if (values.contains('m') || values.contains('e')) {
        //this variable is used to get the total no of numbers
        totalNum += 1
        //this variable is used to add those numbers 
        avgNum += numbers

        println(numbers + "," + values)
      }
    }
    //this variable is used to calculate the average
    val average: Float = (avgNum / totalNum)
    println("Average of Numbers : " + average)

  }

}