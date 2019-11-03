package factory.pizzastores

import factory.pizzas.Pizza
import factory.pizzas.chicagostyle._

class ChicagoStyleStore extends PizzaStore {
  override val menu: Map[String, Pizza] = Map(
    "cheese" -> new ChicagoStyleCheese,
    "veggie" -> new ChicagoStyleVeg,
    "clam" -> new ChicagoStyleClam,
    "pepperoni" -> new ChicagoStylePepperoni
  )
}
