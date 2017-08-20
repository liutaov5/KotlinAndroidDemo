package com.liutao.demo.ui.fragment

import com.liutao.demo.R
import com.liutao.demo.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_image_list.view.*

/**
 * Created by liutao on 2017/8/19.
 */
class ImageListFragment : BaseFragment() {


    override fun initView() {
        mRootView.rv_list
    }

    override fun getLayoutId(): Int = R.layout.fragment_image_list

}