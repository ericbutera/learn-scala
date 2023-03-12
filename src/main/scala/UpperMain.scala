object UpperMain:
  def upperClassMethod(params: Array[String]): Unit =
    print("upper class method:")
    params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
    println("")

def upperFunction(params: Array[String]): Unit =
  print("upper fn:")
  params.map(s => s.toUpperCase).foreach(s => printf("%s ", s))
  println("")

@main def upperExample(params: String*): Unit =
  // val p = params.toArray ?? Array("a", "b", "c")
  val p = Array("a", "b", "c")
  UpperMain.upperClassMethod(p)
  upperFunction(p)

