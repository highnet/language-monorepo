def main(args: Array[String]): Unit = {
  handleCustomer(2)
}

case class Customer(id: Int, firstName: String)

val customers =
  List(Customer(1, "John"), Customer(2, "Jane"), Customer(3, "Doe"))

def handleCustomer(uid: Int): Unit = {
  customers.find(_.id == uid) match {
    case Some(customer) => println(s"Customer found: ${customer.firstName}")
    case None           => println("Customer not found")
  }
}
