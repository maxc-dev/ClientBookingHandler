package dev.maxc.ui.view.booking

import dev.maxc.ui.view.ProgressivePane
import dev.maxc.ui.view.DataPoint
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.Label
import javafx.scene.control.TextField
import javafx.scene.image.ImageView
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class BookingLocateClient : Initializable, ProgressivePane {
    @FXML
    lateinit var forename: TextField

    @FXML
    lateinit var surname: TextField

    @FXML
    lateinit var companyName: TextField

    @FXML
    lateinit var activityName: TextField

    @FXML
    lateinit var clientStatusImage: ImageView

    @FXML
    lateinit var clientStatusText: Label

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    override fun onRequestProgression(): Boolean {
        return true
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf()
    }

    override fun onProgressionDenied() {
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }
}