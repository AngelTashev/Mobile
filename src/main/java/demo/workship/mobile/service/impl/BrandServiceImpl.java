package demo.workship.mobile.service.impl;

import demo.workship.mobile.models.entities.Brand;
import demo.workship.mobile.repository.BrandRepository;
import demo.workship.mobile.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAllBrands() {
        return this.brandRepository.findAll();
    }
}
