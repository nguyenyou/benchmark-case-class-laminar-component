package www

import org.scalajs.dom

trait ChildNode[Ref <: dom.Node]
    extends ReactiveNode[Ref],
      Modifier[dom.Element] {
  override def apply(parentNode: dom.Element): Unit = {
    parentNode.appendChild(ref)
  }
}

object ChildNode {
  type Base = ChildNode[dom.Node]
}
