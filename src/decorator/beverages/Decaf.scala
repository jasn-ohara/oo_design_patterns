package decorator.beverages

import decorator.Beverage

class Decaf extends Beverage {
  override val description: String = "Decaf Coffee"
  override def cost(): Double = 1.05
}