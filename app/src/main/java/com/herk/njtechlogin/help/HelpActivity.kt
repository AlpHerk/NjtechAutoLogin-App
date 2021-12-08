package com.herk.njtechlogin.help
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.herk.njtechlogin.databinding.ActivityHelpBinding

class HelpActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHelpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHelpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.csdnHelpBtn.setOnClickListener {
            val uri = Uri.parse("https://blog.csdn.net/Alpherkin/article/details/120580798")
            startActivity(Intent(Intent.ACTION_VIEW, uri))
        }
        binding.getWinVersionBtn.setOnClickListener {
            val uri = Uri.parse("https://blog.csdn.net/Alpherkin/article/details/115599094")
            startActivity(Intent(Intent.ACTION_VIEW, uri))
        }
    }
}