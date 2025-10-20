package myapp

import com.raquo.laminar.api.L.*

class Component(name: String, index: Int) {
  def apply(): HtmlElement = {
    div(s"$index: Component: $name")
  }
}
