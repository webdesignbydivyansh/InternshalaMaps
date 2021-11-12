package com.example.internshalamaps

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TravelAgencies : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_travel_agencies)

        val btnstd = findViewById<Button>(R.id.standard)
        val btnsate = findViewById<Button>(R.id.satellite)
        val btnhyb = findViewById<Button>(R.id.hybrid)

        val city = intent.getStringExtra("city")
        when (city) {
            "Toronto" -> {
                val cruise =
                    arrayOf("Cruise Toronto", "Cruise Holidays of Lawrence Park", "Expedia Cruises")
                val lat = doubleArrayOf(43.638732, 43.731639, 43.733186)
                val long = doubleArrayOf(-79.385758, -79.404027, -79.419188)
                val address = arrayOf(
                    "249 Queens Quay W #111, Toronto, ON M5J 2N5, Canada",
                    "3332 Yonge St, Toronto, ON M4N 2M4, Canada",
                    "2881 W Broadway, Vancouver, BC V6K 2G6, Canada"
                )
                btnstd.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "standard")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnsate.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "satellite")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnhyb.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "hybrid")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
            }
            "Mississauga" -> {
                val cruise = arrayOf(
                    "Cruise Holidays of Clarkson",
                    "Cruise Holidays Luxury Travel Boutique",
                    "Expedia Cruises"
                )
                val lat = doubleArrayOf(43.517762, 43.661492, 43.733186)
                val long = doubleArrayOf(-79.622935, -79.598429, -79.419188)
                val address = arrayOf(
                    "1739 Lakeshore Rd W, Mississauga, ON L5J 1J4, Canada",
                    "5160 Explorer Dr #38, Mississauga, ON L4W 4T7, Canada",
                    "2881 W Broadway, Vancouver, BC V6K 2G6, Canada"
                )
                btnstd.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "standard")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnsate.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "satellite")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnhyb.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "hybrid")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
            }
            "Oakville" -> {
                val cruise = arrayOf(
                    "Cruise Holidays of Oakville",
                    "Uniglobe Glen Abbey Travel Inc",
                    "Expedia Cruises"
                )
                val lat = doubleArrayOf(43.447285, 43.395124, 43.733186)
                val long = doubleArrayOf(-79.666861, -79.712217, -79.419188)
                val address = arrayOf(
                    "267 Lakeshore Rd E, Oakville, ON L6J 1H9, Canada",
                    "2441 Lakeshore Rd W, Oakville, ON L6L 5V5, Canada",
                    "2881 W Broadway, Vancouver, BC V6K 2G6, Canada"
                )
                btnstd.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "standard")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnsate.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "satellite")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnhyb.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "hybrid")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
            }
            "Hamilton" -> {
                val cruise =
                    arrayOf("Elena's Travel", "Algonquin Travel Cornwall", "Expedia Cruises")
                val lat = doubleArrayOf(43.256518, 45.026532, 43.733186)
                val long = doubleArrayOf(-79.835440, -74.751604, -79.419188)
                val address = arrayOf(
                    "689 Barton St E, Hamilton, ON L8L 3A5, Canada",
                    "140 Brookdale Ave D, Cornwall, ON K6J 4P4, Canada",
                    "2881 W Broadway, Vancouver, BC V6K 2G6, Canada"
                )
                btnstd.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "standard")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnsate.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "satellite")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnhyb.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "hybrid")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
            }
            else -> {
                val cruise = arrayOf(
                    "Oceans Travel & Cruises",
                    "Islington Travel Agencies Ltd",
                    "Expedia Cruises"
                )
                val lat = doubleArrayOf(43.772926, 43.759971, 43.733186)
                val long = doubleArrayOf(-79.331008, -79.570981, -79.419188)
                val address = arrayOf(
                    "200 Consumers Rd, North York, ON M2J 4R4, Canada",
                    "3025 Islington Ave, North York, ON M9L 2K9, Canada",
                    "2881 W Broadway, Vancouver, BC V6K 2G6, Canada"
                )
                btnstd.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "standard")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnsate.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "satellite")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
                btnhyb.setOnClickListener {
                    val i = Intent(this, MapsActivity::class.java)
                    i.putExtra("cruise", cruise)
                    i.putExtra("add", address)
                    i.putExtra("maptype", "hybrid")
                    i.putExtra("lat", lat)
                    i.putExtra("long", long)
                    startActivity(i)
                }
            }
        }
    }
}