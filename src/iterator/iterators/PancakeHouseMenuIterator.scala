package iterator.iterators

import iterator.Iterator

class PancakeHouseMenuIterator(items: List[Any]) extends Iterator[String] {
  var position: Int = 0

  override def next: String = {
    val menuItem = items(position)
    position = position + 1
    menuItem.toString
  }
  override def hasNext: Boolean =
    if(position >= items.size) false
    else true
}
