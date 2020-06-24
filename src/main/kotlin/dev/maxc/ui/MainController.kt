package dev.maxc.ui

import dev.maxc.ui.view.client.ClientCreationPaneScroller
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import javafx.scene.layout.Pane
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class MainController : Initializable {
    @FXML
    lateinit var userPicDisplay: ImageView

    @FXML
    lateinit var userNameDisplay: Label

    @FXML
    lateinit var userEmailDisplay: Label

    @FXML
    lateinit var contentPane: Pane

    lateinit var viewCreator: ClientCreationPaneScroller

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        //contentPane.children.add(FXMLLoader.load(App::class.java.getResource("/calendar_node.fxml")))
    }

    @FXML
    fun onUserLogout() {
        //todo(send user to sign in)
    }

    @FXML
    fun onClientCreateRequest() {
        if (!this::viewCreator.isInitialized) {
            viewCreator = ClientCreationPaneScroller(contentPane)
        }
    }
}