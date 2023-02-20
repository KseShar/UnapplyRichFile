object Main {
  def main(args: Array[String]): Unit = {
    println("Hello world!")

    val RichFile(path, name, ext) = "/home/ncay/readme.txt"
    println(path)
    println(name)
    println(ext)
  }
}

object RichFile{
  def unapply (input: String) ={
    if (input.isEmpty) None else
    Some(input.substring(0, input.lastIndexOf("/")),
      input.substring(input.lastIndexOf("/") + 1, input.indexOf(".")),
      input.substring(input.indexOf(".") + 1)
    )
  }
}