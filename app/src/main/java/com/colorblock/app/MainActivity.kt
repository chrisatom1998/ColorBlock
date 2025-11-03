package com.colorblock.app

import android.os.Bundle
import android.view.View
import android.widget.GridLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.colorblock.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val colors = listOf(
        R.color.block_red,
        R.color.block_blue,
        R.color.block_green,
        R.color.block_yellow,
        R.color.block_purple,
        R.color.block_orange,
        R.color.block_pink,
        R.color.block_cyan
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupColorBlocks()
    }

    private fun setupColorBlocks() {
        val gridLayout = binding.colorGrid
        val blockSize = resources.displayMetrics.widthPixels / 4 - 20

        colors.forEachIndexed { index, colorRes ->
            val block = View(this).apply {
                layoutParams = GridLayout.LayoutParams().apply {
                    width = blockSize
                    height = blockSize
                    setMargins(10, 10, 10, 10)
                }
                setBackgroundColor(ContextCompat.getColor(context, colorRes))
                setOnClickListener {
                    onBlockClicked(index, colorRes)
                }
            }
            gridLayout.addView(block)
        }
    }

    private fun onBlockClicked(index: Int, colorRes: Int) {
        val colorName = resources.getResourceEntryName(colorRes)
            .replace("block_", "")
            .replaceFirstChar { it.uppercase() }
        binding.selectedColorText.text = "Selected: $colorName"
        binding.rootLayout.setBackgroundColor(
            ContextCompat.getColor(this, colorRes)
        )
    }
}
