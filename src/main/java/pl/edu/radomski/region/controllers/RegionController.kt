package pl.edu.radomski.region.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import pl.edu.radomski.vendors.repository.VendorRepository
import java.util.logging.Logger

@RestController
@RequestMapping("/region")
class RegionController @Autowired constructor() {

    @Autowired
    private lateinit var vendorRepository: VendorRepository


    @GetMapping
    fun getRegion(
            @RequestParam("lat", required = true) lat: Double,
            @RequestParam("lon", required = true) lon: Double,
            @RequestParam("includeVendor", required = false) includeVendor: List<Int>? = vendorRepository.getAllVendorsIds()
    ): Region {
        Logger.getLogger("").info("$lat:$lon $includeVendor")
//RestTemplate
        return Region(1, "Trojmiasto")
    }


}