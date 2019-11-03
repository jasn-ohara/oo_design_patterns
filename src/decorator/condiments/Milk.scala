package decorator.condiments

import decorator.{Beverage, CondimentDecorator}

class Milk(beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", Milk"
  override def cost(): Double = beverage.cost + 0.10
}
