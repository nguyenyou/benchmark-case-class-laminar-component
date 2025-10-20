package www

trait Binder[El] extends Modifier[El] {
  def bind(element: El): Unit
  final override def apply(element: El): Unit = bind(element)
}
