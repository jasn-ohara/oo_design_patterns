package strategy.ducks

import strategy.flys.FlyNoWay
import strategy.quacks.MuteQuack
import strategy.{Duck, FlyBehaviour, QuackBehavior}

class DecoyDuck extends Duck {
  override def setFlyBehaviour(): FlyBehaviour = new FlyNoWay
  override def setQuackBehaviour(): QuackBehavior = new MuteQuack
  override def display(): Unit = println("I'm a duck Decoy")
}
