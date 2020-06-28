package dev.maxc.ui.view

import dev.maxc.ui.view.creator.DataPoint
import javafx.fxml.Initializable
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class ConfirmationView : Initializable, ProgressivePane {
    override fun initialize(location: URL?, resources: ResourceBundle?) {
    }

    override fun onRequestProgression(): Boolean {
        return true
    }

    override fun onProgressionDenied() {
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf()
    }
}