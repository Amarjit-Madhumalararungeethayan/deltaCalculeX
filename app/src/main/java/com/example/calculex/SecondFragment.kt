package com.example.calculex

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.example.calculex.databinding.FragmentSecondBinding

var total = 0
var op = 0
var num1 : String = "0"
var num2 : String = "0"
var switch = false

class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSecondBinding.inflate(inflater, container, false)
        val root: View = binding.root

        binding.b0.setOnClickListener(){

            if(switch){
                num2 = num2 + "0"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "0"
                Log.d("❤️","${num1}")
            }
        }
        binding.b1.setOnClickListener(){

            if(switch){
                num2 = num2 + "1"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "1"
                Log.d("❤️","${num1}")
            }
        }
        binding.b2.setOnClickListener(){

            if(switch){
                num2 = num2 + "2"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "2"
                Log.d("❤️","${num1}")
            }
        }
        binding.b3.setOnClickListener(){

            if(switch){
                num2 = num2 + "3"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "3"
                Log.d("❤️","${num1}")
            }
        }
        binding.b4.setOnClickListener(){

            if(switch){
                num2 = num2 + "4"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "4"
                Log.d("❤️","${num1}")
            }
        }
        binding.b5.setOnClickListener(){

            if(switch){
                num2 = num2 + "5"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "5"
                Log.d("❤️","${num1}")
            }
        }
        binding.b6.setOnClickListener(){

            if(switch){
                num2 = num2 + "6"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "6"
                Log.d("❤️","${num1}")
            }
        }
        binding.b7.setOnClickListener(){

            if(switch){
                num2 = num2 + "7"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "7"
                Log.d("❤️","${num1}")
            }
        }
        binding.b8.setOnClickListener(){

            if(switch){
                num2 = num2 + "8"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "8"
                Log.d("❤️","${num1}")
            }
        }
        binding.b9.setOnClickListener(){

            if(switch){
                num2 = num2 + "9"
                Log.d("❤️","${num2}")
            }else{
                num1 = num1 + "9"
                Log.d("❤️","${num1}")
            }

        }
        binding.add.setOnClickListener(){
            switch = true
            op = 0
        }

        binding.sub.setOnClickListener(){
            switch = true
            op = 1
        }

        binding.div.setOnClickListener(){
            switch = true
            op = 2
        }

        binding.mul.setOnClickListener(){
            switch = true
            op = 3
        }

        binding.eq.setOnClickListener(){
            when(op){
                0 -> total = num1.toInt() + num2.toInt()
                1 -> total = num1.toInt() - num2.toInt()
                2 -> total = num1.toInt() / num2.toInt()
                3 -> total = num1.toInt() * num2.toInt()
            }
            Log.d("😍😍😍","${total}")
        }

        binding.clear.setOnClickListener(){
            total = 0
            op = 0
            num1 = "0"
            num2 = "0"
            switch = false
        }

        return root
    }
}