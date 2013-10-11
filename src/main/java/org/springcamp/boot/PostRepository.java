package org.springcamp.boot;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created with IntelliJ IDEA.
 * User: jilee
 * Date: 13. 10. 11.
 * Time: 오후 7:44
 * To change this template use File | Settings | File Templates.
 */
public interface PostRepository extends JpaRepository<Post, Long>{
}
