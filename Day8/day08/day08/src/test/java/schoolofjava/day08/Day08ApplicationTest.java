package schoolofjava.day08;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import schoolofjava.day08.sender.MessageSender;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Day08ApplicationTest {
    @Value("${destination.queue}")
    private String destination;

    @Autowired
    private MessageSender sender;

    @Test
    public void testReceive() throws Exception {
        sender.send(destination, "Mesajul 2 din hiper-spatiu");
    }
}