package state

trait State {
  def insertQuarter(): Unit
  def ejectQuarter(): Unit
  def turnCrank(): Unit
  def dispense(): Unit
}
