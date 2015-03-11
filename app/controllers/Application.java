package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Alumni;
import views.html.Contactus;
import views.html.Faculty;
import views.html.Index;
import views.html.Students;
import views.html.Students$;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render());
  }
  /**
   * Returns the students page.
   * @return The resulting students page.
   */
  public static Result students() {
    return ok(Students.render());
  }
  /**
   * Returns the faculty page.
   * @return The faculty home page.
   */
  public static Result faculty() {
    return ok(Faculty.render());
  }
  /**
   * Returns the alumni page.
   * @return The resulting alumni page.
   */
  public static Result alumni() {
    return ok(Alumni.render());
  }
  /**
   * Returns the contactus page.
   * @return The resulting contactus page.
   */
  public static Result contactus() {
    return ok(Contactus.render());
  }
}
