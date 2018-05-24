

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static junit.framework.TestCase.assertEquals;
import static org.assertj.core.api.Java6Assertions.fail;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(org.mockito.junit.MockitoJUnitRunner.class)
public class NotificationServiceTest {

    @Mock
    private EmailService emailService;
    @Mock
    private PigeonService pigeonService;
    @InjectMocks
    private NotificationService notificationService;

    @Test
    public void shouldSendEmailWhenEmailServiceIsAvailables() {
        //Given
        when(emailService.isAvailable()).thenReturn(true);

        //When
        notificationService.sendNotification();

        //Then
        verify(emailService).sendEmail("sending email...");
    }

    @Test
    public void shouldSendMessageWhenPigeonServiceIsAvailable() {
        //Given
        when(emailService.isAvailable()).thenReturn(false);
        when(pigeonService.isAvailable()).thenReturn(true);

        //When
        notificationService.sendNotification();

        //Then
        verify(pigeonService).sendMessage("sending message...");
    }

    @Test
    public void shouldThrowIllegalStateExceptionWhenMessageServicesUnavailable() {
        //Given
        when(emailService.isAvailable()).thenReturn(false);
        when(pigeonService.isAvailable()).thenReturn(false);

        try {
            //When
            notificationService.sendNotification();
            //Then
            fail("Method should throw IllegalStateException");
        } catch (IllegalStateException e) {
            assertEquals("Message services unavailable", e.getMessage());
        }
    }

}
