package observer.displays

import observer.{DisplayElement, Observer, WeatherData}

class ForecastDisplay(weatherData: WeatherData) extends Observer with DisplayElement {

  var currentPressure: Float = 28.92f
  var lastPressure: Float = _
  weatherData.registerObserver(this)

  override def update(temp: Float, humidity: Float, pressure: Float): Unit = {
    lastPressure = currentPressure
    currentPressure = pressure
    display()
  }
  def display(): Unit = {
    print("Forecast: ")
    if (currentPressure > lastPressure) println("Improving weather on the way!")
    else if (currentPressure == lastPressure) println("More of the same")
    else if (currentPressure < lastPressure) println("Watch out for cooler, rainy weather")
  }
}
