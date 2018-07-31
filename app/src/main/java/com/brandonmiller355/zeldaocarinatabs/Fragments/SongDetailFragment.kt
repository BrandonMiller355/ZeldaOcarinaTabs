package com.brandonmiller355.zeldaocarinatabs.Fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.brandonmiller355.zeldaocarinatabs.R
import com.brandonmiller355.zeldaocarinatabs.SongItems.SongItemContent
import kotlinx.android.synthetic.main.activity_song_detail.*
import kotlinx.android.synthetic.main.song_detail.*
import kotlinx.android.synthetic.main.song_detail.view.*

/**
 * A fragment representing a single Song detail screen.
 * This fragment is either contained in a [SongListActivity]
 * in two-pane mode (on tablets) or a [SongDetailActivity]
 * on handsets.
 */
class SongDetailFragment : Fragment() {

    /**
     * The songItem content this fragment is presenting.
     */
    private var item: SongItemContent.SongItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        arguments?.let {
            if (it.containsKey(ARG_ITEM_ID)) {
                // Load the dummy content specified by the fragment
                // arguments. In a real-world scenario, use a Loader
                // to load content from a content provider.
                item = SongItemContent.ITEM_MAP[it.getString(ARG_ITEM_ID)]
                activity?.toolbar_layout?.title = item?.content
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView = inflater.inflate(R.layout.song_detail, container, false)

        // Show the songItem content as text in a TextView.
        item?.let {
            //rootView.song_detail_text.text = it.details

            //TODO: Brandon - put this in the SongItemContent file instead
            when(arguments.get(ARG_ITEM_ID)) {
                "1" -> rootView.song_detail_tab.setImageResource(R.drawable.zeldaslullaby2)
                "2" -> rootView.song_detail_tab.setImageResource(R.drawable.zeldaslullaby)
                else -> {
                    //do nothing
                    }
            }
//            if (arguments.get(ARG_ITEM_ID) == "1") {
//                rootView.song_detail_tab.setImageResource(R.drawable.zeldaslullaby)
//            }
        }

        //song_detail_tab.setImageResource(R.drawable.zeldaslullaby)
        //song_detail_tab.setImageResource(resources.getIdentifier(context.packageName+":drawable/zeldaslullaby", null, null))
        //val myImageView = activity.findViewById(R.id.song_detail_tab) as ImageView

        //TODO: Brandon - here
//        if(arguments.get(ARG_ITEM_ID) == "1") {
//            rootView.song_detail_tab.visibility
//        }

        return rootView
    }

    companion object {
        /**
         * The fragment argument representing the item ID that this fragment
         * represents.
         */
        const val ARG_ITEM_ID = "item_id"
    }
}
