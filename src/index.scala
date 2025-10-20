package myapp

import org.scalajs.dom

import com.raquo.laminar.api.L.*

@main
def main(): Unit = {
  val container = dom.document.getElementById("app")
  render(
    container,
    App()()
  )
}
