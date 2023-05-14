package sda.TestingZDJAVApolo131.testingadvanced.mockito;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MuseumService {

    private final MuseumRepository museumRepository;

    public List<Museum> getAllMuseums(){
       return museumRepository.getAllMuseums();
    }
}
