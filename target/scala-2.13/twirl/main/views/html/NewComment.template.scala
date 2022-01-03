
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

object NewComment extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[String,String,Flash,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(username: String, id: String)(implicit flash : Flash):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("newComment")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""
"""),format.raw/*4.1*/("""<div>
    <form method="get" action="createComment">
        <div class="container">
            <h1>add a thought</h1>
            <label for="text"><b>Text</b></label>
            <input type="text" placeholder="Enter text" name="text" required>

            <label for="hashtag"><b>hashtag</b></label>
            <input type="text" placeholder="Enter hashtag" name="hashtag" required>
            <input type="text" placeholder="Don't touch this" value=""""),_display_(/*13.71*/username),format.raw/*13.79*/("""" name="username" style="display: none;">
            <input type="text" placeholder="Don't touch this" value=""""),_display_(/*14.71*/id),format.raw/*14.73*/("""" name="id" style="display: none;">
            <button type="submit">Post</button>
        </div>
    </form>
</div>
""")))}))
      }
    }
  }

  def render(username:String,id:String,flash:Flash): play.twirl.api.HtmlFormat.Appendable = apply(username,id)(flash)

  def f:((String,String) => (Flash) => play.twirl.api.HtmlFormat.Appendable) = (username,id) => (flash) => apply(username,id)(flash)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/NewComment.scala.html
                  HASH: 1559a736079a59f5048373315ad9c03013a5c2bb
                  MATRIX: 747->1|895->56|922->58|948->76|987->78|1014->79|1500->538|1529->546|1668->658|1691->660
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4|37->13|37->13|38->14|38->14
                  -- GENERATED --
              */
          