package Services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.BeerDto;

import java.util.UUID;
@Component
public class BeerservieceImpl implements Beerserviece {
    @Override
    public BeerDto getBeerId(UUID beerId) {
        return BeerDto.builder().beerId(UUID.randomUUID())
                .beerName("Budwiser")
                .beerStyle("chill")
                .build();
    }
}
