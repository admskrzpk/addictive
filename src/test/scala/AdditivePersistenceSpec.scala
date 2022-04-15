import org.scalatest.funsuite.AnyFunSuite

class AdditivePersistenceSpec extends AnyFunSuite{


  import AdditivePersistence.additivePersistence

  test("For n = 13 result should be 1") {
    assert(additivePersistence(13) == 1)
  }
  test("For n = 1234 result should be 2") {
    assert(additivePersistence(1234) == 2)
  }
  test("For n = 9876 result should be 2 ") {
    assert(additivePersistence(9876) == 2)
  }
  test("For n = 199 result should be 3") {
    assert(additivePersistence(199) == 3)
  }

  test("For n <= 10 result should be 0") {
    assert(additivePersistence(8) == 0)
  }
}
