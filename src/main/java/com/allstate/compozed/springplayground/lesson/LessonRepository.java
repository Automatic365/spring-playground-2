package com.allstate.compozed.springplayground.lesson;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by localadmin on 7/18/17.
 */
interface LessonRepository extends CrudRepository<LessonModel, Long> {

}
