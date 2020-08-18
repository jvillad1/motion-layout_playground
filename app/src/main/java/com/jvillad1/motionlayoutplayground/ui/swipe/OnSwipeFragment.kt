package com.jvillad1.motionlayoutplayground.ui.swipe

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.jvillad1.motionlayoutplayground.R
import com.jvillad1.motionlayoutplayground.data.charactersList
import com.jvillad1.motionlayoutplayground.ui.epoxy.CharactersController
import kotlinx.android.synthetic.main.layout_video_container.*

class OnSwipeFragment : Fragment(R.layout.fragment_on_swipe) {

    // Epoxy controller
    private val charactersController: CharactersController by lazy { CharactersController() }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupRecyclerView()
    }

    private fun setupRecyclerView() = charactersRecyclerView.apply {
        layoutManager = LinearLayoutManager(context)
        setController(charactersController)
        charactersController.setData(charactersList)
    }
}
