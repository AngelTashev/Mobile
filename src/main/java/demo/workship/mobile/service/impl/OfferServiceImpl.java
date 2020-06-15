package demo.workship.mobile.service.impl;

import demo.workship.mobile.models.entities.Offer;
import demo.workship.mobile.repository.OfferRepository;
import demo.workship.mobile.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class OfferServiceImpl implements OfferService {

    private final OfferRepository offerRepository;

    @Autowired
    public OfferServiceImpl(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    @Override
    public List<Offer> getAllOffers() {
        return this.offerRepository.findAll();
    }
}
