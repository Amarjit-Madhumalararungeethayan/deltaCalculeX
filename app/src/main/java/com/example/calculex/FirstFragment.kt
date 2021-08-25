package com.example.calculex

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.calculex.databinding.FragmentFirstBinding
import com.example.calculex.databinding.FragmentSecondBinding


class FirstFragment : Fragment() {
    private var _binding: FragmentFirstBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        val root: View = binding.root

        //checkUp()

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val model = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        model.message.observe(viewLifecycleOwner, Observer {
            binding.txtF1.text = it
        })
    }
    }


/**
    private fun checkUp() {
            val countDown: CountDownTimer
            countDown = object : CountDownTimer(3500000, 10) {
                override fun onTick(millisecsToFinish: Long) {
                    var sym = "+"
                    when(op){
                        0 -> sym = "+"
                        1 -> sym = "-"
                        2 -> sym = "%"
                        3 -> sym = "*"
                    }
                    binding.txtF1.text = "${num1} ${sym} ${num2} = ${total}"
                }
                override fun onFinish() {
                    checkUp()

                }


            }
            countDown.start()
    }
    **/
