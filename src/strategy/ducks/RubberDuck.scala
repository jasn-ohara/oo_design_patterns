package strategy.ducks

import strategy.{Duck, FlyBehaviour, QuackBehavior}
import strategy.flys.FlyNoWay
import strategy.quacks.Squeak

class RubberDuck extends Duck {
  override def setFlyBehaviour(): FlyBehaviour = new FlyNoWay
  override def setQuackBehaviour(): QuackBehavior = new Squeak
  override def display(): Unit = println("I'm a rubber duckie")
}
