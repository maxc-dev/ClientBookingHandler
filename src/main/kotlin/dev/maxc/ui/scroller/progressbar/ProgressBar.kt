package dev.maxc.ui.scroller.progressbar

import javafx.scene.layout.HBox


/**
 * @author Max Carter
 * @since 19/06/2020
 */
class ProgressBar(startingNodeTitles: List<String> = arrayListOf()) : HBox() {
    private val progressNodes = arrayListOf<ProgressBarNode>()
    private val progressSeparatorNodes = arrayListOf<ProgressBarTickSeparator>()
    var index = -1

    init {
        //loop through the titles, create a pane for each and a line separator
        for (title in startingNodeTitles) {
            val nodeSeparator = ProgressBarTickSeparator()
            val node = ProgressBarNode(title, nodeSeparator)
            progressSeparatorNodes.add(nodeSeparator)
            progressNodes.add(node)
            children.add(nodeSeparator)
            children.add(node)
        }
        //remove the first line separator (makes it symmetrical)
        children.remove(progressSeparatorNodes[0])
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