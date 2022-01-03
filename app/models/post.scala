package models

import akka.http.scaladsl.model.DateTime
import models.user.users

import scala.collection.mutable.ListBuffer
import scala.concurrent.duration.DurationInt

case class post(id: Int, username: String, date: DateTime, text: String, var comments: ListBuffer[Int], var likes: Int,
                var share: Int, hashtag: String, commentOrNot: Int, img: String)

object post {
  val datenow = DateTime.now
  var posts = Set(
    post(1, "Ardavan_Khalij", datenow.-(100229000), "Listen to my new music everyone :)", ListBuffer(2,3), 10, 0, "#Music", 0, "IMG_1794.png"),
    post(2, "Shrek", datenow.-(2423422052L), "Nice", ListBuffer(), 0, 0, "#Comment", 1, "NO IMAGE"),
    post(3, "Peter Griffin", datenow.-(425254292), "Ha Ha Ha", ListBuffer(), 0, 0, "#Comment", 1, "NO IMAGE"),
    post(4, "Ardavan_Khalij", datenow.-(76254233), "Thanks for your support", ListBuffer(), 0, 0, "#Thank", 0, "NO IMAGE"),
    post(5, "Severus_Snap", datenow.-(99225338), "Damn Gryffindor", ListBuffer(6), 2, 0, "#Magic", 0, "NO IMAGE"),
    post(6, "Harry_Potter", datenow.-(99225438), "Damn Gryffindor", ListBuffer(), 0, 0, "#Comment", 1, "NO IMAGE"))

  def findAllSortedByDate = posts.toList.sortBy(_.date)(Ordering[DateTime].reverse)
  def findAllSortedByLikes = posts.toList.sortBy(_.likes)(Ordering[Int].reverse)
  def findNotComments = posts.toList.filterNot(_.commentOrNot == 1).sortBy(_.date)(Ordering[DateTime].reverse)
  def findNotComments2 = posts.toList.filterNot(_.commentOrNot == 1).sortBy(_.likes)(Ordering[Int].reverse)
  def findComments = posts.toList.filterNot(_.commentOrNot == 0).sortBy(_.date)(Ordering[DateTime].reverse)
  def findComments2 = posts.toList.filterNot(_.commentOrNot == 0).sortBy(_.likes)(Ordering[Int].reverse)

  def createPost(newPost: post) = {
    posts = posts + newPost
  }
  def removePost(Post: post) ={
    posts = posts - Post
  }
}