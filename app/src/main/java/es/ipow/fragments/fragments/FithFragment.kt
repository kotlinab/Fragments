package es.ipow.fragments.fragments

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import es.ipow.fragments.R

class FithFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_fifth, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.fragment_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        super.onOptionsItemSelected(item)
        when(item.itemId) {
            R.id.opCopy -> {
                Toast.makeText(this.context, "Has elegido COPIAR", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.opPaste -> {
                Toast.makeText(this.context, "Has elegido PEGAR", Toast.LENGTH_SHORT).show()
                return true
            }
            R.id.opCut -> {
                Toast.makeText(this.context, "Has elegido CORTAR", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        return false
    }


}