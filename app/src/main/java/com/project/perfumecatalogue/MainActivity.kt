package com.project.perfumecatalogue

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var viewPager: ViewPager2
    private lateinit var thumbnailsRecyclerView: RecyclerView
    private lateinit var pagerAdapter: PerfumePagerAdapter
    private lateinit var thumbnailsAdapter: ThumbnailsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        viewPager = findViewById(R.id.viewPager)
        pagerAdapter = PerfumePagerAdapter(perfumes)
        viewPager.adapter = pagerAdapter

        thumbnailsRecyclerView = findViewById(R.id.thumbnailsRecyclerView)
        thumbnailsRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        thumbnailsAdapter = ThumbnailsAdapter(perfumes) { position ->
            viewPager.currentItem = position
        }
        thumbnailsRecyclerView.adapter = thumbnailsAdapter

        findViewById<Button>(R.id.previousButton).setOnClickListener {
            viewPager.currentItem = (viewPager.currentItem - 1 + perfumes.size) % perfumes.size
        }

        findViewById<Button>(R.id.nextButton).setOnClickListener {
            viewPager.currentItem = (viewPager.currentItem + 1) % perfumes.size
        }
    }
}
