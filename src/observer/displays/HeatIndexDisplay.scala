package observer.displays

import observer.{DisplayElement, Observer, WeatherData}

class HeatIndexDisplay(weatherData: WeatherData) extends Observer with DisplayElement {
  var heatIndex: Float = 0.0f
  weatherData.registerObserver(this)

  override def update(temp: Float, humidity: Float, pressure: Float): Unit = {
    heatIndex = computeHeatIndex(temp, humidity)
    display()
  }

  def computeHeatIndex(temp: Float, humidity: Float): Float = {
    ((16.923 + (0.185212 * temp) + (5.37941 * humidity) - (0.100254 * temp * humidity)
      + (0.00941695 * (temp * temp)) + (0.00728898 * (humidity * humidity))
      + (0.000345372 * (temp * temp * humidity)) - (0.000814971 * (temp * humidity * humidity)) +
      (0.0000102102 * (temp * temp * humidity * humidity)) - (0.000038646 * (temp * temp * temp)) +
      (0.0000291583 * (humidity * humidity * humidity)) + (0.00000142721 * (temp * temp * temp * humidity)) +
      (0.000000197483 * (temp * humidity * humidity * humidity)) -
      (0.0000000218429 * (temp * temp * temp * humidity * humidity)) +
      0.000000000843296 * (temp * temp * humidity * humidity * humidity)) -
      (0.0000000000481975 * (temp * temp * temp * humidity * humidity * humidity))).toFloat
  }
  override def display(): Unit = println("The heat index is " + heatIndex)

}
