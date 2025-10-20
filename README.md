# Benchmark Case Class

## class Component

```js
/** @constructor */
function $c_Lmyapp_Component() {
}
$c_Lmyapp_Component.prototype = new $h_O();
$c_Lmyapp_Component.prototype.constructor = $c_Lmyapp_Component;
/** @constructor */
function $h_Lmyapp_Component() {
}
$h_Lmyapp_Component.prototype = $c_Lmyapp_Component.prototype;
$c_Lmyapp_Component.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveHtmlElement = (function() {
  var $x_2 = $n($n($m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L).div__Lcom_raquo_laminar_tags_HtmlTag());
  var $x_1 = $m_sr_ScalaRunTime$();
  var this$1 = $n($m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L);
  var r = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  return $x_2.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_1.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$f_Lcom_raquo_laminar_api_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$1, "Component", r)])));
});
var $d_Lmyapp_Component = new $TypeData().initClass($c_Lmyapp_Component, "myapp.Component", ({
  Lmyapp_Component: 1
}));
```

## case class Component

```js
/** @constructor */
function $c_Lmyapp_Component() {
}
$c_Lmyapp_Component.prototype = new $h_O();
$c_Lmyapp_Component.prototype.constructor = $c_Lmyapp_Component;
/** @constructor */
function $h_Lmyapp_Component() {
}
$h_Lmyapp_Component.prototype = $c_Lmyapp_Component.prototype;
$c_Lmyapp_Component.prototype.productIterator__sc_Iterator = (function() {
  return new $c_s_Product$$anon$1(this);
});
$c_Lmyapp_Component.prototype.hashCode__I = (function() {
  return 604060893;
});
$c_Lmyapp_Component.prototype.equals__O__Z = (function(x$0) {
  if ((this === x$0)) {
    return true;
  } else if ((x$0 instanceof $c_Lmyapp_Component)) {
    var x2 = $as_Lmyapp_Component(x$0);
    $n(x2);
    return true;
  } else {
    return false;
  }
});
$c_Lmyapp_Component.prototype.toString__T = (function() {
  return $m_sr_ScalaRunTime$()._toString__s_Product__T(this);
});
$c_Lmyapp_Component.prototype.productArity__I = (function() {
  return 0;
});
$c_Lmyapp_Component.prototype.productPrefix__T = (function() {
  return "Component";
});
$c_Lmyapp_Component.prototype.productElement__I__O = (function(n) {
  throw $ct_jl_IndexOutOfBoundsException__T__(new $c_jl_IndexOutOfBoundsException(), ("" + n));
});
$c_Lmyapp_Component.prototype.apply__Lcom_raquo_laminar_nodes_ReactiveHtmlElement = (function() {
  var $x_2 = $n($n($m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L).div__Lcom_raquo_laminar_tags_HtmlTag());
  var $x_1 = $m_sr_ScalaRunTime$();
  var this$1 = $n($m_Lcom_raquo_laminar_api_package$().Lcom_raquo_laminar_api_package$__f_L);
  var r = $m_Lcom_raquo_laminar_modifiers_RenderableText$().Lcom_raquo_laminar_modifiers_RenderableText$__f_stringRenderable;
  return $x_2.apply__sci_Seq__Lcom_raquo_laminar_nodes_ReactiveHtmlElement($x_1.wrapRefArray__AO__sci_ArraySeq(new ($d_Lcom_raquo_laminar_modifiers_Modifier.getArrayOf().constr)([$f_Lcom_raquo_laminar_api_Implicits__textToTextNode__O__Lcom_raquo_laminar_modifiers_RenderableText__Lcom_raquo_laminar_nodes_TextNode(this$1, "Component", r)])));
});
function $as_Lmyapp_Component(obj) {
  return (((obj instanceof $c_Lmyapp_Component) || (obj === null)) ? obj : $throwClassCastException(obj, "myapp.Component"));
}
function $isArrayOf_Lmyapp_Component(obj, depth) {
  return (!(!(((obj && obj.$classData) && (obj.$classData.arrayDepth === depth)) && obj.$classData.arrayBase.ancestors.Lmyapp_Component)));
}
function $asArrayOf_Lmyapp_Component(obj, depth) {
  return (($isArrayOf_Lmyapp_Component(obj, depth) || (obj === null)) ? obj : $throwArrayCastException(obj, "Lmyapp.Component;", depth));
}
var $d_Lmyapp_Component = new $TypeData().initClass($c_Lmyapp_Component, "myapp.Component", ({
  Lmyapp_Component: 1,
  s_Equals: 1,
  s_Product: 1,
  Ljava_io_Serializable: 1
}));
```