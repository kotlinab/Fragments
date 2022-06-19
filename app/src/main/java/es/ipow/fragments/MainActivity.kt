package es.ipow.fragments

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import es.ipow.fragments.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var b:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b =ActivityMainBinding.inflate(layoutInflater)
        setContentView(b.root)

    }
    fun clickNext(view: View){
        val intent = Intent(this, FragmentActivity::class.java)
        startActivity(intent)
    }
}