package strategy.flys

import strategy.FlyBehaviour

class FlyWithWings extends FlyBehaviour {
  override def fly(): Unit = println("I'm flying!!")
}
