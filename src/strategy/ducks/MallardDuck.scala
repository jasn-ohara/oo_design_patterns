package strategy.ducks

import strategy.{Duck, FlyBehaviour, QuackBehavior}
import strategy.flys.FlyWithWings
import strategy.quacks.Quack

class MallardDuck extends Duck {
  override def setFlyBehaviour(): FlyBehaviour = new FlyWithWings
  override def setQuackBehaviour(): QuackBehavior = new Quack
  override def display(): Unit = println("I'm a real Mallard duck")
}
