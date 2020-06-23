package dev.maxc.ui.model.progressbar

import javafx.geometry.Pos
import javafx.scene.Group
import javafx.scene.layout.HBox
import javafx.scene.layout.StackPane


/**
 * @author Max Carter
 * @since 19/06/2020
 */
class ProgressBar(startingNodeTitles: List<String> = arrayListOf()) : Group() {
    private val progressNodes = arrayListOf<ProgressBarNode>()
    private val progressSeparatorNodes = arrayListOf<ProgressBarTickSeparator>()
    var index = -1

    init {
        //format pane
        val mainPane = StackPane()
        mainPane.prefHeight = 100.0
        mainPane.prefWidth = 500.0
        mainPane.id = "sideBarCategoryPane"
        mainPane.alignment = Pos.CENTER
        children.add(mainPane)

        //format hbox which holds progress bar components
        val contentHold = HBox(10.0)
        contentHold.prefHeight = 100.0
        contentHold.prefWidth = 500.0
        contentHold.alignment = Pos.CENTER
        children.add(contentHold)

        //loop through the titles, create a pane for each and a line separator
        for (title in startingNodeTitles) {
            val nodeSeparator = ProgressBarTickSeparator()
            val node = ProgressBarNode(title, nodeSeparator)
            progressSeparatorNodes.add(nodeSeparator)
            progressNodes.add(node)
            contentHold.children.add(nodeSeparator)
            contentHold.children.add(node)
        }
        //remove the first line separator (makes it symmetrical)
        contentHold.children.remove(progressSeparatorNodes[0])
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