package factory.pizzas.newyorkstyle

import factory.pizzas.Pizza

trait NewYorkStyle extends Pizza {
  override val style: String = "New York"
  override def getDough: String = "Thin Crust " + super.getDough
  override def getSauce: String = "Marinara " + super.getSauce
  override def getToppings: List[String] = List("Grated Reggiano Cheese")
}
