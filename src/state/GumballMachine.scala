package state

import state.states.{HasQuarterState, NoQuarterState, SoldOutState, SoldState}

class GumballMachine(var numberOfGumballs: Int) {
  val soldOutState: State = new SoldOutState(this)
  val noQuarterState: State = new NoQuarterState(this)
  val hasQuarterState: State = new HasQuarterState(this)
  val soldState: State = new SoldState(this)
  var currentState: State =
    if(numberOfGumballs < 1) soldOutState else noQuarterState

  def insertQuarter(): Unit = currentState.insertQuarter()
  def ejectQuarter(): Unit = currentState.ejectQuarter()
  def turnCrank(): Unit = {
    currentState.turnCrank()
    currentState.dispense()
  }
  def releaseBall(): Unit = {
    println("A gumball comes rolling out the slot...")
    if (numberOfGumballs > 0) numberOfGumballs = numberOfGumballs - 1
  }

  def refill(refillCount: Int): Unit = {
    numberOfGumballs = numberOfGumballs + refillCount
  }

  override def toString: String = {
    val title = "\nMighty Gumball, Inc."
    val subtitle = "\nJava-enabled Standing Gumball Model #2004"
    val countReport = s"\nInventory: ${numberOfGumballs} gumball" + (if(numberOfGumballs > 1) "s")
    val stateReport = s"\nMachine is ${currentState}\n"

    title + subtitle + countReport + stateReport
  }

}
