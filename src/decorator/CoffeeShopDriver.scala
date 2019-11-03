package decorator

import decorator.beverages.{DarkRoast, Espresso, HouseBlend}
import decorator.condiments.{Milk, Mocha, Soy, Whip}

object CoffeeShopDriver extends App {
  override def main(args: Array[String]): Unit = {

    val espresso = new Espresso()
    println(espresso.toString)

    val house = new HouseBlend
    val houseSoy = new Soy(house)
    val houseSoyMocha = new Mocha(houseSoy)
    println(houseSoyMocha.toString)

    val dark = new DarkRoast
    val darkMocha = new Mocha(dark)
    val darkMochaMilk = new Milk(darkMocha)
    val darkMochaMilkWhip = new Whip(darkMochaMilk)
    println(darkMochaMilkWhip.toString)
  }
}
