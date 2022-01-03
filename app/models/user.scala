package models

import scala.collection.mutable.ListBuffer
import collection.mutable

case class user(username: String, password: String, friends: ListBuffer[String])

object user {

//  private val users = mutable.Set [String, String, ListBuffer[String], ListBuffer[Int]]()

  var users = mutable.Set(
    user("Ardavan_Khalij", "1234", ListBuffer()),
    user("Ted_Mosby", "1234", ListBuffer()),
    user("Harry_Potter", "1234", ListBuffer()),
    user("Ross_Geller", "1234", ListBuffer()),
    user("Peter_Griffin", "1234", ListBuffer()),
    user("Shrek", "1234", ListBuffer()),
    user("Severus_Snap", "1234", ListBuffer())
  )

  def findallUsers  = users.toList

  def createUser(User: user) = {
    users = users + User
  }

  def removeUser(User: user) = {
    users = users - User
  }
}
