package www

import org.scalajs.dom

class CommentNode(initialText: String) extends ChildNode[dom.Comment] {
  final override val ref: dom.Comment = dom.document.createComment(initialText)
}
