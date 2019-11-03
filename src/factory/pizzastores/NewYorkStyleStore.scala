package factory.pizzastores

import factory.pizzas.Pizza
import factory.pizzas.newyorkstyle._

class NewYorkStyleStore extends PizzaStore {
  override val menu: Map[String, Pizza] = Map(
    "cheese" -> new NewYorkStyleCheese,
    "veggie" -> new NewYorkStyleVeg,
    "clam" -> new NewYorkStyleClam,
    "pepperoni" -> new NewYorkStylePepperoni
  )
}
