import scala.annotation.tailrec

object AdditivePersistence extends App {
  @tailrec
  def additivePersistence(n: Long, counter: Int = 0): Int = {
    if (n >= 10) additivePersistence(n.toString.split("").toList.map(_.toInt).sum, counter + 1)
    else counter
  }
}
