package pl.edu.radomski.vendors.repository

import org.springframework.stereotype.Repository
import pl.edu.radomski.vendors.controllers.Vendor

@Repository
class VendorRepository {


    fun getAllVendors(): List<Vendor> {
        return listOf(Vendor(1, "Traficar"), Vendor(2, "Blinkee"), Vendor(3, "Vozilla"))
    }

    fun getAllVendorsIds(): List<Int> {
        return getAllVendors().map { it.id }
    }

}