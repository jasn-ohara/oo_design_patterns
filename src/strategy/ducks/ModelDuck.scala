package strategy.ducks

import strategy.{Duck, FlyBehaviour, QuackBehavior}
import strategy.flys.FlyNoWay
import strategy.quacks.Quack

class ModelDuck extends Duck {
  override def setFlyBehaviour(): FlyBehaviour = new FlyNoWay
  override def setQuackBehaviour(): QuackBehavior = new Quack
  override def display(): Unit = println("I'm a model duck")
}
