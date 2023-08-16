package com.test.user.app.repository;

import com.test.user.app.models.Tutorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

    // Aquí podemos definir métodos personalizados para interactuar con la BD

    List<Tutorial> findByPublished(boolean published);

    List<Tutorial> findByTitle(String title);

}
