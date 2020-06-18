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
class CalendarController : Initializable {
    @FXML
    lateinit var hBoxDayDisplay: HBox

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }
}