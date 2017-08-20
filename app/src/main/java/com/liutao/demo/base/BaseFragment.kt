package com.liutao.demo.base

import android.app.Fragment
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by liutao on 2017/8/19.
 */
abstract class BaseFragment : Fragment(), IBaseView {

    protected lateinit var mPresenter: IBasePresenter
    protected lateinit var mContext: Context
    protected lateinit var mRootView: View

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        mContext = context as Context
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View {
        mRootView = inflater?.inflate(getLayoutId(), container, false) as View
        return view
    }

    override fun setPresenter(presenter: IBasePresenter) {
        mPresenter = presenter
    }

    open fun lazyData() {

    }

    protected abstract fun getLayoutId(): Int

    protected abstract fun initView()

}