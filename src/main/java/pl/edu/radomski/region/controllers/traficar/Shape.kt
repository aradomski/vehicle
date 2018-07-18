package pl.edu.radomski.region.controllers.traficar

data class Shape(
        val id: Int,
        val name: String,
        val lat: Double,
        val lon: Double,
        val counterOfCars: Int
)