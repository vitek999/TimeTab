package ru.intelrug.timetab.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import ru.intelrug.timetab.R
import ru.intelrug.timetab.databinding.FragmentSecondWeekBinding

class SecondWeekFragment : Fragment() {

    private lateinit var binding: FragmentSecondWeekBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_second_week, container, false)
        return binding.root
    }
}
