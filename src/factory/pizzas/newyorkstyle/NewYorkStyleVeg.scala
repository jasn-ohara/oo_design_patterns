package factory.pizzas.newyorkstyle

class NewYorkStyleVeg extends NewYorkStyle {
  override val toppingName: String = "Veg"
  override def getToppings: List[String] = super.getToppings ++
    List("Garlic", "Onion", "Mushrooms", "Red Pepper")}
