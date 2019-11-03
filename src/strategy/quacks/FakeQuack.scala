package strategy.quacks

import strategy.QuackBehavior

class FakeQuack extends QuackBehavior {
  override def quack(): Unit = println("Qwak")
}
