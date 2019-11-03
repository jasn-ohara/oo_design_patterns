package factory.pizzastores

import factory.pizzas.Pizza

trait PizzaStore {
  val menu: Map[String, Pizza]

  def orderPizza(pizzaName: String): Pizza = {
    val pizza = menu(pizzaName.toLowerCase())
    println("--- Making a " + pizza.getName + " ---")
    pizza.prepare()
    pizza.bake()
    pizza.cut()
    pizza.box()
    pizza
  }

}
