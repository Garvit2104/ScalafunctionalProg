object anonymousFuction extends App{
//  A function without name is calles as Anonymous Function
// these are used to assign function to a variable
  val sumOfNums = (num1:Int, num2:Int) => num1 + num2
  println(sumOfNums(300, 500))

  val doubler:Int => Int = (num : Int) => 2 * num
  println(doubler(5))
}
