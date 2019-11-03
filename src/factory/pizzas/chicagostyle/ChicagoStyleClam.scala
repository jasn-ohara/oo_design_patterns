package factory.pizzas.chicagostyle

class ChicagoStyleClam extends ChicagoStyle {
  override val toppingName: String = "Clam"
  override def getToppings: List[String] =
    super.getToppings :+ "Frozen Clams from Chesapeake Bay"
}
