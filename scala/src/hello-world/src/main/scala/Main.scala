@main def main(): Unit = {  
  UserApp.main(Array.empty)
}


case class User(name: String)

def getUserFromDB(uid: Int): Option[User] = {
  // Simulating database lookup
  if (uid % 2 == 0) Some(User("Even User")) else None
}

def handleUser(uid: Int): Unit = {
  getUserFromDB(uid) match {
    case Some(user) => println(s"User found: ${user.name}")
    case None => println("User not found")
  }
}

object UserApp {
  def main(args: Array[String]): Unit = {
    println("\nTesting handleUser function:")
    handleUser(1)
    handleUser(2)
  }
}