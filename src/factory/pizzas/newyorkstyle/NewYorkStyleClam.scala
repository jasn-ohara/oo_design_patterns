package factory.pizzas.newyorkstyle

class NewYorkStyleClam extends NewYorkStyle {
  override val toppingName: String = "Clam"
  override def getToppings: List[String] = super.getToppings :+ "Fresh Clams from Long Island Sound"
}

