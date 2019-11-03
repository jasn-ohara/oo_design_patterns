package strategy.quacks

import strategy.QuackBehavior

class Squeak extends QuackBehavior {
  override def quack(): Unit = println("Squeak")
}
