package factory

import factory.pizzastores.{ChicagoStyleStore, NewYorkStyleStore}

object PizzaStoreDriver extends App {
  override def main(args: Array[String]): Unit = {
    val empireStatePizza = new NewYorkStyleStore
    val chitownPizza = new ChicagoStyleStore

    var pizza = empireStatePizza.orderPizza("cheese")
    println("Ethan ordered a " + pizza.getName + "\n")

    pizza = chitownPizza.orderPizza("cheese")
    println("Joel ordered a " + pizza.getName + "\n")

    pizza = empireStatePizza.orderPizza("clam")
    println("Ethan ordered a " + pizza.getName + "\n")

    pizza = chitownPizza.orderPizza("clam")
    println("Joel ordered a " + pizza.getName + "\n")

    pizza = empireStatePizza.orderPizza("pepperoni")
    println("Ethan ordered a " + pizza.getName + "\n")

    pizza = chitownPizza.orderPizza("pepperoni")
    println("Joel ordered a " + pizza.getName + "\n")

    pizza = empireStatePizza.orderPizza("veggie")
    println("Ethan ordered a " + pizza.getName + "\n")

    pizza = chitownPizza.orderPizza("veggie")
    println("Joel ordered a " + pizza.getName + "\n")
  }

}
