package dev.maxc.ui.view.client

import dev.maxc.App
import dev.maxc.ui.model.scroller.PaneScrollerController
import dev.maxc.ui.model.scroller.Scrollable
import javafx.fxml.FXMLLoader
import javafx.scene.layout.Pane


/**
 * @author Max Carter
 * @since 23/06/2020
 */
class ClientCreationPaneScroller(parent: Pane) {
    init {
        val loader = FXMLLoader(App::class.java.getResource("/pane_scroller.fxml"))
        val paneScrollerRoot: Pane = loader.load()
        val paneScrollerController = loader.getController<PaneScrollerController>()

        paneScrollerController.setPanes(
            createView("Name", "client/client_create_name"),
            createView("Contact", "client/client_create_contact"),
            createView("Notes", "client/client_create_notes"),
            createView("Confirm", "client/client_confirm"),
            createView("Confirm", "confirmed", skipProgressBarTab = true)
        )
        parent.children.add(paneScrollerRoot)
    }

    private fun createView(title: String, view: String, skipProgressBarTab: Boolean = false): Scrollable {
        val scrollable = Scrollable(title, skipProgressBarTab)
        val loader = FXMLLoader(App::class.java.getResource("/view/$view.fxml"))
        scrollable.children.add(loader.load())
        scrollable.progressivePane = loader.getController()
        return scrollable
    }
}