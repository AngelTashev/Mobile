package demo.workship.mobile.web;

import demo.workship.mobile.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/offers")
public class OffersController {

//    private final BrandService brandService;
    private final OfferService offerService;

    @Autowired
    public OffersController(OfferService offerService) {
        this.offerService = offerService;
    }

    @GetMapping
    public String getOffers(Model model) {
//        model.addAttribute("brands", this.brandService.getAllBrands());
        model.addAttribute("offers", this.offerService.getAllOffers());
        return "offers";
    }
}
