package factory.pizzas.chicagostyle

class ChicagoStyleVeg extends ChicagoStyle {
  override val toppingName: String = "Veg"
  override def getToppings: List[String] = super.getToppings ++
    List("Black Olives", "Spinach", "Eggplant")
}
