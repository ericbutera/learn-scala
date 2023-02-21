def printArgs(args: List[String]): Unit =
  var i = 0
  while i < args.length do
    println(args(i))
    i += 1

def printArgsRevision(args: List[String]): Unit =
  for arg <- args do println(arg)

def printArgsRevision2(args: List[String]): Unit =
  args.foreach(println)

def formatArgs(args: List[String]) = args.mkString("\n")
// println(formatArgs(args))
//
// val res = formatArgs(List("zero", "one", "two"))
// assert(res == "zero\none\ntwo")
