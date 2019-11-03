package iterator.menus

import iterator.Menu
import iterator.Iterator
import iterator.iterators.DinerMenuIterator


class DinerMenu extends Menu {
  var menuItems = Array(
    "Vegetarian BLT",
    "BLT",
    "Soup of the day",
    "Hotdog",
    "Steamed Veggies and Brown Rice",
    "Pasta"
  )

  override def createIterator: Iterator[String] = new DinerMenuIterator(menuItems)

  override def toString: String = "Diner Menu"
}
