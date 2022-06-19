package es.ipow.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.ipow.fragments.databinding.ActivityFragmentBinding

class FragmentActivity : AppCompatActivity() {
    private lateinit var b:ActivityFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        b = ActivityFragmentBinding.inflate(layoutInflater)
        setContentView(b.root)
        val fragment3 = ThirdFragment()
        val fragment4 = FourthFragment()
        val fragment5 = FithFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView,fragment3)
            //Añade añade el fragmento a la pila
            addToBackStack(null)
            commit()
        }
        b.btnFrg3.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragment3)
                addToBackStack(null)
                commit()
            }
        }
        b.btnFrg4.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragment4)
                addToBackStack(null)
                commit()
            }
        }
        b.btnFrg5.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentContainerView,fragment5)
                addToBackStack(null)
                commit()
            }
        }
    }
}