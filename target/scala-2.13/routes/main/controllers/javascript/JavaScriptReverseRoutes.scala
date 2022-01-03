// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset

// @LINE:7
package controllers.javascript {

  // @LINE:7
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:27
    def createPost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createPost",
      """
        function(text0,hashtag1,img2) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createPost" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("text", text0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("hashtag", hashtag1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("img", img2)])})
        }
      """
    )
  
    // @LINE:33
    def Profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Profile",
      """
        function(hashtagOrUsername0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Profile" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("hashtagOrUsername", hashtagOrUsername0)])})
        }
      """
    )
  
    // @LINE:30
    def goTosharingPageComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.goTosharingPageComment",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "goTosharingPageComment"})
        }
      """
    )
  
    // @LINE:24
    def Share: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Share",
      """
        function(postID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Share" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("postID", postID0)])})
        }
      """
    )
  
    // @LINE:14
    def createUser: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createUser",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createUser" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:21
    def like: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.like",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "like"})
        }
      """
    )
  
    // @LINE:13
    def validateLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.validateLogin",
      """
        function(username0,password1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLogin" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("password", password1)])})
        }
      """
    )
  
    // @LINE:34
    def MyProfile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.MyProfile",
      """
        function(username0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "MyProfile" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0)])})
        }
      """
    )
  
    // @LINE:28
    def removePost: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.removePost",
      """
        function(PostID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "removePost" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("PostID", PostID0)])})
        }
      """
    )
  
    // @LINE:15
    def logout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.logout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:19
    def validateComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.validateComment",
      """
        function(postID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateComment" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("postID", postID0)])})
        }
      """
    )
  
    // @LINE:26
    def goTosharingPage: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.goTosharingPage",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "goTosharingPage"})
        }
      """
    )
  
    // @LINE:37
    def Explore: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Explore",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Explore"})
        }
      """
    )
  
    // @LINE:35
    def Follow: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.Follow",
      """
        function(username0,Username1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "Follow" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("Username", Username1)])})
        }
      """
    )
  
    // @LINE:17
    def home: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.home",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "home"})
        }
      """
    )
  
    // @LINE:31
    def createComment: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.createComment",
      """
        function(text0,hashtag1,username2,id3) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "createComment" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("text", text0), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("hashtag", hashtag1), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("username", username2), (""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("id", id3)])})
        }
      """
    )
  
    // @LINE:7
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:18
    def comments: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.comments",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comments"})
        }
      """
    )
  
    // @LINE:22
    def validateLike: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.validateLike",
      """
        function(postID0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "validateLike" + _qS([(""" + implicitly[play.api.mvc.QueryStringBindable[String]].javascriptUnbind + """)("postID", postID0)])})
        }
      """
    )
  
    // @LINE:12
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.login",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
    // @LINE:11
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
