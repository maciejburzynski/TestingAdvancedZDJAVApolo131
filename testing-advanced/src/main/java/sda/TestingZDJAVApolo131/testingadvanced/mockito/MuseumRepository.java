package sda.TestingZDJAVApolo131.testingadvanced.mockito;

import org.springframework.stereotype.Repository;

import java.util.Collections;
import java.util.List;

@Repository
public class MuseumRepository {

    public List<Museum> getAllMuseums() {
        return Collections.emptyList();
        // Homework: please connect to H2 database
    }
}
