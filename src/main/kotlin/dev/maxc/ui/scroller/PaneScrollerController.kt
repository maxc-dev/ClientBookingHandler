package dev.maxc.ui.scroller

import dev.maxc.ui.scroller.progressbar.ProgressBar
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.layout.HBox
import javafx.scene.layout.VBox
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class PaneScrollerController : Initializable {
    @FXML
    lateinit var basePane: HBox

    lateinit var progressBar: ProgressBar

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    /**
     * Sets the panes that will be scrolled through
     */
    fun setPanes(vararg panes: ScrollablePane) {
        if (panes.isEmpty()) {
            //if there are no panes to display there is no point in continuing
            return
        }

        progressBar = ProgressBar(panes.map { pane -> pane.title })
        basePane.children.add(progressBar)

        //adds the scroll pane & arrows after the progress bar has been added
        val scrollerComponents = VBox()
        scrollerComponents.children.add(ScrollArrow(this, false))
        for (pane in panes) {
            scrollerComponents.children.add(pane)
        }
        scrollerComponents.children.add(ScrollArrow(this, true))
        basePane.children.add(scrollerComponents)
    }

    /**
     * Called when the featured pane is meant to be scrolled.
     */
    fun onFeaturedPaneScrolled(right: Boolean) {
        if (right) {
            progressBar.tick()
        } else {
            progressBar.untick()
        }

    }
}