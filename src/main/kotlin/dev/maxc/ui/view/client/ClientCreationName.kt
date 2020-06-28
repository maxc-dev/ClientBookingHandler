package dev.maxc.ui.view.client

import dev.maxc.ui.util.InputValidation
import dev.maxc.ui.util.TextFieldUtils
import dev.maxc.ui.view.ProgressivePane
import dev.maxc.ui.view.DataPoint
import javafx.fxml.FXML
import javafx.fxml.Initializable
import javafx.scene.control.TextField
import java.net.URL
import java.util.*


/**
 * @author Max Carter
 * @since 06/06/2020
 */
class ClientCreationName : Initializable, ProgressivePane {
    @FXML
    lateinit var forename: TextField

    @FXML
    lateinit var surname: TextField

    @FXML
    lateinit var companyName: TextField

    @FXML
    lateinit var activityName: TextField

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        TextFieldUtils.addTextFieldValidator(forename, surname, companyName, activityName)
    }

    override fun onRequestProgression(): Boolean {
        return InputValidation.isNotEmpty(forename, surname, companyName, activityName)
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf(
            DataPoint(
                ClientConstant.KEY_NAME,
                forename.text.plus(" ").plus(surname.text)
            ),
            DataPoint(ClientConstant.KEY_COMPANY, companyName.text),
            DataPoint(ClientConstant.KEY_ACTIVITY, activityName.text)
        )
    }

    override fun onProgressionDenied() {
        for (field in arrayOf(forename, surname, companyName, activityName)) {
            if (field.text.isBlank()) {
                TextFieldUtils.flagEmpty(field)
            } else {
                TextFieldUtils.unFlag(field)
            }
        }
    }

    override fun onViewUpdate(dataPoints: List<DataPoint>) {
    }
}