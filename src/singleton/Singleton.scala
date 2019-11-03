package singleton

object Singleton {
  val id: Int = scala.util.Random.nextInt()

  def printId(): Unit = println("ID of Singleton object is " + id.toString)
}
