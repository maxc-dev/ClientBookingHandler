package dev.maxc.ui.model.scroller

import dev.maxc.ui.view.ProgressivePane
import javafx.scene.Group

/**
 * @author Max Carter
 * @since 19/06/2020
 */
class Scrollable(val title: String, val skipProgressBarTab: Boolean = false) : Group() {
    var progressivePane: ProgressivePane? = null
}