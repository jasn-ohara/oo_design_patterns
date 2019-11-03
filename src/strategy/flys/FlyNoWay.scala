package strategy.flys

import strategy.FlyBehaviour

class FlyNoWay extends FlyBehaviour {
  override def fly(): Unit = println("I can't fly")
}
