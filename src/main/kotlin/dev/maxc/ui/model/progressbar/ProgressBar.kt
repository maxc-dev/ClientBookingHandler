package dev.maxc.ui.model.progressbar

import dev.maxc.ui.model.scroller.Scrollable
import javafx.geometry.Pos
import javafx.scene.Group
import javafx.scene.layout.HBox
import javafx.scene.layout.StackPane


/**
 * @author Max Carter
 * @since 19/06/2020
 */
class ProgressBar(scrollablePanes: List<Scrollable> = arrayListOf()) : Group() {
    private val progressNodes = arrayListOf<ProgressBarNode>()

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
        for (pane in scrollablePanes) {
            if (pane.skipProgressBarTab) {
                continue
            }
            val nodeSeparator = ProgressBarTickSeparator()
            val node = ProgressBarNode(pane.title)
            progressNodes.add(node)
            contentHold.children.add(nodeSeparator)
            contentHold.children.add(node)
        }
        //remove the first line separator (makes it symmetrical)
        contentHold.children.removeAt(0)
    }

    fun tick(tickedIndex: Int) {
        progressNodes[tickedIndex].checked = true

    }
}