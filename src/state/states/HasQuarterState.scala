package state.states

import state.{GumballMachine, State}

class HasQuarterState(gumballMachine: GumballMachine) extends State {

  override def insertQuarter(): Unit = println("You can't insert another quarter")

  override def ejectQuarter(): Unit = {
    println("Quarter returned")
    gumballMachine.currentState = gumballMachine.noQuarterState
  }

  override def turnCrank(): Unit ={
    println("You turned...")
    gumballMachine.currentState = gumballMachine.soldState

  }

  override def dispense(): Unit = println("No gumball dispensed")

  override def toString: String = "waiting for turn of crank"
}
