package com.ifeor.gitandroidschool

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_posts.*

class PostsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? = inflater.inflate(R.layout.fragment_posts, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        activity_second_fragment_posts_note_first.text = (activity as FragmentsActivity).getFishtext()
        activity_second_fragment_posts_note_second.text = (activity as FragmentsActivity).getFishtext()
        // Prepare and primary text setting
        val lineCountTextFirst = activity_second_fragment_posts_show_all_post_first.lineCount
        val lineCountTextSecond = activity_second_fragment_posts_show_all_post_second.lineCount
        onHidePartFirstPost()
        onHidePartSecondPost()
        // Show and Hide for first post
        activity_second_fragment_posts_show_all_post_first.setOnClickListener { onShowAllFirstPost(lineCountTextFirst) }
        activity_second_fragment_posts_hide_part_post_first.setOnClickListener { onHidePartFirstPost() }
        // Show and Hide for second post
        activity_second_fragment_posts_show_all_post_second.setOnClickListener { onShowAllSecondPost(lineCountTextSecond) }
        activity_second_fragment_posts_hide_part_post_second.setOnClickListener { onHidePartSecondPost() }
    }

    private fun onShowAllFirstPost(lineCountTextFirst: Int) {
        activity_second_fragment_posts_note_first.setLines(lineCountTextFirst)
        activity_second_fragment_posts_show_all_post_first.setVisible(false)
        activity_second_fragment_posts_hide_part_post_first.setVisible(true)
    }

    private fun onHidePartFirstPost() {
        activity_second_fragment_posts_note_first.setLines(10)
        activity_second_fragment_posts_show_all_post_first.setVisible(true)
        activity_second_fragment_posts_hide_part_post_first.setVisible(false)
    }

    private fun onShowAllSecondPost(lineCountTextSecond: Int) {
        activity_second_fragment_posts_note_second.setLines(lineCountTextSecond)
        activity_second_fragment_posts_show_all_post_second.setVisible(false)
        activity_second_fragment_posts_hide_part_post_second.setVisible(true)
    }

    private fun onHidePartSecondPost() {
        activity_second_fragment_posts_note_second.setLines(10)
        activity_second_fragment_posts_show_all_post_second.setVisible(true)
        activity_second_fragment_posts_hide_part_post_second.setVisible(false)
    }
}
