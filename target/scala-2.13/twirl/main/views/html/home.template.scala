
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

object home extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[post],List[String],Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(findAllSortedByDate: List[post], searchbar: List[String])(implicit flash : Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("home")/*3.14*/ {_display_(Seq[Any](format.raw/*3.16*/("""
"""),format.raw/*4.1*/("""<div class="header">
  <a href="#default" class="logo">Home Page</a>
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
""")))}),format.raw/*59.2*/("""

"""))
      }
    }
  }

  def render(findAllSortedByDate:List[post],searchbar:List[String],flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(findAllSortedByDate,searchbar)(flash,request)

  def f:((List[post],List[String]) => (Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (findAllSortedByDate,searchbar) => (flash,request) => apply(findAllSortedByDate,searchbar)(flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/home.scala.html
                  HASH: bd43756ec60b5131228cbed8b5ace0ddcd837164
                  MATRIX: 765->1|965->108|992->110|1012->122|1051->124|1078->125|1329->349|1344->355|1433->423|1771->735|1807->755|1846->756|1880->763|1917->773|1932->779|1980->806|2010->809|2033->811|2075->823|2107->828|2410->1105|2458->1137|2497->1138|2529->1143|2591->1178|2606->1184|2665->1222|2699->1229|2712->1233|2742->1242|2790->1263|2803->1267|2829->1272|2868->1285|2903->1311|2942->1312|2976->1319|3035->1351|3050->1357|3108->1394|3176->1432|3210->1439|3241->1443|3254->1447|3280->1452|3323->1468|3336->1472|3365->1480|3404->1493|3475->1555|3514->1556|3548->1563|3587->1575|3602->1581|3667->1625|3726->1654|3760->1661|3905->1779|3920->1785|3988->1831|4076->1891|4090->1895|4118->1901|4214->1970|4229->1976|4300->2025|4392->2089|4406->2093|4444->2109|4540->2178|4555->2184|4615->2223|4698->2278|4712->2282|4740->2288|4832->2350|4862->2353|4915->2376
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|34->10|34->10|34->10|44->20|44->20|44->20|45->21|45->21|45->21|45->21|45->21|45->21|46->22|47->23|59->35|59->35|59->35|60->36|61->37|61->37|61->37|61->37|61->37|61->37|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|64->40|65->41|66->42|66->42|66->42|66->42|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|69->45|70->46|71->47|73->49|73->49|73->49|73->49|73->49|73->49|74->50|74->50|74->50|74->50|74->50|74->50|75->51|75->51|75->51|75->51|75->51|75->51|79->55|80->56|83->59
                  -- GENERATED --
              */
          