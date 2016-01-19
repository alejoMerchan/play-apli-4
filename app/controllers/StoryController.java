package controllers;

import models.Story;
import play.db.ebean.Model;
import play.libs.Json;
import play.mvc.Result;
import play.mvc.Results;

import java.util.List;

/**
 * Created by abelmeos on 2016/01/18.
 */
public class StoryController {


    public static Result allStories(){
        List<Story> stories = new Model.Finder<String,Story>(String.class,Story.class).all();
        return Results.ok(Json.toJson(stories));
    }


}
