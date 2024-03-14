package org.kata.tamagotchi.controller;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.mockito.Mockito.*;

@SpringBootTest
class FeedControllerTest {

    @InjectMocks
    FeedController controller;
    @Mock
    FeedService feedService;
    @Test
    void feed_callServicesToFeedTama_callingServices() {
        when(feedService.feed());

        controller.feed();

        verify(feedService).feed();

    }

}
