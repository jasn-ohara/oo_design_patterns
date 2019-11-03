package observer

trait Subject {
  def registerObserver(o: Observer): Unit
  def removeObserver(o: Observer): Unit
  def notifyObservers(): Unit
}
