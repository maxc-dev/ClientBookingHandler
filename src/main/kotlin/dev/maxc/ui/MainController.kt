package dev.maxc.ui

import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.image.ImageView
import javafx.scene.layout.HBox
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
    lateinit var logoutButton: Pane

    @FXML
    lateinit var addClientButton: HBox

    @FXML
    lateinit var editClientButton: HBox

    @FXML
    lateinit var contentPane: Pane

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }
}