package info.cognit.dvdrental.domain.repository;

import info.cognit.dvdrental.domain.entity.FilmEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

//CrudRepository is a part of the Spring Data JPA framework: CrudRepository,

public interface FilmRepo extends CrudRepository<FilmEntity, Long> {

   List<FilmEntity> findAllDvdByTitleAndReleaseYear(String title, Integer releaseYear);

}
