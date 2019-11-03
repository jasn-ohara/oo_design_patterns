package decorator.beverages

import decorator.Beverage

class Espresso extends Beverage {
  override val description: String = "Espresso"
  override def cost(): Double = 1.99
}
