val res = rdd2.collect
for (r <- res) {
  val word = r._1
  val count = r._2
  println(s"$word : $count")
}
rdd2.saveAsTextFile(path = "C:\\Demos\\output")


println($word : $count)
}
rdd2.saveAsTextFile(path="C:\\data\\output1")