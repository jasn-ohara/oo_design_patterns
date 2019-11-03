package strategy

import strategy.ducks.{DecoyDuck, MallardDuck, ModelDuck, RubberDuck}

object DuckDriver extends App {
  override def main(args: Array[String]): Unit = {
    val mallard: MallardDuck = new MallardDuck
    val rubberDuck: RubberDuck = new RubberDuck
    val decoy: DecoyDuck = new DecoyDuck
    val model: ModelDuck = new ModelDuck

    mallard.performQuack()
    rubberDuck.performQuack()
    decoy.performQuack()
    model.performFly()
    decoy.display()
  }
}
