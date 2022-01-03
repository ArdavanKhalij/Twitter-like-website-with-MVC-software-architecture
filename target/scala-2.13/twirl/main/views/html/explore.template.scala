
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

object explore extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[post],List[String],Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findAllSortedByDate: List[post], searchbar: List[String])(implicit flash : Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("Explore")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
"""),format.raw/*4.1*/("""<div class="header">
  <a href="#default" class="logo">Explore</a>
  <div class="header-right">
    <a href="home">Home</a>
    <a href="Explore">Explore</a>
    <a href="goTosharingPage">Share a thought</a>
    <a href=""""),_display_(/*10.15*/routes/*10.21*/.HomeController.MyProfile(request.session.get("username").toList(0))),format.raw/*10.89*/("""">Profile</a>
    <a href=logout>Logout</a>
  </div>
</div>
<body>
<div>
  <div class="dropdown">
    <button onclick="myFunction()" class="dropbtn">Search</button>
    <div id="myDropdown" class="dropdown-content">
      <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
      """),_display_(/*20.8*/for(si <- searchbar) yield /*20.28*/{_display_(Seq[Any](format.raw/*20.29*/("""
      """),format.raw/*21.7*/("""<a href=""""),_display_(/*21.17*/routes/*21.23*/.HomeController.Profile(si)),format.raw/*21.50*/("""">"""),_display_(/*21.53*/si),format.raw/*21.55*/("""</a>
      """)))}),format.raw/*22.8*/("""
    """),format.raw/*23.5*/("""</div>
  </div>
  <div class="custom-select" style="width:200px;">
    <select>
      <option value="0">Dates</option>
      <option value="1">Dates</option>
      <option value="2">Likes</option>
    </select>
  </div>
</div>
<div class="row">
  <div class="leftcolumn">
    """),_display_(/*35.6*/for(post <- findAllSortedByDate) yield /*35.38*/{_display_(Seq[Any](format.raw/*35.39*/("""
    """),format.raw/*36.5*/("""<div class="card">
      <a href=""""),_display_(/*37.17*/routes/*37.23*/.HomeController.Profile(post.username)),format.raw/*37.61*/(""""><h2>"""),_display_(/*37.68*/post/*37.72*/.username),format.raw/*37.81*/("""</h2></a>
      <h5>"""),_display_(/*38.12*/post/*38.16*/.date),format.raw/*38.21*/("""</h5>
      """),_display_(/*39.8*/if(post.img != "NO IMAGE")/*39.34*/{_display_(Seq[Any](format.raw/*39.35*/("""
      """),format.raw/*40.7*/("""<div class="fakeimg"><img src=""""),_display_(/*40.39*/routes/*40.45*/.Assets.versioned("images/"+post.img)),format.raw/*40.82*/("""" style="height:200px;"></div>
      """)))}),format.raw/*41.8*/("""
      """),format.raw/*42.7*/("""<p>"""),_display_(/*42.11*/post/*42.15*/.text),format.raw/*42.20*/("""</p>
      <h5>"""),_display_(/*43.12*/post/*43.16*/.hashtag),format.raw/*43.24*/("""</h5>
      """),_display_(/*44.8*/if(request.session.get("username").toList(0) == post.username)/*44.70*/{_display_(Seq[Any](format.raw/*44.71*/("""
      """),format.raw/*45.7*/("""<a href = """"),_display_(/*45.19*/routes/*45.25*/.HomeController.removePost(post.id.toString)),format.raw/*45.69*/(""""><h5>remove</h5></a>
      """)))}),format.raw/*46.8*/("""
      """),format.raw/*47.7*/("""<div class="bg-white">
        <div class="d-flex flex-row fs-12">
          <div class="like p-2 cursor"><a href = """"),_display_(/*49.52*/routes/*49.58*/.HomeController.validateLike(post.id.toString)),format.raw/*49.104*/(""""><i class="fa fa-thumbs-o-up"></i><span class="ml-1">Like """),_display_(/*49.164*/post/*49.168*/.likes),format.raw/*49.174*/("""</span></a></div>
          <div class="like p-2 cursor"><a href = """"),_display_(/*50.52*/routes/*50.58*/.HomeController.validateComment(post.id.toString)),format.raw/*50.107*/(""""><i class="fa fa-commenting-o"></i><span class="ml-1">Comment """),_display_(/*50.171*/post/*50.175*/.comments.length),format.raw/*50.191*/("""</span></a></div>
          <div class="like p-2 cursor"><a href = """"),_display_(/*51.52*/routes/*51.58*/.HomeController.Share(post.id.toString)),format.raw/*51.97*/(""""><i class="fa fa-share"></i><span class="ml-1">Share """),_display_(/*51.152*/post/*51.156*/.share),format.raw/*51.162*/("""</span></a></div>
        </div>
      </div>
    </div>
    """)))}),format.raw/*55.6*/("""
  """),format.raw/*56.3*/("""</div>
</div>
</body>
""")))}))
      }
    }
  }

  def render(findAllSortedByDate:List[post],searchbar:List[String],flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(findAllSortedByDate,searchbar)(flash,request)

  def f:((List[post],List[String]) => (Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (findAllSortedByDate,searchbar) => (flash,request) => apply(findAllSortedByDate,searchbar)(flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/explore.scala.html
                  HASH: af9b47417abeff84f0a939f36871ecf83ac7d094
                  MATRIX: 768->1|968->108|995->110|1018->125|1057->127|1084->128|1333->350|1348->356|1437->424|1775->736|1811->756|1850->757|1884->764|1921->774|1936->780|1984->807|2014->810|2037->812|2079->824|2111->829|2414->1106|2462->1138|2501->1139|2533->1144|2595->1179|2610->1185|2669->1223|2703->1230|2716->1234|2746->1243|2794->1264|2807->1268|2833->1273|2872->1286|2907->1312|2946->1313|2980->1320|3039->1352|3054->1358|3112->1395|3180->1433|3214->1440|3245->1444|3258->1448|3284->1453|3327->1469|3340->1473|3369->1481|3408->1494|3479->1556|3518->1557|3552->1564|3591->1576|3606->1582|3671->1626|3730->1655|3764->1662|3909->1780|3924->1786|3992->1832|4080->1892|4094->1896|4122->1902|4218->1971|4233->1977|4304->2026|4396->2090|4410->2094|4448->2110|4544->2179|4559->2185|4619->2224|4702->2279|4716->2283|4744->2289|4836->2351|4866->2354
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|59->35|59->35|59->35|60->36|61->37|61->37|61->37|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|64->40|65->41|66->42|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|69->45|70->46|71->47|73->49|73->49|73->49|73->49|73->49|73->49|74->50|74->50|74->50|74->50|74->50|74->50|75->51|75->51|75->51|75->51|75->51|75->51|79->55|80->56
                  -- GENERATED --
              */
          