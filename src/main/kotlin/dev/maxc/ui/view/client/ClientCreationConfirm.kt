package dev.maxc.ui.view.client

import dev.maxc.ui.view.ProgressivePane
import dev.maxc.ui.view.DataPoint
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

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
        name.text = DataPoint.getData(dataPoints, ClientConstant.KEY_NAME)
        companyName.text = DataPoint.getData(dataPoints, ClientConstant.KEY_COMPANY)
        activityName.text = DataPoint.getData(dataPoints, ClientConstant.KEY_ACTIVITY)
        email.text = DataPoint.getData(dataPoints, ClientConstant.KEY_EMAIL)
        phone.text = DataPoint.getData(dataPoints, ClientConstant.KEY_PHONE)
        address.text = DataPoint.getData(dataPoints, ClientConstant.KEY_ADDRESS)
        notes.text = DataPoint.getData(dataPoints, ClientConstant.KEY_NOTES)
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf()
    }
}