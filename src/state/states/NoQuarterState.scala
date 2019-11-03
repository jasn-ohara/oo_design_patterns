package state.states

import state.{GumballMachine, State}

class NoQuarterState(gumballMachine: GumballMachine) extends State {

  override def insertQuarter(): Unit = {
    println("You inserted a quarter")
    gumballMachine.currentState = gumballMachine.hasQuarterState
  }

  override def ejectQuarter(): Unit = println("You haven't inserted a quarter")

  override def turnCrank(): Unit = println("You turned, but there's no quarter")

  override def dispense(): Unit = println("You need to pay first")

  override def toString: String = "waiting for quarter"
}
