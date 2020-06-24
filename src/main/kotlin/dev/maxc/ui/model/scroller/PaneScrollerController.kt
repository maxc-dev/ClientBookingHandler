package dev.maxc.ui.model.scroller

import dev.maxc.ui.model.progressbar.ProgressBar
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.geometry.Pos
import javafx.scene.Group
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
    lateinit var basePane: VBox

    private lateinit var progressBar: ProgressBar
    private lateinit var scrollPanes: List<Scrollable>
    var applicationPane = Group()
    var scrollIndex = 0

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    /**
     * Sets the panes that will be scrolled through
     */
    fun setPanes(vararg panes: Scrollable) {
        if (panes.isEmpty()) {
            //if there are no panes to display there is no point in continuing
            return
        }
        scrollPanes = panes.map { p -> p }
        progressBar = ProgressBar(panes.map { pane -> pane })
        basePane.children.add(progressBar)

        //adds the scroll pane & arrows after the progress bar has been added
        val scrollerComponents = HBox(10.0)
        scrollerComponents.alignment = Pos.CENTER
        scrollerComponents.children.add(ScrollArrow(this, false))
        scrollerComponents.children.add(applicationPane)
        setPaneIndex(0)
        scrollerComponents.children.add(ScrollArrow(this, true))
        basePane.children.add(scrollerComponents)
    }

    /**
     * Sets the index of the featured pane
     */
    private fun setPaneIndex(index: Int) {
        applicationPane.children.remove(scrollPanes[scrollIndex])
        scrollIndex = index
        applicationPane.children.add(scrollPanes[index])
    }

    /**
     * Called when the featured pane is meant to be scrolled.
     */
    fun onFeaturedPaneScrolled(right: Boolean) {
        if (right) {
            //is it valid to move onto next?
            if (scrollPanes[scrollIndex].progressivePane!!.onRequestProgression()) {
                if (scrollIndex + 1 < scrollPanes.size) {
                    setPaneIndex(++scrollIndex)
                    progressBar.tick(scrollIndex-1)
                }
            } else {
                scrollPanes[scrollIndex].progressivePane!!.onProgressionDenied()
            }

        } else {
            if (scrollIndex - 1 >= 0) {
                setPaneIndex(--scrollIndex)
            }
        }
    }
}