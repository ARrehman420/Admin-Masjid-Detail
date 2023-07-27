package com.abdulrehman.admin_masjiddetail

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragementPageAdapter(
    fragmentManager: FragmentManager, lifecycle: Lifecycle)
    :FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
         if (position==0) {
            return JamaatFragment()
        }
        else if (position==1) {
           return AnnouncmentFragment()
        }else  {
            return ProfileFragment()
        }
    }




}