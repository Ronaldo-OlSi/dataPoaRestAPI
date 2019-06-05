package com.dataPoa.dataPoaRestAPI;

import com.dataPoa.dataPoaRestAPI.models.LinhaOnibus;
import com.dataPoa.dataPoaRestAPI.services.servicesImpl.LinhaOnibusServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.io.IOException;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LinhaOnibusServiceTest {

    @Test
    public void shouldGetAllBusLine() throws IOException {
        LinhaOnibusServiceImpl service = mock(LinhaOnibusServiceImpl.class);
        //assertEquals(Arrays.asList());
    }

    @Test
    public void shouldSaveOneBusLine() {
        LinhaOnibusServiceImpl service = mock(LinhaOnibusServiceImpl.class);

        when(service.save(any(LinhaOnibus.class)))
                .thenReturn(mock(LinhaOnibus.class));
    }
}