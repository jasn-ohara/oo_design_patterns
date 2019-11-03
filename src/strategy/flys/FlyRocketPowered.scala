package strategy.flys

import strategy.FlyBehaviour

class FlyRocketPowered extends FlyBehaviour{
  override def fly(): Unit = println("I'm flying with a rocket")
}
