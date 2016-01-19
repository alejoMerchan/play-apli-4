package models;

import play.db.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created by abelmeos on 2016/01/18.
 */

@Entity
public class Story extends Model {

    @Id
    private String id;

    private String url;

    private String fullname;

    private Date submittedOn = new Date();

    private String title;
    private String text;
    private String image;


    public Story() {

    }

    public Story(String url, String fullname) {
        this.url = url;
        this.fullname = fullname;
    }

    public Story(String url, String fullname, String image, String text, String title) {
        this.url = url;
        this.fullname = fullname;
        this.title = title;
        this.text = text;
        this.image = image;
    }

    // Getter and Setter removed for brevity


}
