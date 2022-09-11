package alpherk.njtechlogin.main.home
import alpherk.njtechlogin.AuthenService
import alpherk.njtechlogin.databinding.FragmentHomeBinding
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentHomeBinding.inflate(inflater, container, false)

        binding.requestLoginBtn.setOnClickListener {
            activity?.startService(Intent(activity, AuthenService::class.java))
        }

        return binding.root
    }

}