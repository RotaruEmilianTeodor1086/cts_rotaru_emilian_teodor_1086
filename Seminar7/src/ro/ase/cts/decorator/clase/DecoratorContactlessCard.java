package ro.ase.cts.decorator.clase;

public class DecoratorContactlessCard extends DecoratorAbstract{

    public DecoratorContactlessCard(CardBancar card) {
        super(card);
    }

    @Override
    public void platesteContactless() {
        System.out.println(((Card)super.getCard()).getTitular() + " a realizat o plata Contactless cu cardul");
    }

}
