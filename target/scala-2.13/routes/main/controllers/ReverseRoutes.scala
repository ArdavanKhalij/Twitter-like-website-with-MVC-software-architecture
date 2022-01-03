// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.mvc.Call


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def createPost(text:String, hashtag:String, img:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createPost" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("hashtag", hashtag)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("img", img)))))
    }
  
    // @LINE:33
    def Profile(hashtagOrUsername:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Profile" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("hashtagOrUsername", hashtagOrUsername)))))
    }
  
    // @LINE:30
    def goTosharingPageComment: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "goTosharingPageComment")
    }
  
    // @LINE:24
    def Share(postID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Share" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("postID", postID)))))
    }
  
    // @LINE:14
    def createUser(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createUser" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:21
    def like: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "like")
    }
  
    // @LINE:13
    def validateLogin(username:String, password:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validateLogin" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("password", password)))))
    }
  
    // @LINE:34
    def MyProfile(username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "MyProfile" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)))))
    }
  
    // @LINE:28
    def removePost(PostID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "removePost" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("PostID", PostID)))))
    }
  
    // @LINE:15
    def logout: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "logout")
    }
  
    // @LINE:19
    def validateComment(postID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validateComment" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("postID", postID)))))
    }
  
    // @LINE:26
    def goTosharingPage: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "goTosharingPage")
    }
  
    // @LINE:37
    def Explore: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Explore")
    }
  
    // @LINE:35
    def Follow(username:String, Username:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "Follow" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("Username", Username)))))
    }
  
    // @LINE:17
    def home: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "home")
    }
  
    // @LINE:31
    def createComment(text:String, hashtag:String, username:String, id:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "createComment" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("text", text)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("hashtag", hashtag)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("username", username)), Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("id", id)))))
    }
  
    // @LINE:7
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:18
    def comments: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comments")
    }
  
    // @LINE:22
    def validateLike(postID:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "validateLike" + play.core.routing.queryString(List(Some(implicitly[play.api.mvc.QueryStringBindable[String]].unbind("postID", postID)))))
    }
  
    // @LINE:12
    def login: Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
    // @LINE:11
    def at(file:String): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[String]].unbind("file", file))
    }
  
  }


}
