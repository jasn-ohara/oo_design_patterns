package iterator.menus

import iterator.Menu
import iterator.Iterator
import iterator.iterators.PancakeHouseMenuIterator

class PancakeHouseMenu extends Menu {
  val menuItems = List(
    "K&B's Pancake Breakfast",
    "Regular Pancake Breakfast",
    "Blueberry Pancakes",
    "Waffles"
  )

  override def createIterator: Iterator[String] = new PancakeHouseMenuIterator(menuItems)

  override def toString: String = "Pancake House Menu"
}
