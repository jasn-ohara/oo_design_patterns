package decorator.condiments

import decorator.{Beverage, CondimentDecorator}

class Soy(beverage: Beverage) extends CondimentDecorator {
  override val description: String = beverage.description + ", Soy"
  override def cost(): Double = beverage.cost + 0.15

}
