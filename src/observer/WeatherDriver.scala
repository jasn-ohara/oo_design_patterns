package observer

import observer.displays.{CurrentConditionDisplay, ForecastDisplay, HeatIndexDisplay}

object WeatherDriver extends App {
  override def main(args: Array[String]): Unit = {

    val weatherData: WeatherData = new WeatherData
    new CurrentConditionDisplay(weatherData)
    new ForecastDisplay(weatherData)
    new HeatIndexDisplay(weatherData)

    weatherData.setMeasurements(24, 70, 30.4f)
    weatherData.setMeasurements(12, 80, 29.2f)
    weatherData.setMeasurements(31, 90, 28.9f)
  }
}
