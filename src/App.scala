package myapp

import com.raquo.laminar.api.L.*

class App() {
  def apply(): HtmlElement = {
    div(
      Component(name = "A")()
    )
  }
}
