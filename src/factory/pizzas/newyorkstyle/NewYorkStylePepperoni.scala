package factory.pizzas.newyorkstyle

class NewYorkStylePepperoni extends NewYorkStyle {
  override val toppingName: String = "Pepperoni"
  override def getToppings: List[String] = super.getToppings ++
    List("Sliced Pepperoni", "Garlic", "Onion", "Mushrooms", "Red Pepper")
}
