package myapp

import com.raquo.laminar.api.L.*

case class Component(name: String, index: Int, hidden: Boolean, num: Double) {
  def apply(): HtmlElement = {
    div(s"$index: Component: $name, hidden: $hidden , num: $num")
  }
}
