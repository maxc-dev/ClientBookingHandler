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
class ClientCreationView(parent: Pane) {
    init {
        val loader = FXMLLoader(App::class.java.getResource("/pane_scroller.fxml"))
        val paneScrollerRoot: Pane = loader.load()
        val paneScrollerController = loader.getController<PaneScrollerController>()

        val paneClientName = Scrollable("Name")
        paneClientName.children.add(FXMLLoader.load(App::class.java.getResource("/view/client/client_create_name.fxml")))

        val paneClientEmail = Scrollable("Contact")
        paneClientName.children.add(FXMLLoader.load(App::class.java.getResource("/view/client/client_create_name.fxml")))

        val paneClientNotes = Scrollable("Notes")
        paneClientName.children.add(FXMLLoader.load(App::class.java.getResource("/view/client/client_create_name.fxml")))

        val paneClientOverview = Scrollable("Confirm")
        paneClientName.children.add(FXMLLoader.load(App::class.java.getResource("/view/client/client_create_name.fxml")))

        val paneClientConfirm = Scrollable("Confirm", skipProgressBarTab = true)
        paneClientName.children.add(FXMLLoader.load(App::class.java.getResource("/view/client/client_create_name.fxml")))

        paneScrollerController.setPanes(paneClientName, paneClientEmail, paneClientNotes, paneClientOverview, paneClientConfirm)
        parent.children.add(paneScrollerRoot)
    }
}