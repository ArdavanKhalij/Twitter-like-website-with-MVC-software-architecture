
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

object tweetsOfAUserOrHashtag extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[post],List[String],Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findAllSortedByDate: List[post], searchbar: List[String])(implicit flash : Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("profile")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
"""),format.raw/*4.1*/("""<div class="header">
  <a href="#default" class="logo">User's posts</a>
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
      """),_display_(/*47.8*/if(post.commentOrNot == 0)/*47.34*/{_display_(Seq[Any](format.raw/*47.35*/("""
      """),format.raw/*48.7*/("""<div class="bg-white">
        <div class="d-flex flex-row fs-12">
          <div class="like p-2 cursor"><a href = """"),_display_(/*50.52*/routes/*50.58*/.HomeController.validateLike(post.id.toString)),format.raw/*50.104*/(""""><i class="fa fa-thumbs-o-up"></i><span class="ml-1">Like """),_display_(/*50.164*/post/*50.168*/.likes),format.raw/*50.174*/("""</span></a></div>
          <div class="like p-2 cursor"><a href = """"),_display_(/*51.52*/routes/*51.58*/.HomeController.validateComment(post.id.toString)),format.raw/*51.107*/(""""><i class="fa fa-commenting-o"></i><span class="ml-1">Comment """),_display_(/*51.171*/post/*51.175*/.comments.length),format.raw/*51.191*/("""</span></a></div>
          <div class="like p-2 cursor"><a href = """"),_display_(/*52.52*/routes/*52.58*/.HomeController.Share(post.id.toString)),format.raw/*52.97*/(""""><i class="fa fa-share"></i><span class="ml-1">Share """),_display_(/*52.152*/post/*52.156*/.share),format.raw/*52.162*/("""</span></a></div>
        </div>
      </div>
      """)))}),format.raw/*55.8*/("""
    """),format.raw/*56.5*/("""</div>
    """)))}),format.raw/*57.6*/("""
  """),format.raw/*58.3*/("""</div>
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
                  SOURCE: app/views/tweetsOfAUserOrHashtag.scala.html
                  HASH: 4335a4fed23f435eb5ac05f058f35c0a5200629e
                  MATRIX: 783->1|983->108|1010->110|1033->125|1072->127|1099->128|1353->355|1368->361|1457->429|1795->741|1831->761|1870->762|1904->769|1941->779|1956->785|2004->812|2034->815|2057->817|2099->829|2131->834|2434->1111|2482->1143|2521->1144|2553->1149|2615->1184|2630->1190|2689->1228|2723->1235|2736->1239|2766->1248|2814->1269|2827->1273|2853->1278|2892->1291|2927->1317|2966->1318|3000->1325|3059->1357|3074->1363|3132->1400|3200->1438|3234->1445|3265->1449|3278->1453|3304->1458|3347->1474|3360->1478|3389->1486|3428->1499|3499->1561|3538->1562|3572->1569|3611->1581|3626->1587|3691->1631|3750->1660|3784->1668|3819->1694|3858->1695|3892->1702|4037->1820|4052->1826|4120->1872|4208->1932|4222->1936|4250->1942|4346->2011|4361->2017|4432->2066|4524->2130|4538->2134|4576->2150|4672->2219|4687->2225|4747->2264|4830->2319|4844->2323|4872->2329|4955->2382|4987->2387|5029->2399|5059->2402
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|59->35|59->35|59->35|60->36|61->37|61->37|61->37|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|64->40|65->41|66->42|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|69->45|70->46|71->47|71->47|71->47|72->48|74->50|74->50|74->50|74->50|74->50|74->50|75->51|75->51|75->51|75->51|75->51|75->51|76->52|76->52|76->52|76->52|76->52|76->52|79->55|80->56|81->57|82->58
                  -- GENERATED --
              */
          