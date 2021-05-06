package com.firsset.vocabularyenru

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FragmentEdit : Fragment()
    {
        var idWord:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        arguments?.let { idWord = it.getLong(KEY_PARSE_ID, 1) }

        return inflater.inflate(R.layout.fragment_layout, container, false)
    }

    override fun onViewCreated(
        view: View,
        savedInstanceState: Bundle?
    ) {

    }



    companion object {
        const val KEY_PARSE_ID = "ID_WORD"
        fun newInstance(idWord: Long) = FragmentWord().apply {
            arguments = Bundle().apply {
                putLong("ID_WORD", idWord)
            }
        }
    }

}