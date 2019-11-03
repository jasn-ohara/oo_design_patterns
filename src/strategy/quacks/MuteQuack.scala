package strategy.quacks

import strategy.QuackBehavior

class MuteQuack extends QuackBehavior {
  override def quack(): Unit = println("<< Silence >>")
}
