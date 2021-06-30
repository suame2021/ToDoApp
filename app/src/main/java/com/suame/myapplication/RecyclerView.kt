package com.suame.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.suame.myapplication.adapters.CountryAdapter
import com.suame.myapplication.databinding.ActivityHomeactivityBinding
import com.suame.myapplication.databinding.ActivityRecyclerViewBinding
import com.suame.myapplication.models.Country

class RecyclerView : AppCompatActivity() {
    private lateinit var  binding: ActivityRecyclerViewBinding
    private lateinit var myCountryAdapter: CountryAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val countries: List<Country> = listOf(
            Country(
                R.drawable.ic_brazil,
                "Brazil",
            "South America",
            12L
            ),
            Country(
                R.drawable.ic_china,
                "China",
                "Asia",
                2L
            ),
            Country(
                R.drawable.ic_en,
                "United Kingdom",
                "Europe",
                40L
            ),
            Country(
                R.drawable.ic_united_states,
                "United State of America",
                "North America",
                10L
            ),
            Country(
                R.drawable.ic_nigeriaflag,
                "Nigeria",
                "Africa",
                4L
            ),
            Country(
                R.drawable.ic_brazil,
                "Brazil",
                "South America",
                12L
            ),
            Country(
                R.drawable.ic_china,
                "China",
                "Asia",
                2L
            ),
            Country(
                R.drawable.ic_en,
                "United Kingdom",
                "Europe",
                40L
            ),
            Country(
                R.drawable.ic_united_states,
                "United State of America",
                "North America",
                10L
            ),
            Country(
                R.drawable.ic_nigeriaflag,
                "Nigeria",
                "Africa",
                4L
            ),
        )

        myCountryAdapter=CountryAdapter(countries)
        binding.countriesRecyclerView.adapter=myCountryAdapter
    }
}