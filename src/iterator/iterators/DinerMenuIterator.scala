package iterator.iterators

import iterator.Iterator

class DinerMenuIterator(items: Array[String]) extends Iterator[String] {
  var position: Int = 0

  override def next: String = {
    val menuItem = items(position)
    position = position + 1
    menuItem
  }
  override def hasNext: Boolean =
    if(position >= items.length || items(position) == null) false
    else true
}
