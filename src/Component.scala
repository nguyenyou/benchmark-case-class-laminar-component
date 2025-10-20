package myapp

import com.raquo.laminar.api.L.*

case class Component(name: String) {
  def apply(): HtmlElement = {
    div(s"Component: $name")
  }
}
