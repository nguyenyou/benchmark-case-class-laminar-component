package www

import org.scalajs.dom

trait ChildNode[Ref] extends ReactiveNode[Ref], Modifier[dom.Element] {
  override def apply(parentNode: dom.Element): Unit = {}
}
