package strategy.quacks

import strategy.QuackBehavior

class Quack extends QuackBehavior{
  override def quack(): Unit = println("Quack")
}
