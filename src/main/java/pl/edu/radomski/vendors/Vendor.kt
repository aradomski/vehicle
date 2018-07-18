package pl.edu.radomski.vendors

import javax.swing.plaf.synth.Region

interface Vendor {

    fun getRegion(lat: Double, lon: Double): Region
}