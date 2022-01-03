
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

object NewPost extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
"""),_display_(/*3.2*/main("newPost")/*3.17*/ {_display_(Seq[Any](format.raw/*3.19*/("""
"""),format.raw/*4.1*/("""<div>
    <form method="get" action="createPost">
        <div class="container">
            <h1>add a thought</h1>
            <label for="text"><b>Text</b></label>
            <input type="text" placeholder="Enter text" name="text" required>

            <label for="hashtag"><b>hashtag</b></label>
            <input type="text" placeholder="Enter hashtag" name="hashtag" required>

            <label for="img">Choose a picture for upload:</label>
            <input type="file" id="avatar" name="img" accept="image/png, image/jpeg">

            <button type="submit">Post</button>
        </div>
    </form>
</div>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/NewPost.scala.html
                  HASH: 1d8f2e0ade57730ce9ed04434aa79cbd6e93100f
                  MATRIX: 724->1|820->4|847->6|870->21|909->23|936->24
                  LINES: 21->1|26->2|27->3|27->3|27->3|28->4
                  -- GENERATED --
              */
          