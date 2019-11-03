package observer

class WeatherData extends Subject {

  var observers: List[Observer] = Nil
  var temperature: Float = _
  var humidity: Float = _
  var pressure: Float = _

  // Subject functions
  override def registerObserver(o: Observer): Unit = observers = observers :+ o
  override def removeObserver(o: Observer): Unit = {
    val i = observers.indexOf(o)
    observers = observers.drop(i)
  }
  override def notifyObservers(): Unit = {
    observers.foreach(_.update(temperature, humidity, pressure))
  }

  // Setting the measurements
  def setMeasurements(temperature: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temperature
    this.humidity = humidity
    this.pressure = pressure
    notifyObservers()
  }
}