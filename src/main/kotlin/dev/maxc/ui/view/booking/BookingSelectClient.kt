package dev.maxc.ui.view.booking

import dev.maxc.ui.util.TextFieldUtils
import dev.maxc.ui.view.DataPoint
import dev.maxc.ui.view.ProgressivePane
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
class BookingSelectClient : Initializable, ProgressivePane {
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

    @FXML
    lateinit var clientName: Label

    @FXML
    lateinit var clientCompany: Label

    var clientStatus = true //true until actual validation of the user can be confirmed

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        checkClient(forename, surname, companyName, activityName)
    }

    override fun onRequestProgression(): Boolean {
        return clientStatus
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf()
    }

    override fun onProgressionDenied() {
        for (field in arrayOf(forename, surname, companyName, activityName)) {
            if (field.text.isBlank()) {
                TextFieldUtils.flagEmpty(field)
            }
        }
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }

    private fun checkClient(vararg fields: TextField) {
        for (field in fields) {
            field.textProperty()
                .addListener { _, _, newValue ->
                    //todo check database for client data for nweValue
                }
        }
    }
}