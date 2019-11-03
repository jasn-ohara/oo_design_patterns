package iterator

import iterator.menus.{DinerMenu, PancakeHouseMenu}

object CafeDriver extends App {
  override def main(args: Array[String]): Unit = {
    val pancakeHouseMenu = new PancakeHouseMenu
    val dinerMenu = new DinerMenu
    val pancakeIterator = pancakeHouseMenu.createIterator
    val dinerIterator = dinerMenu.createIterator
    println("\nMENU\n----\nBREAKFAST")
    printMenu(pancakeIterator)
    println("\nLUNCH")
    printMenu(dinerIterator)
  }

  def printMenu(iterator: Iterator[String]): Unit = {
    while(iterator.hasNext){
      val menuItem = iterator.next
      println(menuItem)
    }
  }
}
