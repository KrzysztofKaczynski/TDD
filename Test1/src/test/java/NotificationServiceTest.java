import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class NotificationServiceTest {
    private NotificationService notificationService;

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Mock
    private EmailService emailService;

    @Mock
    private PigeonService pigeonService;


}
