package strategy

abstract class Duck {
  val flyBehaviour: FlyBehaviour = setFlyBehaviour()
  val quackBehavior: QuackBehavior = setQuackBehaviour()

  def setFlyBehaviour(): FlyBehaviour
  def setQuackBehaviour(): QuackBehavior

  def display(): Unit

  def performFly(): Unit = flyBehaviour.fly()
  def performQuack(): Unit = quackBehavior.quack()
  def swim(): Unit = println("All ducks swim!")

}
