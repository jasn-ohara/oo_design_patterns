package decorator.condiments

import decorator.{Beverage, CondimentDecorator}

class Mocha(beverage: Beverage) extends CondimentDecorator  {
  override val description: String = beverage.description + ", Mocha"
  override def cost(): Double = beverage.cost + 0.20
}
