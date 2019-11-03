package factory.pizzas.chicagostyle

class ChicagoStylePepperoni extends ChicagoStyle {
  override val toppingName: String = "Pepperoni"
  override def getToppings: List[String] =
    super.getToppings ++
      List("Black Olives", "Spinach", "Eggplant", "Sliced Pepperoni")
}
