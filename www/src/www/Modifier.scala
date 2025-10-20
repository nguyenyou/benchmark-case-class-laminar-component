package www

trait Modifier[El] {
  def apply(element: El): Unit = ()
}
