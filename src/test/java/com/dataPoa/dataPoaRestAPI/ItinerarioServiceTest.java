package com.dataPoa.dataPoaRestAPI;

import com.dataPoa.dataPoaRestAPI.services.servicesImpl.ItinerarioServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@WebMvcTest
public class ItinerarioServiceTest {

    private Mock mock;

    @Test
    public void shouldGetAllItinerariosByLinha() {
        ItinerarioServiceImpl itinerarioService = mock(ItinerarioServiceImpl.class)
        ItinerarioServiceImpl service = new ItinerarioServiceImpl();
    }
}
