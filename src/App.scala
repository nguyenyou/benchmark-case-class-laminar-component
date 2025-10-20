package myapp

import com.raquo.laminar.api.L.*

class App() {
  def apply(): HtmlElement = {
    div(
      Component(index = 1, name = "A", hidden = true, num = 1.1)()
    )
  }
}
