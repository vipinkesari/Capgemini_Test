package com.myinfosysprogram.base

import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

abstract class BaseFragment : Fragment() {

    inline fun <reified T : ViewModel> Fragment.getViewModel(noinline creator: (() -> T)? = null): T {
        return if (creator == null)
            ViewModelProvider(this).get(T::class.java)
        else
            ViewModelProvider(
                this, BaseViewModelFactory(creator)
            ).get(T::class.java)
    }

    inline fun <reified T : ViewModel> FragmentActivity.getViewModel(noinline creator: (() -> T)? = null): T {
        return if (creator == null)
            ViewModelProvider(this).get(T::class.java)
        else
            ViewModelProvider(
                this,
                BaseViewModelFactory(creator)
            ).get(T::class.java)
    }


    /* this is an extention function
   *  we can use this where base class instance is used.
   * */
    fun toast(message: String, duration: Int = Toast.LENGTH_LONG){
        Toast.makeText(activity, message, duration).show()
    }
}