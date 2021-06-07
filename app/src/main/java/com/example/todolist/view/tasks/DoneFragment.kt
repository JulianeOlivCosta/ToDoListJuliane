package com.example.todolist.view.tasks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.todolist.databinding.FragmentToDoBinding

class DoneFragment : Fragment() {

    private val binding by lazy {
        FragmentToDoBinding.inflate(layoutInflater)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        super.onCreateView(inflater, container, savedInstanceState)
        return binding.root
    }

    companion object {
        fun newInstance() = DoneFragment()
    }
}