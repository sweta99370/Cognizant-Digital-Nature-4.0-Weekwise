package com.mockito.verify;

import static org.mockito.Mockito.*;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Create a mock object
        ExternalApi mockApi = Mockito.mock(ExternalApi.class);

        // Inject into service and call method
        MyService service = new MyService(mockApi);
        service.fetchData();

        // Verify the method was called
        verify(mockApi).getData();
    }
}
