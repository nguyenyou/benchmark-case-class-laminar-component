package www

import org.scalajs.dom

class TextNode(initialText: String) extends ChildNode[dom.Text] {
  final override val ref: dom.Text = dom.document.createTextNode(initialText)
}
