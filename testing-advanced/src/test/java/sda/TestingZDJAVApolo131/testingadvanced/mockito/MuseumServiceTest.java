package sda.TestingZDJAVApolo131.testingadvanced.mockito;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class MuseumServiceTest {

    @Mock
    MuseumRepository museumRepository;

    @InjectMocks
    MuseumService museumService;

    @Test
    void getAllMuseums() {
//        given
        Museum museum = new Museum("Paint", 200);
        Museum museum1 = new Museum("Sculpture", 1200);

        Mockito.when(museumRepository.getAllMuseums()).thenReturn(List.of(museum, museum1));

//      when+then
        assertEquals(List.of(museum, museum1), museumService.getAllMuseums());
        Assertions.assertThat(museumService.getAllMuseums()).isNotEmpty();




    }
}