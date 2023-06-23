package ctd.shoesfix.service;

import ctd.shoesfix.model.Brand;
import ctd.shoesfix.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BrandServiceImp implements BrandService{
    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> listAllBrands() {
        return brandRepository.findAll();
    }
    @Override
    public Brand getBrandId(Long id) {
        return brandRepository.getById(id);
    }
}
