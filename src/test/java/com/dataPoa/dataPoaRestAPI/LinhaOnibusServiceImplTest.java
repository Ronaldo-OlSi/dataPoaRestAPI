package com.dataPoa.dataPoaRestAPI;

import com.dataPoa.dataPoaRestAPI.models.LinhaOnibus;
import com.dataPoa.dataPoaRestAPI.services.servicesImpl.LinhaOnibusServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Objects;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

@RunWith(SpringRunner.class)
public class LinhaOnibusServiceImplTest {

    @Mock
    private LinhaOnibusServiceImpl service = mock(LinhaOnibusServiceImpl.class);

    @Test
    public void shouldGetAllBusLineFromService() throws IOException {
        assertTrue(service.getAllLinhasOnibus()
                .stream()
                .anyMatch(Objects::nonNull)
        );
    }

    @Test
    public void shouldSaveAllBusLineFromService() throws IOException {
        LinhaOnibus linhaOnibus = new LinhaOnibus();

        service.saveLinhasFromService();
    }
}