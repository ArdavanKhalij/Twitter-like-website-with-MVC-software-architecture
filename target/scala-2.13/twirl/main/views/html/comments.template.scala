
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

object comments extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[List[post],List[String],Flash,RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(comments: List[post], searchbar: List[String])(implicit flash : Flash, request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),format.raw/*3.1*/("""<!--(searchbar: ListBuffer[String])-->
"""),_display_(/*4.2*/main("comments")/*4.18*/ {_display_(Seq[Any](format.raw/*4.20*/("""
"""),format.raw/*5.1*/("""<div class="header">
  <a href="#default" class="logo">Comments</a>
  <div class="header-right">
    <a href="home">Home</a>
    <a href="Explore">Explore</a>
    <a href="goTosharingPage">Share a thought</a>
    <a href=""""),_display_(/*11.15*/routes/*11.21*/.HomeController.MyProfile(request.session.get("username").toList(0))),format.raw/*11.89*/("""">Profile</a>
    <a href=logout>Logout</a>
  </div>
</div>
<body>
<div>
  <div class="dropdown">
    <button onclick="myFunction()" class="dropbtn">Search</button>
    <div id="myDropdown" class="dropdown-content">
      <input type="text" placeholder="Search.." id="myInput" onkeyup="filterFunction()">
      """),_display_(/*21.8*/for(si <- searchbar) yield /*21.28*/{_display_(Seq[Any](format.raw/*21.29*/("""
      """),format.raw/*22.7*/("""<a href=""""),_display_(/*22.17*/routes/*22.23*/.HomeController.Profile(si)),format.raw/*22.50*/("""">"""),_display_(/*22.53*/si),format.raw/*22.55*/("""</a>
      """)))}),format.raw/*23.8*/("""
    """),format.raw/*24.5*/("""</div>
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
    """),_display_(/*36.6*/for(post <- comments) yield /*36.27*/{_display_(Seq[Any](format.raw/*36.28*/("""
    """),format.raw/*37.5*/("""<div class="card">
      <a href=""""),_display_(/*38.17*/routes/*38.23*/.HomeController.Profile(post.username)),format.raw/*38.61*/(""""><h2>"""),_display_(/*38.68*/post/*38.72*/.username),format.raw/*38.81*/("""</h2></a>
      <h5>"""),_display_(/*39.12*/post/*39.16*/.date),format.raw/*39.21*/("""</h5>
      """),_display_(/*40.8*/if(post.img != "NO IMAGE")/*40.34*/{_display_(Seq[Any](format.raw/*40.35*/("""
      """),format.raw/*41.7*/("""<div class="fakeimg"><img src=""""),_display_(/*41.39*/routes/*41.45*/.Assets.versioned("images/"+post.img)),format.raw/*41.82*/("""" style="height:200px;"></div>
      """)))}),format.raw/*42.8*/("""
      """),format.raw/*43.7*/("""<p>"""),_display_(/*43.11*/post/*43.15*/.text),format.raw/*43.20*/("""</p>
      <h5>"""),_display_(/*44.12*/post/*44.16*/.hashtag),format.raw/*44.24*/("""</h5>
      """),_display_(/*45.8*/if(request.session.get("username").toList(0) == post.username)/*45.70*/{_display_(Seq[Any](format.raw/*45.71*/("""
      """),format.raw/*46.7*/("""<a href = """"),_display_(/*46.19*/routes/*46.25*/.HomeController.removePost(post.id.toString)),format.raw/*46.69*/(""""><h5>remove</h5></a>
      """)))}),format.raw/*47.8*/("""
    """),format.raw/*48.5*/("""</div>
    """)))}),format.raw/*49.6*/("""
    """),format.raw/*50.5*/("""<a href=""""),_display_(/*50.15*/routes/*50.21*/.HomeController.goTosharingPageComment),format.raw/*50.59*/(""""><h3>Add comment</h3></a>
  </div>
</div>
</body>
""")))}))
      }
    }
  }

  def render(comments:List[post],searchbar:List[String],flash:Flash,request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(comments,searchbar)(flash,request)

  def f:((List[post],List[String]) => (Flash,RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (comments,searchbar) => (flash,request) => apply(comments,searchbar)(flash,request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/comments.scala.html
                  HASH: 0f198a8e692c1da17da2dc692e86855b13d0c9f7
                  MATRIX: 769->1|958->97|985->98|1050->138|1074->154|1113->156|1140->157|1390->380|1405->386|1494->454|1832->766|1868->786|1907->787|1941->794|1978->804|1993->810|2041->837|2071->840|2094->842|2136->854|2168->859|2471->1136|2508->1157|2547->1158|2579->1163|2641->1198|2656->1204|2715->1242|2749->1249|2762->1253|2792->1262|2840->1283|2853->1287|2879->1292|2918->1305|2953->1331|2992->1332|3026->1339|3085->1371|3100->1377|3158->1414|3226->1452|3260->1459|3291->1463|3304->1467|3330->1472|3373->1488|3386->1492|3415->1500|3454->1513|3525->1575|3564->1576|3598->1583|3637->1595|3652->1601|3717->1645|3776->1674|3808->1679|3850->1691|3882->1696|3919->1706|3934->1712|3993->1750
                  LINES: 21->1|26->2|27->3|28->4|28->4|28->4|29->5|35->11|35->11|35->11|45->21|45->21|45->21|46->22|46->22|46->22|46->22|46->22|46->22|47->23|48->24|60->36|60->36|60->36|61->37|62->38|62->38|62->38|62->38|62->38|62->38|63->39|63->39|63->39|64->40|64->40|64->40|65->41|65->41|65->41|65->41|66->42|67->43|67->43|67->43|67->43|68->44|68->44|68->44|69->45|69->45|69->45|70->46|70->46|70->46|70->46|71->47|72->48|73->49|74->50|74->50|74->50|74->50
                  -- GENERATED --
              */
          