package decorator.beverages

import decorator.Beverage

class DarkRoast extends Beverage {
  override val description: String = "Dark Roast Coffee"
  override def cost(): Double = 0.99
}