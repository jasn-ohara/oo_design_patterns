package decorator

trait Beverage {
  val description = "Unknown Beverage"
  def cost(): Double
  override def toString: String = {
    val roundedCost = BigDecimal(cost()).setScale(2, BigDecimal.RoundingMode.HALF_UP).toDouble
    description + " - $" + roundedCost
  }
}