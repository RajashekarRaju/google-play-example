package com.developersbreach.googleplayexample.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.developersbreach.googleplayexample.view.games.children.ChildrenFragment
import com.developersbreach.googleplayexample.view.games.events.EventsFragment
import com.developersbreach.googleplayexample.view.games.forYou.ForYouFragment
import com.developersbreach.googleplayexample.view.games.topCharts.TopChartsFragment

class ParentFragmentPagerAdapter(
    fragmentActivity: FragmentActivity
) : FragmentStateAdapter(fragmentActivity) {

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return ForYouFragment()
            1 -> return TopChartsFragment()
            2 -> return ChildrenFragment()
            3 -> return EventsFragment()
        }
        return ForYouFragment()
    }

    override fun getItemCount(): Int {
        return 4
    }
}