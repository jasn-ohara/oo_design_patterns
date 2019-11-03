package decorator.condiments

import decorator.{Beverage, CondimentDecorator}

class Whip(beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", Whip"
  override def cost(): Double = beverage.cost + 0.10
}
