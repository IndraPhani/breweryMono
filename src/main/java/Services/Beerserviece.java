package Services;

import org.springframework.stereotype.Component;
import web.model.BeerDto;

import java.util.UUID;

@Component
public interface Beerserviece {
    BeerDto getBeerId(UUID beerId);
}
