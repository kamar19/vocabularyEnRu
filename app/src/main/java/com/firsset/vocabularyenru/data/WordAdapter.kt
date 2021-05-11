package com.firsset.vocabularyenru.data

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.firsset.vocabularyenru.R
import com.firsset.vocabularyenru.data.models.Word
import java.lang.String


class WordAdapter(
    context: Context?,
    listWordSummaries: MutableList<Word>,
    itemClickListener: OnItemClickListener
) :
    RecyclerView.Adapter<WordAdapter.WordViewHolder>(),
    View.OnClickListener {
    private val inflater: LayoutInflater
    var listWords: MutableList<Word>
    var itemClickListener: OnItemClickListener
    var currentPos: Int = 0

    init {
        this.listWords = listWordSummaries
        this.inflater = LayoutInflater.from(context)
        this.itemClickListener = itemClickListener
    }

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    override fun getItemCount(): Int {
        return listWords.size
    }

    fun getItem(position: Int): Word {
        return listWords.get(position)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordViewHolder =
        WordViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        )

    override fun onClick(v: View) {
        currentPos?.let { itemClickListener.onItemClick(it) }
    }

    override fun onBindViewHolder(holderWord: WordViewHolder, position: Int) {
        holderWord.bind(getItem(position))
        holderWord.itemView.setOnClickListener(View.OnClickListener {
            itemClickListener.onItemClick(position)
        })
    }

    inner class WordViewHolder internal constructor(view: View) :
        RecyclerView.ViewHolder(view) {
        val letterListItem: TextView
        val wordListItem: TextView
        val vocListItem: TextView

        init {
            letterListItem = view.findViewById(R.id.letterListItem)
            wordListItem = view.findViewById(R.id.wordListItem)
            vocListItem = view.findViewById(R.id.vocListItem)
        }

        fun bind(wordSummary: Word) {
            letterListItem.setText(String.valueOf(wordSummary.word.get(0).toUpperCase()))
            wordListItem.setText(wordSummary.word)
            vocListItem.setText(wordSummary.transfer)
            currentPos = wordSummary.id
        }
    }

}