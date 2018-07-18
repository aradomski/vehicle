package pl.edu.radomski.vendors.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.edu.radomski.vendors.repository.VendorRepository

@RestController
@RequestMapping("/vendors")
class VendorController {

    @Autowired
    private lateinit var vendorRepository: VendorRepository


    @GetMapping
    fun getSupportedVendors(): List<Vendor> {
        return vendorRepository.getAllVendors()
    }

}