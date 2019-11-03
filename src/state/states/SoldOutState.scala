package state.states

import state.{GumballMachine, State}

class SoldOutState(gumballMachine: GumballMachine) extends State {

  override def insertQuarter(): Unit = println("You can't insert a quarter, the machine is sold out")

  override def ejectQuarter(): Unit = println("You can't eject, you haven't inserted a quarter yet")

  override def turnCrank(): Unit = println("You turned, but there are no gumballs")

  override def dispense(): Unit = println("No gumball dispensed")

  override def toString: String = "sold out"
}
