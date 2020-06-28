package dev.maxc.ui.view

import dev.maxc.App
import dev.maxc.ui.model.scroller.PaneScrollerController
import dev.maxc.ui.model.scroller.Scrollable
import javafx.fxml.FXMLLoader
import javafx.scene.layout.Pane


/**
 * @author Max Carter
 * @since 23/06/2020
 */
abstract class PaneScrollerViewCreation(private val parent: Pane, private vararg val scrollables: Scrollable) {
    fun show() {
        val loader = FXMLLoader(App::class.java.getResource("/pane_scroller.fxml"))
        val paneScrollerRoot: Pane = loader.load()
        val paneScrollerController = loader.getController<PaneScrollerController>()
        paneScrollerController.setPanes(*scrollables)
        parent.children.clear()
        parent.children.add(paneScrollerRoot)
    }

    companion object {
        fun createView(
            title: String,
            view: String,
            skipProgressBarTab: Boolean = false,
            requiresUpdateNotification: Boolean = false
        ): Scrollable {
            val scrollable = Scrollable(title, skipProgressBarTab, requiresUpdateNotification)
            val loader = FXMLLoader(App::class.java.getResource("/view/$view.fxml"))
            scrollable.children.add(loader.load())
            scrollable.progressivePane = loader.getController()
            return scrollable
        }
    }
}