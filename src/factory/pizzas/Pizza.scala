package factory.pizzas

trait Pizza {
  val style: String
  val toppingName: String
  def getDough: String = "Dough"
  def getSauce: String = "Sauce"
  def getToppings: List[String] = List()

  def prepare(): Unit = {
    println("Prepare " + getName)
    println("Tossing dough...")
    println("Adding sauce...")
    println("Adding toppings: ")
    getToppings.foreach(topping => println("   " + topping))
  }
  def bake(): Unit = println("Bake for 25 minutes at 350")
  def cut(): Unit = println("Cut the pizza into diagonal slices")
  def box(): Unit = println("Place pizza in official PizzaStore box")

  def getName: String = style + " Style " + toppingName + " Pizza"
  override def toString: String = {
    "---- " + getName + " ----\n" +
    getDough + "\n" +
    getSauce + "\n" +
    getToppings.mkString("\n")
  }
}
