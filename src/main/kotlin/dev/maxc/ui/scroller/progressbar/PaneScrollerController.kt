package dev.maxc.ui.scroller.progressbar

import dev.maxc.ui.scroller.ScrollablePane
import javafx.fxml.Initializable
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class PaneScrollerController : Initializable {
    lateinit var progressBar: ProgressBar

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    /**
     * Sets the panes that will be scrolled through
     */
    fun setPanes(vararg panes: ScrollablePane) {
        val titles = arrayListOf<String>()
        for (pane in panes) {
            titles.add(pane.title)
        }
        progressBar = ProgressBar(titles)
    }
}