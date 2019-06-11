package com.dataPoa.dataPoaRestAPI;

import com.dataPoa.dataPoaRestAPI.models.LinhaOnibus;
import com.dataPoa.dataPoaRestAPI.services.servicesImpl.LinhaOnibusServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;
import java.util.Objects;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LinhaOnibusServiceTest {

    @Mock
    private LinhaOnibusServiceImpl service = mock(LinhaOnibusServiceImpl.class);

    @Test
    public void shouldGetAllBusLineFromService() throws IOException {
        assertTrue(service.getAllLinhasOnibus()
                .stream()
                .anyMatch(Objects::nonNull)
        );
    }
}