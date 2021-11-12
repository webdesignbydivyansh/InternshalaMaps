package com.example.internshalamaps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : AppCompatActivity(), OnMapReadyCallback {

    private lateinit var mMap: GoogleMap

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap

        // Add a marker in Sydney and move the camera
        mMap.uiSettings.apply {
            isCompassEnabled=true
            isMyLocationButtonEnabled=true
            isZoomGesturesEnabled=true
            isZoomControlsEnabled=true
        }
        mMap.setMinZoomPreference(8f)
        val a=intent.getStringArrayExtra("cruise")
        val lat=intent.getDoubleArrayExtra("lat")
        val long=intent.getDoubleArrayExtra("long")
        val mp=intent.getStringExtra("maptype")
        val add=intent.getStringArrayExtra("add")
        for (i in 0..a!!.size-1) {
            val x = LatLng(lat!![i], long!![i])
            mMap.addMarker(MarkerOptions().position(x).title(a[i].toString()).snippet(add!![i]))
            when (mp) {
                "satellite" -> mMap.mapType = GoogleMap.MAP_TYPE_SATELLITE
                "hybrid" -> mMap.mapType = GoogleMap.MAP_TYPE_HYBRID
                else -> mMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            }
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(LatLng(lat!![0],long!![0])))
    }
}