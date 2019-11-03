package factory.pizzas.chicagostyle

import factory.pizzas.Pizza

trait ChicagoStyle extends Pizza {
  override val style: String = "Chicago"
  override def getDough: String = "Extra Thick Crust " + super.getDough
  override def getSauce: String = "Plum Tomato " + super.getSauce
  override def getToppings: List[String] = List("Shredded Mozzarella Cheese")
  override def cut(): Unit = println("Cutting the pizza into square slices")
}
