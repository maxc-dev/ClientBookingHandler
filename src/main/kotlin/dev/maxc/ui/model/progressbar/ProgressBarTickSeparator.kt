package dev.maxc.ui.model.progressbar

import javafx.scene.effect.DropShadow
import javafx.scene.paint.Color
import javafx.scene.shape.Line


/**
 * @author Max Carter
 * @since 22/06/2020
 */
class ProgressBarTickSeparator : Line(0.0, 0.0, 40.0, 0.0) {
    init {
        style = "-fx-stroke-width: 2; -fx-stroke: #ffffff;" //todo make the line 40~ higher
        effect = DropShadow(6.0, Color.GREY)
    }

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