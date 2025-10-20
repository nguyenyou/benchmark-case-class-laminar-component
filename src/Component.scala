package myapp

import com.raquo.laminar.api.L.*

case class Component() {
  def apply(): HtmlElement = {
    div("Component")
  }
}
