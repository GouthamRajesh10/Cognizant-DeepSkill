package Exercise1;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import static org.mockito.Mockito.when;

public class MyServiceTest{
    @Test
    public void testexternalAPI() {

        ExternalAPI mockApi = Mockito.mock(ExternalAPI.class);
        when(mockApi.getData()).thenReturn("Mocked Data");
        MyService myService = new MyService(mockApi);

        String result = myService.fetchData();
        assertEquals("Mocked Data", result);

}
}