package com.example.domain;

import org.springframework.data.repository.CrudRepository;

/**
 * Created by Samuel Mawhinney on 08/05/2017.
 */

/* Uses CRUD operations to handle database data
-------------------------------------------------- */
public interface ReviewRepository extends CrudRepository<Review, Long> {
}
