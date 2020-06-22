package dev.maxc.ui.scroller.progressbar

import javafx.scene.shape.Line


/**
 * @author Max Carter
 * @since 22/06/2020
 */
class ProgressBarTickSeparator : Line() {
    fun updateStatus(ticked: Boolean) {
        if (ticked) {
            tick()
        } else {
            untick()
        }
    }

    private fun tick() {

    }

    private fun untick() {

    }
}