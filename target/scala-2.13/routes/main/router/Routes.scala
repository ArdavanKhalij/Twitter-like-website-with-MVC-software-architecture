// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:7
  HomeController_0: controllers.HomeController,
  // @LINE:10
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:7
    HomeController_0: controllers.HomeController,
    // @LINE:10
    Assets_1: controllers.Assets
  ) = this(errorHandler, HomeController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.HomeController.login"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateLogin""", """controllers.HomeController.validateLogin(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createUser""", """controllers.HomeController.createUser(username:String, password:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.HomeController.logout"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """home""", """controllers.HomeController.home"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comments""", """controllers.HomeController.comments"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateComment""", """controllers.HomeController.validateComment(postID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """like""", """controllers.HomeController.like"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """validateLike""", """controllers.HomeController.validateLike(postID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Share""", """controllers.HomeController.Share(postID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """goTosharingPage""", """controllers.HomeController.goTosharingPage"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createPost""", """controllers.HomeController.createPost(text:String, hashtag:String, img:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """removePost""", """controllers.HomeController.removePost(PostID:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """goTosharingPageComment""", """controllers.HomeController.goTosharingPageComment"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """createComment""", """controllers.HomeController.createComment(text:String, hashtag:String, username:String, id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Profile""", """controllers.HomeController.Profile(hashtagOrUsername:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """MyProfile""", """controllers.HomeController.MyProfile(username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Follow""", """controllers.HomeController.Follow(username:String, Username:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """Explore""", """controllers.HomeController.Explore"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:7
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_0.index(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Assets_versioned1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned1_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_at2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at2_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_HomeController_login3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_HomeController_login3_invoker = createInvoker(
    HomeController_0.login,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "login",
      Nil,
      "GET",
      this.prefix + """login""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_HomeController_validateLogin4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateLogin")))
  )
  private[this] lazy val controllers_HomeController_validateLogin4_invoker = createInvoker(
    HomeController_0.validateLogin(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "validateLogin",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """validateLogin""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_HomeController_createUser5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createUser")))
  )
  private[this] lazy val controllers_HomeController_createUser5_invoker = createInvoker(
    HomeController_0.createUser(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createUser",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """createUser""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_HomeController_logout6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_HomeController_logout6_invoker = createInvoker(
    HomeController_0.logout,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "logout",
      Nil,
      "GET",
      this.prefix + """logout""",
      """""",
      Seq()
    )
  )

  // @LINE:17
  private[this] lazy val controllers_HomeController_home7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("home")))
  )
  private[this] lazy val controllers_HomeController_home7_invoker = createInvoker(
    HomeController_0.home,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "home",
      Nil,
      "GET",
      this.prefix + """home""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_HomeController_comments8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comments")))
  )
  private[this] lazy val controllers_HomeController_comments8_invoker = createInvoker(
    HomeController_0.comments,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "comments",
      Nil,
      "GET",
      this.prefix + """comments""",
      """""",
      Seq()
    )
  )

  // @LINE:19
  private[this] lazy val controllers_HomeController_validateComment9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateComment")))
  )
  private[this] lazy val controllers_HomeController_validateComment9_invoker = createInvoker(
    HomeController_0.validateComment(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "validateComment",
      Seq(classOf[String]),
      "GET",
      this.prefix + """validateComment""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_like10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("like")))
  )
  private[this] lazy val controllers_HomeController_like10_invoker = createInvoker(
    HomeController_0.like,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "like",
      Nil,
      "GET",
      this.prefix + """like""",
      """""",
      Seq()
    )
  )

  // @LINE:22
  private[this] lazy val controllers_HomeController_validateLike11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("validateLike")))
  )
  private[this] lazy val controllers_HomeController_validateLike11_invoker = createInvoker(
    HomeController_0.validateLike(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "validateLike",
      Seq(classOf[String]),
      "GET",
      this.prefix + """validateLike""",
      """""",
      Seq()
    )
  )

  // @LINE:24
  private[this] lazy val controllers_HomeController_Share12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Share")))
  )
  private[this] lazy val controllers_HomeController_Share12_invoker = createInvoker(
    HomeController_0.Share(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Share",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Share""",
      """""",
      Seq()
    )
  )

  // @LINE:26
  private[this] lazy val controllers_HomeController_goTosharingPage13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("goTosharingPage")))
  )
  private[this] lazy val controllers_HomeController_goTosharingPage13_invoker = createInvoker(
    HomeController_0.goTosharingPage,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "goTosharingPage",
      Nil,
      "GET",
      this.prefix + """goTosharingPage""",
      """""",
      Seq()
    )
  )

  // @LINE:27
  private[this] lazy val controllers_HomeController_createPost14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createPost")))
  )
  private[this] lazy val controllers_HomeController_createPost14_invoker = createInvoker(
    HomeController_0.createPost(fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createPost",
      Seq(classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """createPost""",
      """""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_HomeController_removePost15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("removePost")))
  )
  private[this] lazy val controllers_HomeController_removePost15_invoker = createInvoker(
    HomeController_0.removePost(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "removePost",
      Seq(classOf[String]),
      "GET",
      this.prefix + """removePost""",
      """""",
      Seq()
    )
  )

  // @LINE:30
  private[this] lazy val controllers_HomeController_goTosharingPageComment16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("goTosharingPageComment")))
  )
  private[this] lazy val controllers_HomeController_goTosharingPageComment16_invoker = createInvoker(
    HomeController_0.goTosharingPageComment,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "goTosharingPageComment",
      Nil,
      "GET",
      this.prefix + """goTosharingPageComment""",
      """""",
      Seq()
    )
  )

  // @LINE:31
  private[this] lazy val controllers_HomeController_createComment17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("createComment")))
  )
  private[this] lazy val controllers_HomeController_createComment17_invoker = createInvoker(
    HomeController_0.createComment(fakeValue[String], fakeValue[String], fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "createComment",
      Seq(classOf[String], classOf[String], classOf[String], classOf[String]),
      "GET",
      this.prefix + """createComment""",
      """""",
      Seq()
    )
  )

  // @LINE:33
  private[this] lazy val controllers_HomeController_Profile18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Profile")))
  )
  private[this] lazy val controllers_HomeController_Profile18_invoker = createInvoker(
    HomeController_0.Profile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Profile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """Profile""",
      """""",
      Seq()
    )
  )

  // @LINE:34
  private[this] lazy val controllers_HomeController_MyProfile19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("MyProfile")))
  )
  private[this] lazy val controllers_HomeController_MyProfile19_invoker = createInvoker(
    HomeController_0.MyProfile(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "MyProfile",
      Seq(classOf[String]),
      "GET",
      this.prefix + """MyProfile""",
      """""",
      Seq()
    )
  )

  // @LINE:35
  private[this] lazy val controllers_HomeController_Follow20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Follow")))
  )
  private[this] lazy val controllers_HomeController_Follow20_invoker = createInvoker(
    HomeController_0.Follow(fakeValue[String], fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Follow",
      Seq(classOf[String], classOf[String]),
      "GET",
      this.prefix + """Follow""",
      """""",
      Seq()
    )
  )

  // @LINE:37
  private[this] lazy val controllers_HomeController_Explore21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("Explore")))
  )
  private[this] lazy val controllers_HomeController_Explore21_invoker = createInvoker(
    HomeController_0.Explore,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "Explore",
      Nil,
      "GET",
      this.prefix + """Explore""",
      """""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:7
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_0.index())
      }
  
    // @LINE:10
    case controllers_Assets_versioned1_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned1_invoker.call(Assets_1.versioned(path, file))
      }
  
    // @LINE:11
    case controllers_Assets_at2_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at2_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:12
    case controllers_HomeController_login3_route(params@_) =>
      call { 
        controllers_HomeController_login3_invoker.call(HomeController_0.login)
      }
  
    // @LINE:13
    case controllers_HomeController_validateLogin4_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_HomeController_validateLogin4_invoker.call(HomeController_0.validateLogin(username, password))
      }
  
    // @LINE:14
    case controllers_HomeController_createUser5_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("password", None)) { (username, password) =>
        controllers_HomeController_createUser5_invoker.call(HomeController_0.createUser(username, password))
      }
  
    // @LINE:15
    case controllers_HomeController_logout6_route(params@_) =>
      call { 
        controllers_HomeController_logout6_invoker.call(HomeController_0.logout)
      }
  
    // @LINE:17
    case controllers_HomeController_home7_route(params@_) =>
      call { 
        controllers_HomeController_home7_invoker.call(HomeController_0.home)
      }
  
    // @LINE:18
    case controllers_HomeController_comments8_route(params@_) =>
      call { 
        controllers_HomeController_comments8_invoker.call(HomeController_0.comments)
      }
  
    // @LINE:19
    case controllers_HomeController_validateComment9_route(params@_) =>
      call(params.fromQuery[String]("postID", None)) { (postID) =>
        controllers_HomeController_validateComment9_invoker.call(HomeController_0.validateComment(postID))
      }
  
    // @LINE:21
    case controllers_HomeController_like10_route(params@_) =>
      call { 
        controllers_HomeController_like10_invoker.call(HomeController_0.like)
      }
  
    // @LINE:22
    case controllers_HomeController_validateLike11_route(params@_) =>
      call(params.fromQuery[String]("postID", None)) { (postID) =>
        controllers_HomeController_validateLike11_invoker.call(HomeController_0.validateLike(postID))
      }
  
    // @LINE:24
    case controllers_HomeController_Share12_route(params@_) =>
      call(params.fromQuery[String]("postID", None)) { (postID) =>
        controllers_HomeController_Share12_invoker.call(HomeController_0.Share(postID))
      }
  
    // @LINE:26
    case controllers_HomeController_goTosharingPage13_route(params@_) =>
      call { 
        controllers_HomeController_goTosharingPage13_invoker.call(HomeController_0.goTosharingPage)
      }
  
    // @LINE:27
    case controllers_HomeController_createPost14_route(params@_) =>
      call(params.fromQuery[String]("text", None), params.fromQuery[String]("hashtag", None), params.fromQuery[String]("img", None)) { (text, hashtag, img) =>
        controllers_HomeController_createPost14_invoker.call(HomeController_0.createPost(text, hashtag, img))
      }
  
    // @LINE:28
    case controllers_HomeController_removePost15_route(params@_) =>
      call(params.fromQuery[String]("PostID", None)) { (PostID) =>
        controllers_HomeController_removePost15_invoker.call(HomeController_0.removePost(PostID))
      }
  
    // @LINE:30
    case controllers_HomeController_goTosharingPageComment16_route(params@_) =>
      call { 
        controllers_HomeController_goTosharingPageComment16_invoker.call(HomeController_0.goTosharingPageComment)
      }
  
    // @LINE:31
    case controllers_HomeController_createComment17_route(params@_) =>
      call(params.fromQuery[String]("text", None), params.fromQuery[String]("hashtag", None), params.fromQuery[String]("username", None), params.fromQuery[String]("id", None)) { (text, hashtag, username, id) =>
        controllers_HomeController_createComment17_invoker.call(HomeController_0.createComment(text, hashtag, username, id))
      }
  
    // @LINE:33
    case controllers_HomeController_Profile18_route(params@_) =>
      call(params.fromQuery[String]("hashtagOrUsername", None)) { (hashtagOrUsername) =>
        controllers_HomeController_Profile18_invoker.call(HomeController_0.Profile(hashtagOrUsername))
      }
  
    // @LINE:34
    case controllers_HomeController_MyProfile19_route(params@_) =>
      call(params.fromQuery[String]("username", None)) { (username) =>
        controllers_HomeController_MyProfile19_invoker.call(HomeController_0.MyProfile(username))
      }
  
    // @LINE:35
    case controllers_HomeController_Follow20_route(params@_) =>
      call(params.fromQuery[String]("username", None), params.fromQuery[String]("Username", None)) { (username, Username) =>
        controllers_HomeController_Follow20_invoker.call(HomeController_0.Follow(username, Username))
      }
  
    // @LINE:37
    case controllers_HomeController_Explore21_route(params@_) =>
      call { 
        controllers_HomeController_Explore21_invoker.call(HomeController_0.Explore)
      }
  }
}
