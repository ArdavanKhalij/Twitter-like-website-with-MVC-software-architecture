
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object MyProfile extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template5[List[post],List[String],List[user],Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findAllSortedByDate: List[post], searchbar: List[String], users: List[user])(implicit flash : Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("My profile")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<div class="header">
    <a href="#default" class="logo">My Profile</a>
    <div class="header-right">
        <a href="home">Home</a>
        <a href="Explore">Explore</a>
        <a href="goTosharingPage">Share a thought</a>
        <a href=""""),_display_(/*10.19*/routes/*10.25*/.HomeController.MyProfile(request.session.get("username").toList(0))),format.raw/*10.93*/("""">Profile</a>
        <a href=logout>Logout</a>
    </div>
</div>
<body>
<div class="dropdown">
    <button onclick="myFunction()" class="dropbtn">Users for following</button>
    <div id="myDropdown" class="dropdown-content">
        <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
        """),_display_(/*19.10*/for(user <- users) yield /*19.28*/{_display_(Seq[Any](format.raw/*19.29*/("""
        """),format.raw/*20.9*/("""<a href=""""),_display_(/*20.19*/routes/*20.25*/.HomeController.Follow(user.username, request.session.get("username").toList(0))),format.raw/*20.105*/("""">Follow """),_display_(/*20.115*/user/*20.119*/.username),format.raw/*20.128*/("""</a>
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</div>
</div>
<div class="row">
    <div class="leftcolumn">
        """),_display_(/*26.10*/for(post <- findAllSortedByDate) yield /*26.42*/{_display_(Seq[Any](format.raw/*26.43*/("""
        """),format.raw/*27.9*/("""<div class="card">
            <a href=""""),_display_(/*28.23*/routes/*28.29*/.HomeController.Profile(post.username)),format.raw/*28.67*/(""""><h2>"""),_display_(/*28.74*/post/*28.78*/.username),format.raw/*28.87*/("""</h2></a>
            <h5>"""),_display_(/*29.18*/post/*29.22*/.date),format.raw/*29.27*/("""</h5>
            """),_display_(/*30.14*/if(post.img != "NO IMAGE")/*30.40*/{_display_(Seq[Any](format.raw/*30.41*/("""
            """),format.raw/*31.13*/("""<div class="fakeimg"><img src=""""),_display_(/*31.45*/routes/*31.51*/.Assets.versioned("images/"+post.img)),format.raw/*31.88*/("""" style="height:200px;"></div>
            """)))}),format.raw/*32.14*/("""
            """),format.raw/*33.13*/("""<p>"""),_display_(/*33.17*/post/*33.21*/.text),format.raw/*33.26*/("""</p>
            <h5>"""),_display_(/*34.18*/post/*34.22*/.hashtag),format.raw/*34.30*/("""</h5>
            """),_display_(/*35.14*/if(request.session.get("username").toList(0) == post.username)/*35.76*/{_display_(Seq[Any](format.raw/*35.77*/("""
            """),format.raw/*36.13*/("""<a href = """"),_display_(/*36.25*/routes/*36.31*/.HomeController.removePost(post.id.toString)),format.raw/*36.75*/(""""><h5>remove</h5></a>
            """)))}),format.raw/*37.14*/("""
        """),format.raw/*38.9*/("""</div>
        """)))}),format.raw/*39.10*/("""
    """),format.raw/*40.5*/("""</div>
</div>
</body>
""")))}))
      }
    }
  }

  def render(findAllSortedByDate:List[post],searchbar:List[String],users:List[user],flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(findAllSortedByDate,searchbar,users)(flash,request)

  def f:((List[post],List[String],List[user]) => (Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (findAllSortedByDate,searchbar,users) => (flash,request) => apply(findAllSortedByDate,searchbar,users)(flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/MyProfile.scala.html
                  HASH: 83b51c6ecc40c331110fb7205048e95486135486
                  MATRIX: 781->1|1000->127|1027->129|1053->147|1092->149|1119->150|1391->395|1406->401|1495->469|1849->796|1883->814|1922->815|1958->824|1995->834|2010->840|2112->920|2150->930|2164->934|2195->943|2240->957|2272->962|2369->1032|2417->1064|2456->1065|2492->1074|2560->1115|2575->1121|2634->1159|2668->1166|2681->1170|2711->1179|2765->1206|2778->1210|2804->1215|2850->1234|2885->1260|2924->1261|2965->1274|3024->1306|3039->1312|3097->1349|3172->1393|3213->1406|3244->1410|3257->1414|3283->1419|3332->1441|3345->1445|3374->1453|3420->1472|3491->1534|3530->1535|3571->1548|3610->1560|3625->1566|3690->1610|3756->1645|3792->1654|3839->1670|3871->1675
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|43->19|43->19|43->19|44->20|44->20|44->20|44->20|44->20|44->20|44->20|45->21|46->22|50->26|50->26|50->26|51->27|52->28|52->28|52->28|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|55->31|56->32|57->33|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|60->36|60->36|60->36|60->36|61->37|62->38|63->39|64->40
                  -- GENERATED --
              */
          