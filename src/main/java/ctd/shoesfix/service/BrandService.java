package ctd.shoesfix.service;

import ctd.shoesfix.model.Brand;
import ctd.shoesfix.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BrandService {
    List<Brand> listAllBrands();
    Brand getBrandId(Long id);
}
