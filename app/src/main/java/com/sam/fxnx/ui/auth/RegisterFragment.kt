package com.sam.fxnx.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sam.fxnx.R
import com.sam.fxnx.databinding.FragmentLoginBinding
import com.sam.fxnx.databinding.FragmentRegisterBinding

class RegisterFragment : Fragment() {

    private var _binding: FragmentRegisterBinding? = null
    private val binding get () = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegisterBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureButtons()
    }
    private fun configureButtons() {
        binding.arrowBackBtn.setOnClickListener {
            findNavController().navigateUp()
        }

    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}