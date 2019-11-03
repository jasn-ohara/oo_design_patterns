package singleton

object SingletonDriver extends App {
  override def main(args: Array[String]): Unit = {
    val s1 = Singleton
    val s2 = Singleton

    s1.printId()
    s2.printId()
  }
}
