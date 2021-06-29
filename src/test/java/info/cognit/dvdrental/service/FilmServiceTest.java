package info.cognit.dvdrental.service;

import info.cognit.dvdrental.domain.entity.FilmEntity;
import info.cognit.dvdrental.domain.repository.CustomerRepo;
import info.cognit.dvdrental.domain.repository.FilmRepo;
import info.cognit.dvdrental.service.impl.FilmServiceImpl;
import info.cognit.dvdrental.validator.FilmValidator;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class FilmServiceTest extends BaseTest {

    @Mock
    private FilmRepo filmRepo;

    @Mock
    private CustomerRepo customerRepo;

    @Mock
    private FilmValidator filmValidator;

    @InjectMocks
    private FilmService filmService = new FilmServiceImpl();


    @Test
    public void testDVD() {

        //Instruct the mockito to output specific outcome for this req

        Mockito.when(filmRepo.findAllDvdByTitleAndReleaseYear(Mockito.any(), Mockito.any())).thenReturn((List<FilmEntity>) getFilmEntityAsResponse());
    }


}