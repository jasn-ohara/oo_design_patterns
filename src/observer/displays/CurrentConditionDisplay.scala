package observer.displays

import observer.{DisplayElement, Observer, Subject}

class CurrentConditionDisplay(weatherData: Subject) extends Observer with DisplayElement {
  var temperature: Float = _
  var humidity: Float = _
  weatherData.registerObserver(this)

  override def update(temperature: Float, humidity: Float, pressure: Float): Unit = {
    this.temperature = temperature
    this.humidity = humidity
    display()
  }
  override def display(): Unit = println(s"Current conditions : ${temperature}C and $humidity% humidity")
}
