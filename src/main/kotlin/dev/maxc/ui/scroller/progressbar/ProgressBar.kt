package dev.maxc.ui.scroller.progressbar

import javafx.scene.layout.HBox


/**
 * @author Max Carter
 * @since 19/06/2020
 */
class ProgressBar(startingNodeTitles: ArrayList<String> = arrayListOf()) : HBox() {
    private val progressNodes = arrayListOf<ProgressBarNode>()
    var index = -1

    init {
        for (title in startingNodeTitles) {
            progressNodes.add(ProgressBarNode(title))
        }
    }

    fun tick() {
        if (index < progressNodes.size-1) {
            progressNodes[++index].checked = true
        }
    }

    fun untick() {
        if (index > -1) {
            progressNodes[--index].checked = false
        }
    }
}