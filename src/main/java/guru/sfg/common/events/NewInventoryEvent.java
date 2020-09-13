package guru.sfg.common.events;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class NewInventoryEvent extends BeerEvents {
    public NewInventoryEvent(BeerDto beerDto) {
        super(beerDto);
    }
}
