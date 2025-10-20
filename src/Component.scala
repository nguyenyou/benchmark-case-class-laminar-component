package myapp

import com.raquo.laminar.api.L.*

class Component(name: String) {
  def apply(): HtmlElement = {
    div(s"Component: $name")
  }
}
