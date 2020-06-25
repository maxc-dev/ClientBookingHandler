package dev.maxc.ui.view.client

import dev.maxc.ui.view.ProgressivePane
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class ClientCreationConfirm : Initializable, ProgressivePane {
    @FXML
    lateinit var name: Label

    @FXML
    lateinit var companyName: Label

    @FXML
    lateinit var activityName: Label

    @FXML
    lateinit var email: Label

    @FXML
    lateinit var phone: Label

    @FXML
    lateinit var address: Label

    @FXML
    lateinit var notes: Label

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    override fun onRequestProgression(): Boolean {
        return true
    }

    override fun onProgressionDenied() {
    }
}