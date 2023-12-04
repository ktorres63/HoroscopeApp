package com.tutorial.horoscopeapp.ui.luck

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.tutorial.horoscopeapp.R
import com.tutorial.horoscopeapp.databinding.FragmentHoroscopeBinding
import com.tutorial.horoscopeapp.databinding.FragmentLuckBinding

class LuckFragment : Fragment() {
    private var _binding: FragmentLuckBinding? = null

    // con !! nos aseguramos que lo q enviamos no sera null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLuckBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}