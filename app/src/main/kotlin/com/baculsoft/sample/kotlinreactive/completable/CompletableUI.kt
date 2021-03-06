package com.baculsoft.sample.kotlinreactive.completable

import android.annotation.SuppressLint
import android.support.v4.content.ContextCompat
import android.view.Gravity
import com.baculsoft.sample.kotlinreactive.R
import org.jetbrains.anko.AnkoComponent
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.alignParentBottom
import org.jetbrains.anko.alignParentTop
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.anko.backgroundColor
import org.jetbrains.anko.below
import org.jetbrains.anko.bottomPadding
import org.jetbrains.anko.button
import org.jetbrains.anko.centerInParent
import org.jetbrains.anko.design.appBarLayout
import org.jetbrains.anko.design.coordinatorLayout
import org.jetbrains.anko.dip
import org.jetbrains.anko.matchParent
import org.jetbrains.anko.relativeLayout
import org.jetbrains.anko.textColor
import org.jetbrains.anko.textView
import org.jetbrains.anko.topPadding
import org.jetbrains.anko.wrapContent

class CompletableUI : AnkoComponent<CompletableActivity> {

    @SuppressLint("NewApi")
    override fun createView(ui: AnkoContext<CompletableActivity>) = with(ui) {
        coordinatorLayout {
            id = R.id.content_completable
            backgroundColor = ContextCompat.getColor(ctx, R.color.colorPrimary)

            relativeLayout {
                appBarLayout {
                    id = R.id.abl_completable
                    backgroundColor = ContextCompat.getColor(ctx, R.color.colorAccent)
                    elevation = dip(4).toFloat()

                    toolbar {
                        id = R.id.toolbar_completable
                        setTitleTextColor(ContextCompat.getColor(ctx, R.color.colorPrimary))
                    }.lparams {
                        width = matchParent
                        height = wrapContent
                    }
                }.lparams {
                    alignParentTop()
                    width = matchParent
                    height = wrapContent
                }

                textView {
                    id = R.id.tv_completable
                    text = ctx.resources.getString(R.string.text_completable)
                    textColor = ContextCompat.getColor(ctx, R.color.colorPrimaryDark)
                    textSize = 16f
                    gravity = Gravity.CENTER
                }.lparams {
                    below(R.id.abl_completable)
                    centerInParent()
                    width = matchParent
                    height = wrapContent
                }

                button {
                    id = R.id.btn_completable
                    text = ctx.resources.getString(R.string.btn_subscribe)
                    textColor = ContextCompat.getColor(ctx, R.color.colorPrimaryDark)
                    textSize = 16f
                    topPadding = dip(16)
                    bottomPadding = dip(16)
                }.lparams {
                    alignParentBottom()
                    width = matchParent
                    height = wrapContent
                    marginEnd = dip(16)
                    marginStart = dip(16)
                    bottomPadding = dip(8)
                }
            }
        }
    }
}