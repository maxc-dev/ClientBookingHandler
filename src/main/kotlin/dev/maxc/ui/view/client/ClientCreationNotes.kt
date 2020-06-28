package dev.maxc.ui.view.client

import dev.maxc.ui.view.ProgressivePane
import dev.maxc.ui.view.DataPoint
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TextArea
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class ClientCreationNotes : Initializable, ProgressivePane {
    @FXML
    var notes: TextArea = TextArea() //some reason lateinit throws an error with text areas

    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    override fun onRequestProgression(): Boolean {
        return true
    }

    override fun onProgressionDenied() {
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf(DataPoint(ClientConstant.KEY_NOTES, notes.text))
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }
}