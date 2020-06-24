package dev.maxc.ui.model.progressbar

import javafx.scene.effect.DropShadow
import javafx.scene.layout.Pane
import javafx.scene.paint.Color
import javafx.scene.shape.Line


/**
 * @author Max Carter
 * @since 22/06/2020
 */
class ProgressBarTickSeparator : Pane() {
    private val lineWidth: Double = 30.0

    init {
        setPrefSize(lineWidth, 100.0)

        val line = Line(0.0, 36.0, lineWidth, 36.0)
        line.style = "-fx-stroke-width: 2; -fx-stroke: #ffffff;"
        line.effect = DropShadow(6.0, Color.GREY)
        children.add(line)
    }
}