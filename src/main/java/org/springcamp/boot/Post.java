package org.springcamp.boot;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 11.
 * Time: 오후 7:39
 * To change this template use File | Settings | File Templates.
 */
@Entity
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String summary;
    private String text;
    private Date created;

}
