package decorator.beverages

import decorator.Beverage

class HouseBlend extends Beverage {
  override val description: String = "House Blend Coffee"
  override def cost(): Double = .89
}
