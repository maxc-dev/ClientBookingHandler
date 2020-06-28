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
class ClientCreationContact : Initializable, ProgressivePane {
    @FXML
    lateinit var email: TextField

    @FXML
    lateinit var phone: TextField

    @FXML
    lateinit var postcode: TextField

    @FXML
    lateinit var address: TextField

    override fun initialize(location: URL?, resources: ResourceBundle?) {
        TextFieldUtils.addTextFieldValidator(email, phone, postcode, address)
    }

    override fun onRequestProgression(): Boolean {
        return InputValidation.isNotEmpty(email, phone, postcode, address)
    }

    override fun getDataPoints(): Array<DataPoint> {
        return arrayOf(
            DataPoint(ClientConstant.KEY_EMAIL, email.text),
            DataPoint(ClientConstant.KEY_PHONE, phone.text),
            DataPoint(
                ClientConstant.KEY_ADDRESS,
                address.text.plus(" ").plus(postcode.text)
            )
        )
    }

    override fun onProgressionDenied() {
        for (field in arrayOf(email, phone, postcode, address)) {
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