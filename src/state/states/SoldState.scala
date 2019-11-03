package state.states

import state.{GumballMachine, State}

class SoldState(gumballMachine: GumballMachine) extends State {

  override def insertQuarter(): Unit = println("Please wait, we're already giving you a gumball")

  override def ejectQuarter(): Unit = println("Sorry, you already turned the crank")

  override def turnCrank(): Unit = println("Turning twice doesn't get you another gumball!")

  override def dispense(): Unit = {
    gumballMachine.releaseBall()
    if (gumballMachine.numberOfGumballs > 0){
      gumballMachine.currentState = gumballMachine.noQuarterState
    } else {
      println("Oops, out of gumballs!")
      gumballMachine.currentState = gumballMachine.soldOutState
    }
  }

  override def toString: String = "dispensing a gumball"
}
