package dev.maxc.ui.view

import dev.maxc.ui.view.creator.DataPoint

/**
 * @author Max Carter
 * @since 24/06/2020
 */
interface ProgressivePane {
    fun onRequestProgression() : Boolean
    fun onProgressionDenied()
    fun onViewUpdate(dataPoints: List<DataPoint>)
    fun getDataPoints() : Array<DataPoint>
}