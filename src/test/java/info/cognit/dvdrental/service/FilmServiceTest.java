package info.cognit.dvdrental.service;

import info.cognit.dvdrental.domain.repository.CustomerRepo;
import info.cognit.dvdrental.domain.repository.FilmRepo;
import info.cognit.dvdrental.service.impl.FilmServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

public class FilmServiceTest {

    @Mock
    private FilmRepo filmRepo;

    @Mock
    private CustomerRepo customerRepo;

    @InjectMocks
    private FilmService filmService = new FilmServiceImpl();


    @Test
    public void testExistingCustomer(){

    }


}