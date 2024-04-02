package com.sam.fxnx.ui.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.sam.fxnx.R
import com.sam.fxnx.databinding.FragmentLoginBinding

class LoginFragment : Fragment() {

    private var _binding: FragmentLoginBinding? = null
    private val binding get () = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLoginBinding.inflate(inflater, container, false )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        configureButtons()
    }

    private fun configureButtons() {
        binding.createAccountBtn.setOnClickListener {
           findNavController().navigate(R.id.action_loginFragment_to_registerFragment)
        }

        binding.recoverPasswordBtn.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_recoverPasswordFragment)
        }
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}